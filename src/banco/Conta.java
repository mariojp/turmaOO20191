package banco;

import java.math.BigDecimal;

public abstract class Conta {

	protected String numero;
	protected String agencia;
	protected String nome;
	protected BigDecimal saldo;
	
	

	
	public Conta(String nome, String agencia, String numero) {
		this.nome = nome;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = BigDecimal.ZERO;
	}

	public boolean deposito(BigDecimal valor) {
		this.saldo = this.saldo.add(valor);
		return true;
	}
	
	public BigDecimal consultarSaldo() {
		return this.saldo;
	}
	
	
	public abstract boolean saque(BigDecimal valor);
	

	
	
	public boolean tranferencia(Conta conta, BigDecimal valor) {
		boolean sucesso = false;
		//saque da minha conta
		sucesso = saque(valor);
		//se ok
		if(sucesso) {
			//deposite na outra conta
			sucesso = conta.deposito(valor);
			//se erro no deposito
			if(!sucesso) {
				//devolve a minha conta
				this.deposito(valor);
			}
		}
		return sucesso;
	}
	
	
	

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Conta other = (Conta) obj;
		return (this.numero.equals(other.numero) && this.agencia.equals(other.agencia));
	}



}