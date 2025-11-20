
public class Cachorro {
	private int peso;
	private String cor;
	private int tamanho;
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	void emitirSom(int valor) {
		if (tamanho > 60) {
			for(int i = 0; i < valor; i++) {
				System.out.println("Woof!! Woof!!");
			}
		} else if(tamanho > 14){
			for(int i = 0; i < valor; i++) {			
				System.out.println("Ruff!! Ruff!!");
			}
		} else {
			for(int i = 0; i < valor; i++) {
				System.out.println("Yip! Yip!");
			}
		}
	}
}
