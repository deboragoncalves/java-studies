package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) throws IOException {
		// 27
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> informacoes = new ArrayList<String>();
		Random aleatorio = new Random();
		int qtde = aleatorio.nextInt(10) + 1;
		System.out.println("Quantidade de alunos: " + qtde);
		
		for (int i = 0; i < qtde; i++) {
			System.out.println();
			System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
			String nome = teclado.next();
			
			System.out.println("Digite a nota 1 do aluno " + (i + 1) + ": ");
			int nota1 = teclado.nextInt();
			
			System.out.println("Digite a nota 2 do aluno " + (i + 1) + ": ");
			int nota2 = teclado.nextInt();
			
			System.out.println("Digite a nota 3 do aluno " + (i + 1) + ": ");
			int nota3 = teclado.nextInt();
			
			double media = (nota1 + nota2 + nota3) / 3;
			String info = "Aluno: " + nome + " - M�dia: " + media; 
			informacoes.add(info);
		}
		
		for (String info : informacoes) {
			escrever.write(info + " | ");
		}
		
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		System.out.println();
		if (linha != null) {
			System.out.println(linha);
		}
		
		File arquivo2 = new File("C:\\Users\\Debora\\arquivo2.txt");
		
		FileWriter escrever2 = new FileWriter(new File("C:\\Users\\Debora\\arquivo2.txt"));
		
		for (String info : informacoes) {
			double media = Double.parseDouble(info.substring(info.length() - 3, info.length()));
			if (media >= 7.0) {
				escrever2.write(info + " ");
			}
		}
			
		escrever2.close();
		
		FileReader ler2 = new FileReader(arquivo2);
		BufferedReader leitura2 = new BufferedReader(ler2);
		
		String linha2 = leitura2.readLine();
		
		System.out.println();
		System.out.println("Alunos aprovados: ");
		if (linha2 != null) {
			System.out.println(linha2);
		} 
		
		File arquivo3 = new File("C:\\Users\\Debora\\arquivo3.txt");
		
		FileWriter escrever3 = new FileWriter(new File("C:\\Users\\Debora\\arquivo3.txt"));
		
		for (String info : informacoes) {
			double media = Double.parseDouble(info.substring(info.length() - 3, info.length()));
			if (media <= 7.0) {
				escrever3.write(info);
			}
		}
		
		escrever3.close();
		
		FileReader ler3 = new FileReader(arquivo3);
		BufferedReader leitura3 = new BufferedReader(ler3);
		
		String linha3 = leitura3.readLine();
		
		System.out.println();
		System.out.println("Alunos reprovados: ");
		if (linha3 != null) {
			System.out.println(linha3);
		} 
		
		teclado.close();

	}

}
