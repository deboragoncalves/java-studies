package JavaFor;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// 21
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		System.out.println("Digite número 1: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite número 2: ");
		int numero2 = teclado.nextInt();
		int soma = 0;
		int multiplicacao = 1;
		
		int[] vetor = new int[5];
		
		vetor[0] = 2;
		vetor[1] = 3;
		vetor[2] = 4;
		vetor[3] = numero1;
		vetor[4] = numero2;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
			} else {
				multiplicacao *= vetor[i];
			}
		}
		
		System.out.println("A soma dos números pares é " + soma);
		System.out.println("A multiplicação dos números ímpares é " + multiplicacao);
		
		teclado.close();

	}

}
