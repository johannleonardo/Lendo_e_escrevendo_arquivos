package padrao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Estoque {
	private Produto[] produtos;
	private BufferedReader br;
	
	public Estoque(String nomeArquivoEstoque) {
		preencheEstoque(nomeArquivoEstoque);
	}

	public Produto[] getProdutos() {
		return produtos;
	}
	
	public void preencheEstoque(String nomeArquivo) {
	  try {
		FileReader fr = new FileReader(nomeArquivo);
		br = new BufferedReader(fr);
		
		int qtdProdutos = 0;
		
		String line = br.readLine();
		while(line != null) {
			qtdProdutos++;
			line = br.readLine();
		}
		
		System.out.println("Quantidade de produtos: "+qtdProdutos);
		
		br.close();
		
		produtos = new Produto[qtdProdutos-1];
		
		System.out.println("Quantidade de produtos no arquivo: "+produtos.length);
		
		fr = new FileReader(nomeArquivo);
		br = new BufferedReader(fr);
		
		br.readLine();
		
		for(int i=0; i<produtos.length; i++) {
			line = br.readLine();
			String[] separada = line.split("\\s\\*\\s");
			String produto = separada[0];
			String descricao = separada[1];
			double preco = Double.parseDouble(separada[2]);
			if(separada[3].equalsIgnoreCase("Alimento")) {
				String dataValidade = separada[4];
				produtos[i] = new Alimento(produto, descricao, preco, dataValidade);
			}else if(separada[3].equalsIgnoreCase("Vestuario")) {
				int qtdEstoque = Integer.parseInt(separada[4]);
				produtos[i] = new Vestuario(produto, descricao, preco, qtdEstoque);
			}else if(separada[3].equalsIgnoreCase("Eletrodomestico")) {
				double valorAdicionalIPI = Double.parseDouble(separada[4]);
				produtos[i] = new Eletrodomesticos(produto, descricao, preco, valorAdicionalIPI);
			}
		}
		br.close();
	  }catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
