package Condicionais;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		// 36
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da venda: ");
		double venda = teclado.nextDouble();
		double comissao;
		
		if (venda >= 100000.00) {
			comissao = 700 + (0.16 * venda);
			System.out.println("A comissão é de R$ " + comissao + " reais");
		} else if ((venda >= 100000.00) && (venda <= 80000.00)) {
			comissao = 650 + (0.14 * venda);
			System.out.println("A comissão é de R$ " + comissao + " reais");
		} else if ((venda >= 80000.00) && (venda <= 60000.00)) {
			comissao = 600 + (0.14 * venda);
			System.out.println("A comissão é de R$ " + comissao + " reais");
		} else if ((venda >= 60000.00) && (venda <= 40000.00)) {
			comissao = 550 + (0.14 * venda);
			System.out.println("A comissão é de R$ " + comissao + " reais");
		} else if ((venda >= 40000.00) && (venda <= 20000.00)) {
			comissao = 500 + (0.14 * venda);
			System.out.println("A comissão é de R$ " + comissao + " reais");
		} else if (venda <= 20000.00) {
			comissao = 400 + (0.14 * venda);
			System.out.println("A comissão é de R$ " + comissao + " reais");
		} else {
			System.out.println("O valor de venda não é válido");
		}
		
		teclado.close();

	}

}
