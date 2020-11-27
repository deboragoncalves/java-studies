package javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) throws IOException {
		// 15
		
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
		
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.println("Digite um nome: ");
			String nome = teclado.next();
			System.out.println("Digite um ano de nascimento (AAAA): ");
			int ano = teclado.nextInt();
			
			String infosIdade;
			
			if (ano < 18) {
				infosIdade = "menor de idade";
			} else if (ano > 18) {
				infosIdade = "maior de idade";
			} else {
				infosIdade = "entrando na maior idade";
			}
			
			String informacoes = "Nome: " + nome + " - Maior/menor idade: " + infosIdade;
			escrever.write(informacoes + " | ");
		}
		
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		}
		
		teclado.close();
	}

}
