package Repetição;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// 17
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = teclado.nextInt();
		int contagem = 0, soma = 0;
		
		if (numero > 0) {
			
			for (int i = 0; i < numero; i++) {
				System.out.println("Número " + (i + 1) + ": " + contagem);
				contagem++;
				soma += contagem;
			}
			
			System.out.println("A soma dos números é: " + soma);
			
		} else {
			System.out.println("Digite um número positivo.");
		}
		
		teclado.close();

	}

}
