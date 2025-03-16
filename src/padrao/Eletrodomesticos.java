package padrao;

public class Eletrodomesticos extends Produto {
	private double valorAdicionalIPI;

	public Eletrodomesticos(String nome, String descricao, double preco, double valorAdicionalIPI) {
		super(nome, descricao, preco);
		this.valorAdicionalIPI = valorAdicionalIPI;
	}

	public double getValorAdicionalIPI() {
		return valorAdicionalIPI;
	}

	public void setValorAdicionalIPI(double valorAdicionalIPI) {
		this.valorAdicionalIPI = valorAdicionalIPI;
	}

	@Override
	public String toString() {
		return "Eletrodomesticos [valorAdicionalIPI=" + valorAdicionalIPI + "]";
	}
	

}
