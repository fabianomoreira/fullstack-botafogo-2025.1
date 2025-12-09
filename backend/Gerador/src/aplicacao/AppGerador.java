package aplicacao;

import java.util.Scanner;

import negocio.Captcha;

public class AppGerador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Captcha captcha = new Captcha();
		
		String entrada = null;
		String codigo = captcha.gerarCaptcha();
		
		System.out.println("Captcha: " + codigo);
		System.out.println("Digite o código acima: ");
		entrada = sc.next();
		
		if(entrada.equals(codigo)) {
			System.out.println("Parabéns!");
		} else {
			System.out.println("Erro! Você não sabe digitar");
		}
			
		
	}

}
