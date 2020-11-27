package javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio10 {

	public static void main(String[] args) throws IOException {
		// 10
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);

		ArrayList<Integer> habitantes = new ArrayList<>();
		int i = 1;
		
		Random aleatorio = new Random();
		
		while (i <= 5) {
			int numero = aleatorio.nextInt(100000 - 50000 + 1) + 50000;
			habitantes.add(numero);
			i++;
		}
		
		ArrayList<String> letras = new ArrayList<>();
		String cidade = "";
		int j = 0;
		
		for (j = 1; j < 201; j++) {
			int numero = aleatorio.nextInt(90 - 65 + 1) + 65;
			char letra = (char) numero;
			String conjuntoLetras = String.valueOf(letra);
			letras.add(conjuntoLetras);
		}
				
		for (String letra : letras) {
			cidade += letra;
		}
		
		String cidade1 = cidade.substring(0, 40);
		String cidade2 = cidade.substring(40, 80);
		String cidade3 = cidade.substring(80, 120);
		String cidade4 = cidade.substring(120, 160);
		String cidade5 = cidade.substring(160, 200);
		
		Collections.sort(habitantes);
		
		ArrayList<String> informacoes = new ArrayList<>();
		informacoes.add("Cidade 1: " + cidade1 + " - Habitantes: " + habitantes.get(0));
		informacoes.add("Cidade 2: " + cidade2 + " - Habitantes: " + habitantes.get(1));
		informacoes.add("Cidade 3: " + cidade3 + " - Habitantes: " + habitantes.get(2));
		informacoes.add("Cidade 4: " + cidade4 + " - Habitantes: " + habitantes.get(3));
		informacoes.add("Cidade 5: " + cidade5 + " - Habitantes: " + habitantes.get(4));
		
		for (String info : informacoes) {
			escrever.write(info + " - ");
		}
		
		escrever.close();
			
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		}
		
		ler.close();
		leitura.close();
		
		File arquivo2 = new File("C:\\Users\\Debora\\arquivo2.txt");
		
		existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo2.txt"));
		
		String ultimo = informacoes.get(4);
		escrever.write(ultimo);
		
		ler = new FileReader(arquivo2);
		leitura = new BufferedReader(ler);
		
		escrever.close();
			
		linha = leitura.readLine();
		
		System.out.println();
		System.out.print("Cidade mais populosa: ");
		if (linha != null) {
			System.out.println(linha);
		}
		
		ler.close();
		leitura.close();
	}

}
