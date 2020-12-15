package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) throws IOException {
		// 18
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		ArrayList<String> informacoes = new ArrayList<String>();
		double total = 0.0;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i < 5; i++) {
			System.out.println();
			System.out.println(i + " - Escreva o nome de um produto: ");
			String nome = teclado.next();
			
			System.out.println(i + " - Escreva o pre�o de um produto: ");
			double preco = teclado.nextDouble();
			total += preco;
			
			String info = "Produto: " + nome + " - Pre�o: " + String.valueOf(preco);
			informacoes.add(info);
		}
		
		for (String info : informacoes) {
			escrever.write(info + " | ");
		}
		
		escrever.write("Total: " + String.valueOf(total));
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		System.out.println();
		if (linha != null) {
			System.out.println(linha);
		}
		
		ler.close();
		leitura.close();
		teclado.close();
	}

}
