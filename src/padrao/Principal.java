package padrao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {

	public static void main(String[] args) {
		Estoque e = new Estoque("produtos.txt");
		
		String gravaArquivo = "";
		
		Produto[] produtos = e.getProdutos();
		
		gravaArquivo += "Informação do alimento mais caro:\n";
		int posicaoAlimentoMaisCaro = -1;
		
		for(int i=0; i<produtos.length; i++) {
			if(produtos[i] instanceof Alimento) {
				posicaoAlimentoMaisCaro = i;
				break;
			}
		}
		
		if(posicaoAlimentoMaisCaro == -1) {
			gravaArquivo += "Não existem produtos do tipo alimento\n";
		}else{
			for(int i=0; i<produtos.length; i++) {
				if(produtos[i] instanceof Alimento) {
					if(produtos[i].getPreco() > produtos[posicaoAlimentoMaisCaro].getPreco()) {
						posicaoAlimentoMaisCaro = i;
					}
				}
			}
			gravaArquivo += produtos[posicaoAlimentoMaisCaro]+"\n";
		}
		
		gravaArquivo += "Informação do eletrodoméstico mais barato:\n";
		int posicaoEletroMaisBarato = -1;
		
		for(int i=0; i<produtos.length; i++) {
			if(produtos[i] instanceof Eletrodomesticos) {
				posicaoEletroMaisBarato = i;
				break;
			}
		}
		
		if(posicaoEletroMaisBarato == -1) {
			gravaArquivo += "Não existem produtos do tipo eletrodoméstico\n";
		}else{
			for(int i=0; i<produtos.length; i++) {
				if(produtos[i] instanceof Eletrodomesticos) {
					if(produtos[i].getPreco() > produtos[posicaoEletroMaisBarato].getPreco()) {
						posicaoEletroMaisBarato = i;
					}
				}
			}
			gravaArquivo += produtos[posicaoEletroMaisBarato]+"\n";
		}
		
		gravaArquivo += "Informação do nome e a quantidade em estoque de todos os produtos de vestuário :\n";
		
		for(int i=0; i<produtos.length; i++) {
			if(produtos[i] instanceof Vestuario) {
				gravaArquivo += produtos[i].getNome()+" | Quantidade em estoque: "+((Vestuario) produtos[i]).getQtdEstoque()+"\n";
			}
		}
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			 fw = new FileWriter("info.txt");
			 pw = new PrintWriter(fw);
			 
			 pw.write(gravaArquivo);
			 
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			pw.close();
		}
	}
}



