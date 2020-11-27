package javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) throws IOException {
		// 19
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> notas = new ArrayList<Integer>();

		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i < 5; i++) {
			System.out.println();
			System.out.println("Digite um nome: ");
			String nome = teclado.next();
			nomes.add(nome);
			
			System.out.println("Digite uma nota: ");
			int nota = teclado.nextInt();
			notas.add(nota);
		}
		
		System.out.println();
		Collections.sort(notas);
		
		String nomeNota = "Nome: " + nomes.get(nomes.size() - 1) + " - Nota: " + notas.get(notas.size() - 1);
		escrever.write(nomeNota);
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		}
		
		ler.close();
		leitura.close();
	}

}
