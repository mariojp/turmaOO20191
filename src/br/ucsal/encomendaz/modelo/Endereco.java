package br.ucsal.encomendaz.modelo;

import java.util.ArrayList;
import java.util.List;

public class Endereco {

	
	private String rua;
	private String numero;
	private String complemento;
	private String cep;
	private List<Encomenda> encomendas = new ArrayList<Encomenda>();
	private List<Morador> moradores = new ArrayList<Morador>();

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public List<Encomenda> getEncomendas() {
		return encomendas;
	}
	public void setEncomendas(List<Encomenda> encomendas) {
		this.encomendas = encomendas;
	}
	public List<Morador> getMoradores() {
		return moradores;
	}
	public void setMoradores(List<Morador> moradores) {
		this.moradores = moradores;
	}
	
	
	
	
	
}
