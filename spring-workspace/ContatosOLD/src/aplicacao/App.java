package aplicacao;

import java.util.List;

import modelo.Pessoa;
import servico.PessoaServico;

public class App {

	public static void main(String[] args) {
		PessoaServico servico = new PessoaServico();

		System.out.println("------------------------------ LISTAR");
		servico.listar();

		System.out.println("------------------------------ INCLUIR");
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Luciano Almeida");
		pessoa.setCidade("Rio de Janeiro");
		
		servico.incluir(pessoa);
		
		System.out.println("------------------------------ LISTAR");
		servico.listar();
		
		System.out.println("------------------------------ ALTERAR");
		Pessoa pessoaAlt = new Pessoa();
		
		pessoaAlt.setId(6);
		pessoaAlt.setNome("Luciano das Couves");
		pessoaAlt.setCidade("Rio de Janeiro");
		
		servico.alterar(pessoaAlt);

		System.out.println("------------------------------ LISTAR");
		servico.listar();
		
		System.out.println("------------------------------ EXCLUIR");
		servico.excluir(13);
		
		System.out.println("------------------------------ LISTAR");
		servico.listar();
		
		System.out.println("------------------------------ CONSULTAR POR ID");
		Pessoa pessoaConsulta = servico.buscarPorId(1);
		
		if(pessoaConsulta.getId() <= 0) {
			System.out.println("Registro não encontrado!");
		} else {
			System.out.println(pessoaConsulta);
		}
		
		System.out.println("------------------------------ CONSULTAR POR CRITÉRIO");
		List<Pessoa> lista = servico.buscar("Luc");
		
		if(lista.isEmpty()) {
			System.out.println("Não existem registros que atendam ao critério informado!");
		} else {
			System.out.println(lista);
		}
	}

}
