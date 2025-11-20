
public class Exercicio04 {

	public static void main(String[] args) {
		// Imprimir de 1 a 500 mas apenas os números pares
		int numero;
		String demonstracao = "Luciano";
		Integer valor = 60;
		
		
		for(int i = 1; i <= 500; i++) {
			numero = i % 2;
			
			if (numero == 0) {
				System.out.println(i);
			}	
		}
	}

}
