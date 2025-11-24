
public class Gato {
	private int peso;
	private String cor;
	private int tamanho;
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

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
	
	void comer() {
		System.out.println("comendo...");
	}
	
	void dormir() {
		System.out.println("dormindo...");
	}
	
	void brincar() {
		System.out.println("brincando...");
	}
	
	
}
