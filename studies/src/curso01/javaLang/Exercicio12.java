package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio12 {

	public static void main(String[] args) throws IOException {
		// 12
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		int palavras = 0;
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		ArrayList<String> esportes = new ArrayList<String>();
		esportes.add("Futebol");
		esportes.add("Voleibol");
		esportes.add("Rugby");
		esportes.add("Gin�stica Ol�mpica");
		
		String cadaEsporte;
		for (String esporte : esportes) {
			cadaEsporte = esporte + " ";
			palavras++;
			escrever.write(cadaEsporte);
		}
		
		escrever.close();
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		}
		
		System.out.println();
		System.out.println("O arquivo cont�m " + palavras + " palavras.");
		
		leitura.close();
		ler.close();
	}

}
