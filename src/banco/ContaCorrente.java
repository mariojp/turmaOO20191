package banco;

import java.math.BigDecimal;

public class ContaCorrente {

	// - numero : String
	private String numero;
	private String agencia;
	private String nome;
	private BigDecimal saldo;

	public ContaCorrente(String nome) {
		this(nome,"","");
	}

	public ContaCorrente(String nome, String agencia, String numero) {
		this(nome, agencia, numero,BigDecimal.ZERO);
	}
	
	public ContaCorrente(String nome, String agencia, String numero, BigDecimal saldo) {
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
	}
	
	
	public boolean saque(String valor) {
		BigDecimal bigdecimal = new BigDecimal(valor);
		return this.saque(bigdecimal);
	}
	
	public boolean saque(BigDecimal valor) {
		boolean sucesso = false;
		if (! (this.saldo.compareTo(valor) < 0) ) {
			this.saldo = this.saldo.subtract(valor);
			sucesso = true;
		}
		return sucesso;
	
	}
	
	public boolean deposito(BigDecimal valor) {
		this.saldo = this.saldo.add(valor);
		return true;
	}
	
	public BigDecimal consultarSaldo() {
		return this.saldo;
	}
	
	
	public boolean tranferencia(ContaCorrente conta, BigDecimal valor) {
		boolean sucesso = false;
		//saque da minha conta
		sucesso = this.saque(valor);
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
		return "ContaCorrente [numero=" + numero + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo + "]";
	}
	
	
	
	

}
