package javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio2 {

	public static void main(String[] args) throws IOException {
		// 02
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		int contador = 0;
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {
			
		}
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		while (linha != null) {
			contador++;
			linha = leitura.readLine();
		}
		
		System.out.println("Número de linhas: " + contador);

	}

}
