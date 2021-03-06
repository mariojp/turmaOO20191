package banco;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

	private BigDecimal limite = new BigDecimal(1000);
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}


	public boolean saque(String valor) {
		BigDecimal bigdecimal = new BigDecimal(valor);
		return this.saque(bigdecimal);
	}
	
	public boolean saque(BigDecimal valor) {
		boolean sucesso = false;
		if (this.saldo.add(limite).doubleValue() > valor.doubleValue())  {
			this.saldo = this.saldo.subtract(valor);
			sucesso = true;
		}
		return sucesso;

	}


	

	public ContaCorrente(String nome) {
		this(nome,"","");
	}

	public ContaCorrente(String nome, String agencia, String numero) {
		this(nome, agencia, numero,BigDecimal.ZERO);
	}
	
	public ContaCorrente(String nome, String agencia, String numero, BigDecimal saldo) {
		super(nome, agencia, numero);
		this.saldo = saldo;
		
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo + "]";
	}

	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
	

}
