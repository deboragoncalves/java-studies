package curso01.condicionais;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		// 33
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do produto: ");
		int preco = teclado.nextInt();
		double novoPreco;
		
		if (preco < 50) {
			novoPreco = preco + (preco * 0.05);
			System.out.println("O novo pre�o � de R$ " + novoPreco + " reais");
		} else if ((preco > 50) && (preco < 100)) {
			novoPreco = preco + (preco * 0.10);
			System.out.println("O novo pre�o � de R$ " + novoPreco + " reais");
		} else if (preco > 100) {
			novoPreco = preco + (preco * 0.15);
			System.out.println("O novo pre�o � de R$ " + novoPreco + " reais");
		}
		
		teclado.close();
	}

}
