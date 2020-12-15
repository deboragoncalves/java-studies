package curso01.repeticao;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// 21
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros: ");
		System.out.println("Digite n�mero 1: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite n�mero 2: ");
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
		
		System.out.println("A soma dos n�meros pares � " + soma);
		System.out.println("A multiplica��o dos n�meros �mpares � " + multiplicacao);
		
		teclado.close();

	}

}
