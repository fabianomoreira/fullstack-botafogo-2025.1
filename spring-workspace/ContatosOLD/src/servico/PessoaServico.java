package servico;

import java.sql.Connection;
import java.util.List;

import dao.Dao;
import dao.PessoaDAO;
import modelo.Pessoa;

public class PessoaServico {
	PessoaDAO dao = new PessoaDAO();
	
	public List<Pessoa> buscar(String criterio){
		return dao.buscar(criterio);
	}
	
	public Pessoa buscarPorId(int id) {
		return dao.buscarPorId(id);
	}
	
	public boolean excluir(int id) {
		return dao.excluir(id);
	}
	
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
