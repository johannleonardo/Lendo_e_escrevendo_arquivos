package padrao;

public class Vestuario extends Produto {
	private int qtdEstoque;
	
	public Vestuario(String nome, String descricao, double preco, int qtdEstoque) {
		super(nome, descricao, preco);
		this.qtdEstoque = qtdEstoque;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	@Override
	public String toString() {
		return "Vestuario [qtdEstoque=" + qtdEstoque + "]";
	}
	
	
}
