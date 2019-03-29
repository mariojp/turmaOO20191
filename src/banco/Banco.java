package banco;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Conta> lista = new ArrayList<Conta>();

	public ArrayList<Conta> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Conta> lista) {
		this.lista = lista;
	}

	public void adicionarConta(Conta cc) {
		if (!this.lista.contains(cc)) {
			this.lista.add(cc);
		}
	}

	public void remove(Conta cc) {
		this.lista.remove(cc);
	}

	public Conta obterConta(String numero, String agencia) {
		Conta exemplo = new ContaCorrente("", agencia, numero);
		int index = this.lista.indexOf(exemplo);
		if (index != -1) {
			return this.lista.get(index);
		} else {
			return null;
		}
	}

}
