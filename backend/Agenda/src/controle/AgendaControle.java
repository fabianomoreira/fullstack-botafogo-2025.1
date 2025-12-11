package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import visao.AgendaInclusao;
import visao.AgendaListar;

public class AgendaControle {
	public List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void verificarOpcao(int opcao) {
		if (opcao == 1) {
			AgendaInclusao inclusao = new AgendaInclusao();
			clientes.add(inclusao.desenharInclusao());
		} else if (opcao == 3) {
			AgendaListar listar = new AgendaListar();
			listar.listarClientes(clientes);
		}
	}
}
