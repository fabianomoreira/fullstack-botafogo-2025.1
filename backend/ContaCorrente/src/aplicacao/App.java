package aplicacao;

import model.Conta;
import model.ContaComum;
import model.ContaEspecial;
import model.ContaPoupanca;

public class App {

	public static void main(String[] args) {
		ContaPoupanca poupanca = new ContaPoupanca();
		
		poupanca.cadastrarConta("2342-9", 100d, "Roberto Casemiro");
		System.out.println(poupanca.getNomeCliente());
		poupanca.depositar(50d);
		System.out.println("O saldo é : " + poupanca.consultarSaldo());
		poupanca.setRendimento(0.6d);
		poupanca.calcularRendimento();
		System.out.println("O saldo é : " + poupanca.consultarSaldo());
		
		System.out.println("------------------------------------------------------");
		
		ContaEspecial especial = new ContaEspecial();
		
		especial.cadastrarConta("2222-3", 0d, "Joaquim das Couves");
		especial.alterarLimite(5000d);
		System.out.println("O saldo é : " + especial.consultarSaldo());
	
		System.out.println(especial.getNomeCliente());
		System.out.println("Limite da conta : " + especial.getLimite());
		especial.sacar(4000d);
		System.out.println("O saldo é : " + especial.consultarSaldo());	
		
		System.out.println("------------------------------------------------------");
		
		Conta comum = new ContaComum();
		
		comum.cadastrarConta("123-4", 1000d, "João das Candongas");
		
		System.out.println(comum.getNomeCliente());
		System.out.println("O saldo é : " + comum.consultarSaldo());
		
		comum.depositar(50d);
		System.out.println("O saldo é : " + comum.consultarSaldo());
		
		comum.depositar(500d);
		System.out.println("O saldo é : " + comum.consultarSaldo());	
		
		comum.sacar(2000d);
		System.out.println("O saldo é : " + comum.consultarSaldo());	

	}

}
