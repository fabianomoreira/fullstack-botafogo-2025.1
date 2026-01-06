package model;

public class ContaEspecial extends Conta {
	private Double limite;

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void alterarLimite(Double novoLimite) {
		this.limite = novoLimite;
	}
	
	public void sacar(Double valor) {
		if(valor > this.getSaldo() + limite) {
			System.out.println("Você não tem saldo suficiente para o saque (" + valor + ")");
		} else {
			setSaldo((this.getSaldo() + limite) - valor);
		}
	}
}
