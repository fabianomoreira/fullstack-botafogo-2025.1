package visao;

import java.util.Scanner;

import controle.AgendaControle;

public class AppAgenda {

	public static void main(String[] args) {
		
		/*
		 * Implementar as opções de Alterar
		 * e excluir
		 * 
		 * Lembrem-se... é necessário criar um 
		 * identificador para o cliente pois
		 * ele será o critério de busca
		 */
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		AgendaControle controle = new AgendaControle();
		
		do {
			System.out.println("A   G   E   N   D   A");
			System.out.println("---------------------");
			System.out.println("1. INCLUIR");
			System.out.println("2. ALTERAR");
			System.out.println("3. LISTAR NOMES");
			System.out.println("4. EXCLUIR");
			System.out.println("0. SAIR");
			System.out.println("");
			System.out.println("-> Digite a Opção:");
			opcao = sc.nextInt();
			
			controle.verificarOpcao(opcao);
			
		} while (opcao != 0);
	}

}
