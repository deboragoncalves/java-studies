package javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio6 {

	public static void main(String[] args) throws IOException {
		// 06
		
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
		ArrayList<String> letrasAlfabeto = new ArrayList<>();
		
		for (char i = 65; i <= 90; i++) {
			String letra = String.valueOf(i);
			letrasAlfabeto.add(letra);
		}
		
		System.out.println(letrasAlfabeto);

		while (linha != null) {
			letrasArquivo.add(linha);
			linha = leitura.readLine();
		}
		
		System.out.println(letrasArquivo);
		
		System.out.println();
		System.out.println("Frequência das letras: ");
		for (String letra : letrasAlfabeto) {
			int contador = Collections.frequency(letrasArquivo, letra);
			if (contador != 0) {
				System.out.println("A letra " + letra + " aparece " + contador + " vezes no arquivo.");
			}
		}
		
	}

}
