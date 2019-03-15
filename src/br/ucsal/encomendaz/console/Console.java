package br.ucsal.encomendaz.console;

import java.util.Scanner;

import br.ucsal.encomendaz.modelo.Encomenda;
import br.ucsal.encomendaz.modelo.Endereco;
import br.ucsal.encomendaz.modelo.Morador;

public class Console {
	
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		String op = "0";
		
		
		while(!op.equals("0")) {

			System.out.println("1. Cadastrar Morador");
			System.out.println("2. Cadastrar Encomenda");
			System.out.println("0. Sair");

			
			do {
				op = scanner.nextLine();
			}while(!op.contains("0 1 2 3 4 5 6 7 8 9"));
			
			switch (op) {
			case "1":
				
				break;

			case "2":
			default:
				
				break;
			}
		}
		
		Morador morador1 = new Morador();
		morador1.setNome("Joao");
		morador1.setAssociado(true);
		morador1.setTelefone("88888-8888");
		morador1.setEmail("joao@ucsal.br");
		
		Endereco endereco = new Endereco();
		endereco.setRua("Rua da Alegria");
		endereco.setNumero("1");
		endereco.setComplemento("Apt 2");
		endereco.setCep("40000000");
		
		
		//Adiciona um morador a um endereço
		endereco.getMoradores().add(morador1);
		
		
		morador1.setEndereco(endereco);
		
		
		Encomenda encomenda = new Encomenda();
		encomenda.setNome("Joao");
		encomenda.setHora("21:00");
		encomenda.setData("16/03/2019");
		
		encomenda.setEndereco(endereco);
		
		//adiciona uma encomenda a lista de encomendas do endereço
		endereco.getEncomendas().add(encomenda);
		
		
		System.out.println(morador1.getEndereco().getEncomendas());
		
		
		
		
		
		

		
	}
	
	

}
