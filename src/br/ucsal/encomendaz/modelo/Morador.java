package br.ucsal.encomendaz.modelo;

public class Morador {

	
	private String Nome;
	private String email;
	private String telefone;
	private Boolean associado;
	private Endereco endereco;
	
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Boolean getAssociado() {
		return associado;
	}
	public void setAssociado(Boolean associado) {
		this.associado = associado;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}

