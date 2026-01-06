package aplicacao;

import java.util.ArrayList;
import java.util.Random;

public class MegaSena {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random rd = new Random();
		int sorteio;
		
		for(int i = 0; i < 6; i++) {
			sorteio = rd.nextInt(60) + 1;
			numeros.add(sorteio);
		}
		
		for(Integer numero: numeros) {
			System.out.print(numero + ", ");
		}
	}

}
