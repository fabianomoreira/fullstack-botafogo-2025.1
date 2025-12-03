package negocio;

public class CalculadoraCientifica extends Calculadora {
	private double acumulador;
	
	public double getAcumulador() {
		return acumulador;
	}

	public void setAcumulador(double acumulador) {
		this.acumulador = acumulador;
	}
	
	public void limpar() {
		this.acumulador = 0;
	}
	
	public double somar(double valor) {
		this.acumulador = this.acumulador + valor;
		return this.acumulador;
	}
	
	public double subtrair(double valor) {
		this.acumulador = this.acumulador - valor;
		return this.acumulador;
	}	
	
	public double multiplicar(double valor) {
		this.acumulador = this.acumulador * valor;
		return this.acumulador;
	}	

	public double dividir(double valor) {
		this.acumulador = this.acumulador / valor;
		return this.acumulador;
	}	
	
	public double calcularPotencia() {
		double resultado = Math.pow(getValor1(), getValor2());
		
		return resultado;
	}

	public double calcularPotencia(double valor) {
		this.acumulador = Math.pow(this.acumulador, valor);
		
		return this.acumulador;
	}
	
	public double calcularRaiz(String tipo) {
		if(tipo.equals("B")) {
			return Math.sqrt(getValor1());
		} else {
			return Math.sqrt(this.acumulador);		
		}
				
	}
}
