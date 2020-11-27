package Repetição;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		int contagem = 0;
		
		if (numero > 0 && (numero % 2 == 0)) {
			
			for (int i = 0; i < numero; i++) {
				System.out.println("Número " + (i + 1) + ": " + contagem);
				contagem++;
			}
			
		} else {
			System.out.println("Digite um número positivo e par.");
		}
		
		teclado.close();

	}

}
