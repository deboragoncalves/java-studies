package javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Exercicio16 {

	public static void main(String[] args) throws IOException {
		// 16
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		
		Random aleatorio = new Random();
		
		for (int i = 0; i < 10; i++) {
			int numero = aleatorio.nextInt(10) + 0;
			String binario = Integer.toBinaryString(numero);
			escrever.write(binario + " ");
		}
		
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		}

	}

}
