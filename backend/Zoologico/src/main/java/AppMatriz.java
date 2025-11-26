
public class AppMatriz {

	public static void main(String[] args) {
		Cachorro[] filhotes;
		
		filhotes = new Cachorro[3];
		
		filhotes[0] = new Cachorro();
		filhotes[1] = new Cachorro();
		filhotes[2] = new Cachorro();
		
		filhotes[0].setTamanho(20);
		filhotes[1].setTamanho(4);
		filhotes[2].setTamanho(65);
		
		/*
		filhotes[1].emitirSom(2);
		filhotes[0].emitirSom(1);
		filhotes[2].emitirSom(1);
		*/
		//for aperfeiçoado
		for(Cachorro toto:filhotes) {
			toto.emitirSom(1);
			toto.correr();
		}
	}

}
