package Repetição;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		int contagem = 1;
		
		if (numero > 0 && (numero % 2 != 0)) {
			
			for (int i = 0; i < numero; i++) {
				System.out.println("Número " + (i + 1) + ": " + contagem);
				contagem++;
			}
			
		} else {
			System.out.println("Digite um número positivo e ímpar.");
		}
		
		teclado.close();

	}

}
