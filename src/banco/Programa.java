package banco;

import java.math.BigDecimal;

public class Programa {

	
	public static void main(String[] args) {
		ContaCorrente joao1 = new ContaCorrente("Joao");
		
		ContaCorrente joao2 = new ContaCorrente("Joao","","");
		
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
		
		
	}
}

