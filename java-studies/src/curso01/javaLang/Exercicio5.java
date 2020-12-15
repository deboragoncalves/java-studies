package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) throws IOException {
		// 05
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		int contador = 0;
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = teclado.nextLine();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);

		String linha = leitura.readLine();
		
		while (linha != null) {
			if (linha.equals(letra)) {
				contador++;
			}
			
			linha = leitura.readLine();
		}
		
		System.out.println("A letra " + letra + " aparece " + contador + " vezes no arquivo.");

	}

}
