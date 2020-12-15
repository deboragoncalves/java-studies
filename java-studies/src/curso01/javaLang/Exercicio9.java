package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio9 {

	public static void main(String[] args) throws IOException {
		// 09
		
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

		ArrayList<String> letrasArquivo = new ArrayList<>();
		
		for (char i = 65; i < 75; i++) {
			String letra = String.valueOf(i);
			letrasArquivo.add(letra);
			escrever.write(letra + " ");
		}
		
		escrever.close();
		
		String linha = leitura.readLine();
		
		System.out.print("Arquivo 1: ");
		if (linha != null) {
			System.out.println(linha);
		}
		
		System.out.println();
		
		File arquivo2 = new File("C:\\Users\\Debora\\arquivo2.txt");

		existe = arquivo2.exists();

		try {
			if (!existe) {
				arquivo2.createNewFile();
			}
		} catch (IOException e) {

		}

		escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo2.txt"));
				
		ler = new FileReader(arquivo2);
		leitura = new BufferedReader(ler);

		ArrayList<String> letrasArquivo2 = new ArrayList<>();
		
		for (char i = 75; i < 91; i++) {
			String letra = String.valueOf(i);
			letrasArquivo2.add(letra);
			escrever.write(letra + " ");
		}
		
		escrever.close();
		
		linha = leitura.readLine();
		
		System.out.print("Arquivo 2: ");
		if (linha != null) {
			System.out.println(linha);
		}
		
		System.out.println();
		
		File arquivo3 = new File("C:\\Users\\Debora\\arquivo3.txt");

		existe = arquivo3.exists();

		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}

		escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo3.txt"));
				
		ler = new FileReader(arquivo3);
		leitura = new BufferedReader(ler);
		
		for (String letra : letrasArquivo) {
			escrever.write(letra + " ");
		}
		
		for (String letra : letrasArquivo2) {
			escrever.write(letra + " ");
		}
		
		escrever.close();
		
		linha = leitura.readLine();
				
		System.out.print("Arquivo 3: ");
		if (linha != null) {
			System.out.println(linha);
		}
		
		/*
		 * String letra = String.valueOf(i);
			letrasArquivo.add(letra);
			escrever.write(letra + " ");
		 */

	}

}
