package aplicacao;

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
	}

}
