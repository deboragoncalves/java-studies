package javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) throws IOException {
		// 24
		
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
		ArrayList<String> infoProdutos = new ArrayList<String>();
		ArrayList<String> nomeProdutos = new ArrayList<String>();
		
		// Entrada do produto
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do produto: ");
			String produto = teclado.next();
			nomeProdutos.add(produto);
			int codigo = aleatorio.nextInt(10) + 0;
			int quantidade = aleatorio.nextInt(50) + 0;
			
			String info = "Produto: " + produto + " - Código: " + codigo + " - Quantidade: " + quantidade;
			infoProdutos.add(info);
		}
		
		System.out.println("Lista de produtos - Original: ");
		for (String info : infoProdutos) {
			escrever.write(info + " | ");
		}
		
		escrever.close();
				
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		}
		
		// Retirada do produto
		
		File arquivo2 = new File("C:\\Users\\Debora\\arquivo2.txt");
		
		existe = arquivo2.exists();
		
		try {
			if (!existe) {
				arquivo2.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever2 = new FileWriter(new File("C:\\Users\\Debora\\arquivo2.txt"));
		
		System.out.println();
		System.out.println("Digite o nome do produto que deseja retirar: ");
		String retiradaProduto = teclado.next();
		boolean contemProduto;
		
		ArrayList<String> novaListaProdutos = new ArrayList<String>();
		novaListaProdutos.addAll(infoProdutos);
		
		ArrayList<String> novaListaNomes = new ArrayList<String>();
		novaListaNomes.addAll(nomeProdutos);
		
		if (novaListaNomes.contains(retiradaProduto)) {
			contemProduto = true;
			for (int i = 0; i < novaListaNomes.size(); i++) {
				if (novaListaNomes.get(i).equals(retiradaProduto)) {	
					novaListaProdutos.remove(i);
				}
			}
		} else {
			contemProduto = false;
			System.out.println("O produto " + retiradaProduto + " não se encontra na lista.");
		}
		
		System.out.println();
		if (contemProduto) {
			for (String info : novaListaProdutos) {
				escrever2.write(info + " | ");
			}
		}
		
		escrever2.close();
		
		FileReader ler2 = new FileReader(arquivo2);
		BufferedReader leitura2 = new BufferedReader(ler2);
		
		linha = leitura2.readLine();
		
		System.out.println("Nova lista pós retirada: ");
		if (linha != null) {
			System.out.println(linha);
		} 
		
		System.out.println();
		
		// Produtos indisponíveis
		
		File arquivo3 = new File("C:\\Users\\Debora\\arquivo3.txt");
		
		existe = arquivo3.exists();
		
		try {
			if (!existe) {
				arquivo3.createNewFile();
			}
		} catch (IOException e) {

		}
		
		FileWriter escrever3 = new FileWriter(new File("C:\\Users\\Debora\\arquivo3.txt"));
		
		ArrayList<String> produtosIndisponiveis = new ArrayList<String>();
		
		produtosIndisponiveis.add("Geladeira");
		produtosIndisponiveis.add("Televisão");
		produtosIndisponiveis.add("Computador");
		produtosIndisponiveis.add("Cama");
		produtosIndisponiveis.add("Travesseiro");
		
		for (String produto : produtosIndisponiveis) {
			if (!nomeProdutos.contains(produto)) {
				escrever3.write(produto + " | ");
			}
		}

		escrever3.close(); 
		
		FileReader ler3 = new FileReader(arquivo3);
		BufferedReader leitura3 = new BufferedReader(ler3);
		
		linha = leitura3.readLine();
		
		System.out.println("Produtos Indisponíveis: ");
		if (linha != null) {
			System.out.println(linha);
		} 
		
		ler.close();
		leitura.close(); 
		teclado.close();
	}

}
