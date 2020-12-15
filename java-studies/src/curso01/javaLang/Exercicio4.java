package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio4 {

	public static void main(String[] args) throws IOException {
		// 04

		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");

		boolean existe = arquivo.exists();
		int vogais = 0;
		int consoantes = 0;

		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}

		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);

		String linha = leitura.readLine();
		ArrayList<String> letras = new ArrayList<>();

		while (linha != null) {
			letras.add(linha);
			linha = leitura.readLine();
		}

		for (String letra : letras) {
			if (letra.equals("A") || letra.equals("U") || letra.equals("O") || letra.equals("E") || letra.equals("I")) {
				vogais++;
			} else {
				consoantes++;
			}
		}

		System.out.println("N�mero de vogais: " + vogais);
		System.out.println("N�mero de consoantes: " + consoantes);

	}

}
