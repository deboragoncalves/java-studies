package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) throws IOException {
		// 13
		
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
		
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<String> telefones = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.println("Digite um nome: ");
			String nome = teclado.nextLine();
			nomes.add(nome);
			System.out.println("Digite um telefone: ");
			String telefone = teclado.nextLine();
			telefones.add(telefone);
		}
		
		System.out.println();
		ArrayList<String> informacoes = new ArrayList<String>();
		informacoes.add("Nome: " + nomes.get(0) + " - Telefone: " + telefones.get(0));
		informacoes.add("Nome: " + nomes.get(1) + " - Telefone: " + telefones.get(1));
		informacoes.add("Nome: " + nomes.get(2) + " - Telefone: " + telefones.get(2));
		informacoes.add("Nome: " + nomes.get(3) + " - Telefone: " + telefones.get(3));
		informacoes.add("Nome: " + nomes.get(4) + " - Telefone: " + telefones.get(4));

		for (String info : informacoes) {
			System.out.println(info);
			escrever.write(info);
			System.out.println();
		}
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		}
		
		teclado.close();
	}

}
