package servico;

import java.sql.Connection;
import java.util.List;

import dao.Dao;
import dao.PessoaDAO;
import modelo.Pessoa;

public class PessoaServico {
	PessoaDAO dao = new PessoaDAO();
	
	public void testarConexao() {
		System.out.println(Dao.getStatus());
		
		Connection conexao = Dao.getConexao();
		
		System.out.println(Dao.getStatus());
	}
	
	public boolean incluir(Pessoa pessoa) {
		return dao.incluir(pessoa);
	}
	
	public boolean alterar(Pessoa pessoa) {
		return dao.alterar(pessoa);
	}
	
	public void listar() {
		List<Pessoa> pessoas = dao.listar();
		
		for(Pessoa p: pessoas) {
			System.out.println(p);
		}
	}
}
