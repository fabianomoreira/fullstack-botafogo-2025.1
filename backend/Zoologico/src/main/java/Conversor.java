
public class Conversor {

	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		} catch(NullPointerException e) {
			System.out.println("A variável está nula");
			System.out.println(e.getMessage());
			frase = "valor nulo";
			novaFrase = frase.toUpperCase();
		} catch(Exception e) {
			System.out.println("Ocorreu outra exceção");
		}
		
		System.out.println("Frase antiga : " + frase);
		System.out.println("Frase nova   : " + novaFrase);
	}

}
