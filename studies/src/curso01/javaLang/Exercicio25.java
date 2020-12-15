package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) throws IOException {
		// 25
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		Scanner teclado = new Scanner(System.in);
		
		// Inserir e lista contatos
		
		ArrayList<String> listaContatos = new ArrayList<String>();
		ArrayList<String> nomes = new ArrayList<String>();
		
		for (int i = 0; i < 2; i++) {
			System.out.println();
			System.out.println("Digite o seu nome: ");
			String nome = teclado.next();
			nomes.add(nome);
			System.out.println("Digite o seu telefone: ");
			String telefone = teclado.next();
			System.out.println("Digite o seu dia de nascimento: ");
			int dia = teclado.nextInt();
			System.out.println("Digite o seu m�s de nascimento: ");
			int mes = teclado.nextInt();
			
			String nascimento = "Data de nascimento: " + String.valueOf(dia) + "/" + String.valueOf(mes);
			
			String info = "Nome: " + nome + " - Telefone: " + telefone + " - " + nascimento;
			listaContatos.add(info);
		}
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		
		for (String info : listaContatos) {
			escrever.write(info + " | ");
		}
		
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		}
		
		// Contatos cujo nome se inicia com uma letra
		
		File arquivo2 = new File("C:\\Users\\Debora\\arquivo2.txt");
		
		System.out.println();
		System.out.println("Digite a inicial de um nome que deseja pesquisar: ");
		String letraString = teclado.next();
		
		FileWriter escrever2 = new FileWriter(new File("C:\\Users\\Debora\\arquivo2.txt"));

		for (String item : listaContatos) {
			if (item.substring(6, 7).equals(letraString)) {
				escrever2.write(item + " ");
			} 
		}
			
		escrever2.close();
		
		FileReader ler2 = new FileReader(arquivo2);
		BufferedReader leitura2 = new BufferedReader(ler2);
		
		String linha2 = leitura2.readLine();
		
		System.out.println();
		System.out.println("Lista de contatos cujo nome tem a inicial " + letraString + ": ");
		if (linha2 != null) {
			System.out.println(linha2);
		}
		
		// Remover contato
		
		File arquivo3 = new File("C:\\Users\\Debora\\arquivo3.txt");
		
		boolean existe = arquivo3.exists();
		
		try {
			if (!existe) {
				arquivo3.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever3 = new FileWriter(new File("C:\\Users\\Debora\\arquivo3.txt"));
		
		System.out.println();
		System.out.println("Digite o nome do contato que voc� deseja remover: ");
		String nomeRemocao = teclado.next();
				
		if (nomes.contains(nomeRemocao)) {
			int indice = nomes.indexOf(nomeRemocao);
			listaContatos.remove(indice);
			nomes.remove(indice);
		}
		
		for (String info : listaContatos) {
			escrever3.write(info + " ");
		}
		
		escrever3.close();
		
		FileReader ler3 = new FileReader(arquivo3);
		BufferedReader leitura3 = new BufferedReader(ler3);
		
		String linha3 = leitura3.readLine();
		
		if (linha3 != null) {
			System.out.println(linha3);
		} 
		
		// Pesquisar contato
		
		File arquivo4 = new File("C:\\Users\\Debora\\arquivo4.txt");
		
		existe = arquivo4.exists();
		
		try {
			if (!existe) {
				arquivo4.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever4 = new FileWriter(new File("C:\\Users\\Debora\\arquivo4.txt"));
		
		System.out.println();
		System.out.println("Digite o nome do contato que voc� deseja pesquisar: ");
		String nomeBusca = teclado.next();
		
		if (nomes.contains(nomeBusca)) {
			for (String item : listaContatos) {
				
				if (nomeBusca.equals(item.substring(6, (6 + nomeBusca.length())))) {
					escrever4.write(item + " ");
				}
			}
		}
		
		escrever4.close();
		
		FileReader ler4 = new FileReader(arquivo4);
		BufferedReader leitura4 = new BufferedReader(ler4);
		
		String linha4 = leitura4.readLine();
		
		if (linha4 != null) {
			System.out.println(linha4);
		} 
				
		// Aniversariantes do m�s
		
		File arquivo5 = new File("C:\\Users\\Debora\\arquivo5.txt");
		
		existe = arquivo5.exists();
		
		try {
			if (!existe) {
				arquivo5.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever5 = new FileWriter(new File("C:\\Users\\Debora\\arquivo5.txt"));

		int mesAtual = (new Date().getMonth()) + 1;
		String mes = String.valueOf(mesAtual);
		
		System.out.println();
		for (String item : listaContatos) {
			if (mes.equals(item.substring(item.length() - 1))) {	
				escrever5.write(item + " ");
			} 
		}
		
		escrever5.close();
		
		FileReader ler5 = new FileReader(arquivo5);
		BufferedReader leitura5 = new BufferedReader(ler5);
		
		String linha5 = leitura5.readLine();
		
		if (linha5 != null) {
			System.out.println("Aniversariantes do m�s: ");
			System.out.println(linha5);
		} 
		
		teclado.close();
	}

}
