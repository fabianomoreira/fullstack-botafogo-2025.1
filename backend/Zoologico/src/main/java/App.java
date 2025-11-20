
public class App {

	public static void main(String[] args) {
		Cachorro um = new Cachorro();
		um.setTamanho(70);
		Cachorro dois = new Cachorro();
		dois.setTamanho(8);
		Cachorro tres = new Cachorro();
		tres.setTamanho(35);
		
		System.out.println("O cachorro tem o tamanho " + um.getTamanho());
		
		um.emitirSom(3);
		dois.emitirSom(5);
		tres.emitirSom(1);
	}

}
