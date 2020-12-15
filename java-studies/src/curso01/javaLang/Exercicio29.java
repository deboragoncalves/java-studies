package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) throws IOException {
		// 29
		
		// Incluir registros
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		
		RegistroExercicio29 registro = new RegistroExercicio29();
		ArrayList<String> informacoes = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int qtdeVendedor = aleatorio.nextInt(10) + 0;
		System.out.println("N�mero de vendedores: " + qtdeVendedor);
		
		for (int i = 0; i < qtdeVendedor; i++) {
			registro.setCodigo(aleatorio.nextInt(10) + 0);
			System.out.println("Digite o nome de um vendedor: ");
			String nome = teclado.next();
			registro.setNomeVendedor(nome);
			registro.setPrecoVenda(aleatorio.nextInt(10) + 0);
			registro.setMesVenda(aleatorio.nextInt(12) + 1);
			
			if (registro.getCodigo() == registro.getMesVenda()) {
				i--;
			} else {
				String info = "C�digo: " + registro.getCodigo() + " - Nome do vendedor: " + registro.getNomeVendedor() + " - Pre�o de venda: " + registro.getPrecoVenda() 
				+ " - M�s de venda: " + registro.getMesVenda();
				informacoes.add(info);
			}
			
		}
		
		for (String info : informacoes) {
			escrever.write(info + " | ");
		}
		
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		System.out.println("Registros: ");
		if (linha != null) {
			System.out.println(linha);
		}
		
		// Excluir vendedor
		
		File arquivo2 = new File("C:\\Users\\Debora\\arquivo2.txt");
		
		FileWriter escrever2 = new FileWriter(new File("C:\\Users\\Debora\\arquivo2.txt"));
		
		System.out.println();
		System.out.println("Digite o nome do vendedor que voc� quer excluir: ");
		String nomeExclusao = teclado.next();
		
		for (int i = 0; i < informacoes.size(); i++) {
			if (nomeExclusao.equals(informacoes.get(i).substring(30, (30 + nomeExclusao.length())))) {
				informacoes.remove(i);
			}
		}
		
		System.out.println();
		for (String info : informacoes) {
			escrever2.write(info + " | ");
		}
		
		escrever2.close();
		
		FileReader ler2 = new FileReader(arquivo2);
		BufferedReader leitura2 = new BufferedReader(ler2);
		
		String linha2 = leitura2.readLine();
		
		System.out.println("Registros atualizados ap�s remo��o: ");
		if (linha2 != null) {
			System.out.println(linha2);
		}
		
		// Alterar o valor da venda do produto
		
		File arquivo3 = new File("C:\\Users\\Debora\\arquivo3.txt");
		
		FileWriter escrever3 = new FileWriter(new File("C:\\Users\\Debora\\arquivo3.txt"));
		
		System.out.println();
		System.out.println("Digite o c�digo do produto que voc� deseja alterar o valor da venda: ");
		String codigoAlteracao = teclado.next();
		
		for (int i = 0; i < informacoes.size(); i++) {
			if (codigoAlteracao.equals(informacoes.get(i).substring(8, 9))) {

				System.out.println("Digite o novo valor de venda do produto: ");
				String novoValor = teclado.next();
				
				String novaInfo = informacoes.get(i).replaceAll(informacoes.get(i).substring(55, 56), novoValor);
				informacoes.add(novaInfo);
				informacoes.remove(i);
			} else {
				break;
			}
		}
		
		System.out.println();
		for (String info : informacoes) {
			escrever3.write(info + " | ");
		}
		
		escrever3.close();
		
		FileReader ler3 = new FileReader(arquivo3);
		BufferedReader leitura3 = new BufferedReader(ler3);
		
		String linha3 = leitura3.readLine();
		
		System.out.println("Registros atualizados com a altera��o do pre�o: ");
		if (linha3 != null) {
			System.out.println(linha3);
		}
		
		teclado.close();
	}

	}


