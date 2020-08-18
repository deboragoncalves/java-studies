package javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio7 {

	public static void main(String[] args) throws IOException {
		// 07
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");

		boolean existe = arquivo.exists();

		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}

		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);

		String linha = leitura.readLine();
		ArrayList<String> letrasArquivo = new ArrayList<>();
		
		while (linha != null) {
			letrasArquivo.add(linha);
			linha = leitura.readLine();
		}
		
		System.out.print("Arquivo 1: ");
		System.out.println(letrasArquivo);
		
		System.out.println();
				
		File arquivo2 = new File("C:\\Users\\Debora\\arquivo2.txt");
		
		existe = arquivo2.exists();

		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo2.txt"));
		
		for (String letra : letrasArquivo) {
			if (letra.equals("A") || letra.equals("U") || letra.equals("O") || letra.equals("E") || letra.equals("I")) {
				letra = "*";
				escrever.write(letra);
			} else {
				escrever.write(letra);
			}
		}
		
		escrever.close();

		ler = new FileReader(arquivo2);
		leitura = new BufferedReader(ler);

		linha = leitura.readLine();
		ArrayList<String> letrasArquivo2 = new ArrayList<>();
		
		while (linha != null) {
			letrasArquivo2.add(linha);
			linha = leitura.readLine();
		}
		
		System.out.print("Arquivo 2: ");
		System.out.println(letrasArquivo2);

	}

}
