package curso01.vetores;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// 05
		
		Scanner valores = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int contador = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "o valor: ");
			vetor[i] = valores.nextInt();
			
			if ((vetor[i] % 2) == 0) {
				contador++;
			}
			
		}
		
		System.out.println("No vetor, possuem " + contador + " n�meros pares");
		
		valores.close();

	}

}
