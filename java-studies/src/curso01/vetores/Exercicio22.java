package curso01.vetores;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// 22
		
		Scanner teclado = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int vetorC[] = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor do vetor A: ");
			vetorA[i] = teclado.nextInt();
		}
		
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor do vetor B: ");
			vetorB[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				vetorC[i] += vetorA[i];
			} else {
				vetorC[i] += vetorB[i];
			}
		}
		
		System.out.println("Vetor C: ");
		for (int valor : vetorC) {
			System.out.println(valor);
		}
		
		teclado.close();
	}

}
