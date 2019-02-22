package br.ucsal.agenda;

public class Contato {
	
	String nome;
	String telefone;

	
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	@Override
	public boolean equals(Object obj) {
		Contato outro = (Contato) obj;
		return this.nome.equalsIgnoreCase(outro.nome);
	}
	
}
