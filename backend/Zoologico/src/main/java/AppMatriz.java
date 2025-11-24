
public class AppMatriz {

	public static void main(String[] args) {
		Cachorro[] filhotes;
		
		filhotes = new Cachorro[3];
		
		filhotes[0] = new Cachorro();
		filhotes[1] = new Cachorro();
		filhotes[2] = new Cachorro();
		
		filhotes[0].setTamanho(20);
		filhotes[1].setTamanho(4);
		filhotes[2].setTamanho(60);
		
		filhotes[1].emitirSom(2);
	}

}
