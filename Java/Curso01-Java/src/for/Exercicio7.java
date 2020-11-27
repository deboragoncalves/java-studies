package Repetição;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// 7
		
		Scanner teclado = new Scanner(System.in);
		int a, soma = 0;
		double media;
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite o número " + (i + 1) + ": ");
				a = teclado.nextInt();
				
				if (a < 0) {
					System.out.println("Digite um número positivo.");
				} else {
					soma += a;
				}

			}
		
		System.out.println("A soma é: " + soma);
		media = (soma / 10);
		System.out.println("A média é: " + media);
	
		teclado.close();

	}

}
