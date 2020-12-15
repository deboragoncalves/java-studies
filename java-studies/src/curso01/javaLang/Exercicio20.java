package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) throws IOException {
		// 20
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int numeroAlunos = aleatorio.nextInt(10) + 0;
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> notas = new ArrayList<Integer>();
		ArrayList<String> informacoes = new ArrayList<String>();
		
		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite um nome: ");
			String nome = teclado.next();
			nomes.add(nome);
			
			int nota = aleatorio.nextInt(10) + 1;
			notas.add(nota);
			
			String informacao = "Nome: " + nome + " - Nota final: " + nota;
			informacoes.add(informacao);
		}
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));	
				
		for (String info : informacoes) {
			escrever.write(info + ", ");
		}
		
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
