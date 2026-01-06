package model;

public class ContaPoupanca extends Conta{
	private Double rendimento;

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void calcularRendimento() {
		this.setSaldo((this.getSaldo() * rendimento / 100) + this.getSaldo());
	}
}
