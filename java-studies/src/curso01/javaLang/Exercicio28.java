package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) throws IOException {
		// 28
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");

		Scanner teclado = new Scanner(System.in);
		        
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));

		Random aleatorio = new Random();
		ArrayList<String> linhas = new ArrayList<String>();
		int numeroLinhas = aleatorio.nextInt(10) + 0;
		System.out.println("N�mero de linhas: " + numeroLinhas);
        
		for (int i = 0; i < numeroLinhas; i++) {
			System.out.println("Escreva a frase " + (i + 1) + ": ");
			String linha = teclado.nextLine();
			
			if (linha.length() > 30) {
				i--;
			} else {
				linhas.add(linha);
			}
			
		}
		
		for (String linha : linhas) {
			StringBuffer stringBuffer = new StringBuffer(linha);
			escrever.write(stringBuffer.reverse() + ", ");
		}
		
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		System.out.println("Frases invertidas: ");
		if (linha != null) {
			System.out.println(linha);
		}
        
        teclado.close();
	}

}
