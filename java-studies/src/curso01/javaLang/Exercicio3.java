package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio3 {

	public static void main(String[] args) throws IOException {
		// 03
		
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
		ArrayList<String> letras = new ArrayList<>();
				
		while (linha != null) {
			letras.add(linha);
			linha = leitura.readLine();
		}
		
		System.out.println();
		System.out.println("Vogais: ");
		for (String letra : letras) {
			if (letra.equals("A") || letra.equals("U") || letra.equals("O") || letra.equals("E") || letra.equals("I")) {
				contador++;
				System.out.println(letra);
			}
		}
		
		System.out.println();
		System.out.println("N�mero de vogais: " + contador);
		
	}

}
