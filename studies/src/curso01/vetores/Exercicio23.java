package curso01.vetores;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// 23
		
		Scanner teclado = new Scanner(System.in);
		
		int vetorA[] = new int[5];
		int vetorB[] = new int[5];
		int produtoEscalar = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor do vetor A: ");
			vetorA[i] = teclado.nextInt();
		}
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor do vetor B: ");
			vetorB[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			produtoEscalar += vetorA[i] * vetorB[i];
		}
		
		System.out.println();
		System.out.println("Vetor A ");
		for (int valor : vetorA) {
			System.out.println(valor);
		}
		
		System.out.println();
		System.out.println("Vetor B ");
		for (int valor : vetorB) {
			System.out.println(valor);
		}
		
		System.out.println();
		System.out.println("Produto Escalar: " + produtoEscalar);
		
		teclado.close();

	}

}
