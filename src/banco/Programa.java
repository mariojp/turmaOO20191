package banco;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Programa {

	
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		ContaCorrente joao1 = new ContaCorrente("Joao","1","1");
		
		banco.adicionarConta(joao1);
		
		
		
		ContaCorrente joao2 = new ContaCorrente("Joao","2","2");
		
		banco.adicionarConta(joao2);
		
		ContaCorrente joao3 = new ContaCorrente("Joao","2","2");
		banco.adicionarConta(joao3);
		
		System.out.println("Contas : "+banco.getLista().size());
		
		System.out.println(joao1);
		System.out.println(joao2);
		
		
		System.out.println(joao1.consultarSaldo());
		joao1.deposito(BigDecimal.TEN);
		System.out.println(joao1.consultarSaldo());
		joao1.saque("5.00");
		System.out.println("Saldo Joao 1: "+joao1.consultarSaldo());
		System.out.println("Saldo Joao 2: "+joao2.consultarSaldo());
		joao1.tranferencia(joao2, new BigDecimal("3.00"));
		System.out.println("Saldo Joao 1: "+joao1.consultarSaldo());
		System.out.println("Saldo Joao 2: "+joao2.consultarSaldo());
		
		
		Conta cc = banco.obterConta("1", "1");
		System.out.println("Saldo "+cc.consultarSaldo());
		
		cc.deposito(BigDecimal.TEN);
		
		System.out.println("Saldo Joao 1: "+joao1.consultarSaldo());
		
		
		
		Conta contaCorrente = new ContaCorrente("CC", "4", "4");
		contaCorrente.deposito(BigDecimal.TEN);
		Conta contaPoupanca = new ContaPoupanca("CP","5","5");
		contaPoupanca.deposito(BigDecimal.TEN);
		
		contaCorrente.saque(new BigDecimal(5));
		contaPoupanca.saque(new BigDecimal(5));

		banco.adicionarConta(contaPoupanca);
		banco.adicionarConta(contaCorrente);
		
		for(Conta c : banco.getLista()) {
			System.out.println(c.toString());
		}
		
		for(Conta c : banco.getLista()) {
			System.out.println(c.deposito(new BigDecimal(50.0)));
		}
		
		for(Conta c : banco.getLista()) {
			System.out.println(c.toString());
		}
		
		for(Conta c : banco.getLista()) {
			System.out.println(c.saque(new BigDecimal(60.0)));
		}
		
	}
}

