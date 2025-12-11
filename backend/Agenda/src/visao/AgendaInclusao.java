package visao;

import java.util.Scanner;

import modelo.Cliente;

public class AgendaInclusao {
	public Cliente desenharInclusao() {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		String nome, endereco, telefone;
		
		System.out.println("I N C L U S Ã O");
		System.out.println("---------------");
		System.out.println("Nome : ");
		nome = sc.nextLine();
		System.out.println("Endereço :");
		endereco = sc.nextLine();
		System.out.println("Telefone :");
		telefone = sc.nextLine();
		
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		
		return cliente;
		
	}
}
