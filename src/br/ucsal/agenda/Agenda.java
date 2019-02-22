package br.ucsal.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	List<Contato> lista;
	
	public Agenda() {
		lista = new ArrayList<Contato>();
	}
	
	
	public void inserirContato(Contato contato) {
		if(this.buscarContato(contato) == null) {
			lista.add(contato);	
		}
	}
	
	public Contato buscarContato(Contato contato) {
		int pos = lista.lastIndexOf(contato);
		if(pos == -1) {
			return null;
		}
		return lista.get(pos);
	}
}
