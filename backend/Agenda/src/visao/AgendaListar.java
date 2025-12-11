package visao;

import java.util.List;

import modelo.Cliente;

public class AgendaListar {
	public void listarClientes(List<Cliente> clientes) {
		for(Cliente cliente: clientes) {
			System.out.println("Nome : " + cliente.getNome());
		}
	}
}
