package model;

public abstract class Conta {
	private String numero;
	private Double saldo;
	private String nomeCliente;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void cadastrarConta(String numero, Double saldo, String nome) {
		this.numero = numero;
		this.nomeCliente = nome;
		this.saldo = saldo;
	}
	
	public Double consultarSaldo() {
		return saldo;
	}
	
	public void depositar(Double valor) {
		saldo = saldo + valor;
	}
	
	public void sacar(Double valor) {
		if(valor > saldo) {
			System.out.println("Você não tem saldo suficiente para o saque (" + valor + ")");
		} else {
			saldo = saldo - valor;
		}
	}
}
