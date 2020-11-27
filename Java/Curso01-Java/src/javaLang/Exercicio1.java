package javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
		// 01
		
		File arquivo = new File("C:\\Users\\Debora\\arq.txt");
        
		boolean existe = arquivo.exists();
		
		try {
			if (!existe) {
				arquivo.createNewFile();
			}
		} catch (IOException e) {
			
		}
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		
		while (linha != null) {
			while (!linha.equals("0")) {
				System.out.println(linha);
				linha = leitura.readLine();
			}
		}
		
		leitura.close();
				 
		}
		
	}

