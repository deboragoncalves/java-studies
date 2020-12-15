package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) throws IOException {
		// 11
		
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
		
		ArrayList<String> times = new ArrayList<String>();
		
		times.add("S�o Paulo");
		times.add("Flamengo");
		times.add("Corinthians");
		times.add("S�o Paulo");
		
		for (String time : times) {
			escrever.write(time + " ");
		}
		
		escrever.close();
		
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva um time de futebol: ");
		String time = teclado.nextLine();
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			if (times.contains(time)) {
				contador++;
			}
			System.out.println("O " + time + " aparece " + contador + " vezes no arquivo.");
		}
		
		ler.close();
		leitura.close();
		teclado.close();
	}

}
