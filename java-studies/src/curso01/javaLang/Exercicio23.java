package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) throws IOException {
		// 23
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		boolean existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {

		}
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> informacoes = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.println("Escreva a sua profiss�o: ");
			String profissao = teclado.next();
			System.out.println("Escreva o tempo de servi�o: ");
			int anos = teclado.nextInt();
			
			String info = "Profiss�o: " + profissao + " - Tempo de servi�o: " + anos + " anos";
			informacoes.add(info);
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
