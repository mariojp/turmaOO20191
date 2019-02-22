package br.ucsal.agenda;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		//declarei
		Agenda minhaAgenda = null;
		
		//instancia e inicializei a variavel;
		minhaAgenda= new Agenda();
		//criei a lista da agenda
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = scanner.nextLine();
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("Digite o telefone: ");
		String telefone = scanner.nextLine();
		minhaAgenda.inserirContato(new Contato(nome, telefone));
		
		
		minhaAgenda.inserirContato(new Contato("Pedro","5555-5555"));
		Contato contato = new Contato("Maria","8888-8888");
		minhaAgenda.inserirContato(contato);
		Contato busca = minhaAgenda.buscarContato(new Contato("Pedro","5555-5555"));
		System.out.println(busca.nome);
		
		Contato pedro1 = new Contato("Pedro","5555-5555");
		Contato pedro2 = new Contato("Pedro","5555-6666");
		
		if(pedro1.equals(pedro2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		
		
	}
}
