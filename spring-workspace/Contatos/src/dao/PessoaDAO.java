package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Pessoa;

public class PessoaDAO {
	public boolean alterar(Pessoa pessoa) {
		boolean resultado = true;
		
		Connection conexao = Dao.getConexao();
		
		String SQL = "UPDATE pessoa SET nome = ?, cidade = ? WHERE id = ?";
		
		PreparedStatement ps;
		
		try {
			ps = conexao.prepareStatement(SQL);
			
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getCidade());
			ps.setInt(3, pessoa.getId());
			
			int i = ps.executeUpdate();
			
			resultado = i > 0 ?  true : false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return resultado;
		
	}
	
	public boolean incluir(Pessoa pessoa){
		boolean resultado = true;
		
		Connection conexao = Dao.getConexao();
		
		String SQL = "INSERT INTO pessoa(nome, cidade) VALUES(?, ?)";
		
		PreparedStatement ps;
		
		try {
			ps = conexao.prepareStatement(SQL);
			
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getCidade());
			
			int i = ps.executeUpdate();
			
			resultado = i > 0 ?  true : false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return resultado;
	}
	
	public List<Pessoa> listar() {
		Connection conexao = Dao.getConexao();
		
		String SQL = "SELECT * FROM pessoa";
		
		PreparedStatement ps;
		List<Pessoa> lista = new ArrayList<Pessoa>();
		Pessoa pessoa;
		
		try {
			ps = conexao.prepareStatement(SQL);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				pessoa = new Pessoa();
				pessoa.setId(rs.getInt("id"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCidade(rs.getString("cidade"));
				
				lista.add(pessoa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
}
