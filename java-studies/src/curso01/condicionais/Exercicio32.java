package curso01.condicionais;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// 32
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha um produto e digite seu c�digo: ");
		System.out.println("100 - Cachorro Quente");
		System.out.println("101 - Bauru Simples");
		System.out.println("102 - Bauru com Ovo");
		System.out.println("103 - Hamburger");
		System.out.println("104 - Cheeseburger");
		System.out.println("105 - Suco");
		System.out.println("106 - Refrigerante");
		int codigo = teclado.nextInt();
		
		System.out.println("Digite a quantidade: ");
		int quantidade = teclado.nextInt();
		
		double preco;
		
		if (codigo == 100) {
			preco = 1.20 * quantidade;
			System.out.println("O pre�o � de R$ " + preco + " reais");
		} else if (codigo == 101) {
			preco = 1.30 * quantidade;
			System.out.println("O pre�o � de R$ " + preco + " reais");
		} else if (codigo == 102) {
			preco = 1.50 * quantidade;
			System.out.println("O pre�o � de R$ " + preco + " reais");
		} else if (codigo == 103) {
			preco = 1.20 * quantidade;
			System.out.println("O pre�o � de R$ " + preco + " reais");
		} else if (codigo == 104) {
			preco = 1.70 * quantidade;
			System.out.println("O pre�o � de R$ " + preco + " reais");
		} else if (codigo == 105) {
			preco = 2.20 * quantidade;
			System.out.println("O pre�o � de R$ " + preco + " reais");
		} else if (codigo == 106) {
			preco = 1.00 * quantidade;
			System.out.println("O pre�o � de R$ " + preco + " reais");
		} else {
			System.out.println("O c�digo � inv�lido");
		}

		
		teclado.close();

	}

}
