package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) throws IOException {
		// 22
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		System.out.println("Digite um nome: ");
		String nome = teclado.next();
		String informacoes = "Nome: " + nome + " - Notas: ";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite uma nota: ");
			int nota = teclado.nextInt();
			notas.add(nota);
		}
		
		Collections.sort(notas);
		for (int nota : notas) {
			String numero = String.valueOf(nota);
			informacoes += numero + ", ";
		}
		
		escrever.write(informacoes);
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		}
		
		ler.close();
		leitura.close();
		teclado.close();
	}

}
