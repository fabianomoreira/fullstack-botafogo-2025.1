package aplicativo;

import negocio.CalculadoraCientifica;

public class AppCientifica {

	public static void main(String[] args) {
		CalculadoraCientifica ciencia = new CalculadoraCientifica();
		
		System.out.println(ciencia.somar(5));
		System.out.println(ciencia.somar(2));
		System.out.println(ciencia.somar(10));		
		System.out.println(ciencia.subtrair(3));
		System.out.println(ciencia.somar(2));
		System.out.println(ciencia.multiplicar(2));
		System.out.println(ciencia.calcularPotencia(2));
		System.out.println(ciencia.calcularRaiz("C"));
	}

}
