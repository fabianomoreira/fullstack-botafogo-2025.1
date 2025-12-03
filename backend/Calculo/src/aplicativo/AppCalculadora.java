package aplicativo;

import negocio.Calculadora;

public class AppCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		c.setValor1(6);
		c.setValor2(8);
		
		System.out.println("A soma é " + c.somar());
		System.out.println("A multiplicação é " + c.multiplicar());
		
	}

}
