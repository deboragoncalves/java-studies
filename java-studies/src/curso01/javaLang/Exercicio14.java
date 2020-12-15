package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) throws IOException {
		// 14
		
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
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.println("Digite um nome: ");
			String nome = teclado.next();
			System.out.println("Digite um dia de nascimento (DD): ");
			int dia = teclado.nextInt();
			System.out.println("Digite um m�s de nascimento (MM): ");
			int mes = teclado.nextInt();
			System.out.println("Digite um ano de nascimento (AAAA): ");
			int ano = teclado.nextInt();
			
			String dataCompleta = dia + "/" + mes + "/" + ano;
			String info = nome + " - " + dataCompleta;
			escrever.write(info + " | ");
		}
		
		escrever.close();
		
		String linha = leitura.readLine();
		  
		  if (linha != null) {
			System.out.println(linha);
		}
		
		teclado.close();

	}

}
