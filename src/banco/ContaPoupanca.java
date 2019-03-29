package banco;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

	private BigDecimal juros;
	
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




	

	public ContaPoupanca(String nome) {
		this(nome,"","");
	}

	public ContaPoupanca(String nome, String agencia, String numero) {
		this(nome, agencia, numero,BigDecimal.ZERO);
	}
	
	public ContaPoupanca(String nome, String agencia, String numero, BigDecimal saldo) {
		super(nome,agencia,numero);
		this.saldo = saldo;
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
	
	public BigDecimal getJuros() {
		return juros;
	}

	public void setJuros(BigDecimal juros) {
		this.juros = juros;
	}
	
	
	@Override
	public String toString() {
		return "ContaPoupanca [numero=" + numero + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo + "]";
	}

}
