
public class Palavra {
	
	
	private String palavra;
	private int quantidade;
	
	
	public Palavra(String palavra) {
		this.palavra = palavra;
	}
	
	public String getPalavra() {
		return palavra;
	}
	
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public boolean equals(Object obj) {
		Palavra palavra = (Palavra) obj;
		return this.palavra.equalsIgnoreCase(palavra.palavra);
		//return super.equals(obj);
	}
	
	
	
}
