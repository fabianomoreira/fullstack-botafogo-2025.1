package negocio;

import java.util.Random;

public class Captcha {
	private String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
	private int tamanhoCaptcha = 6;
	
	public Captcha() {
		
	}
	
	public Captcha(int tamanhoCaptcha) {
		this.tamanhoCaptcha = tamanhoCaptcha;
	}
	
	public String gerarCaptcha() {
		Random aleatorio = new Random();
		String resultado = "";
		
		for(int i = 0; i < this.tamanhoCaptcha; i++) {
			resultado += caracteres.charAt(aleatorio.nextInt(caracteres.length()));
		}
		
		return resultado;
	}
}
