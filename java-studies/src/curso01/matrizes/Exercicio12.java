package curso01.matrizes;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// 12

		Scanner teclado = new Scanner(System.in);
		int matriz[][] = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				/* Todos os elementos de uma coluna */
				System.out.println("Digite o elemento da linha " + i + " e da coluna " + j + ": ");
				matriz[i][j] = teclado.nextInt();
			}
		}

		System.out.println();
		System.out.println("Matriz original: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz transposta: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[j][i] + " ");
			}
			System.out.println();
		}

		teclado.close();

	}
	

}
