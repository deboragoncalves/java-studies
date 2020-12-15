package curso01.matrizes;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// 05

		Scanner teclado = new Scanner(System.in);

		int matriz[][] = new int[5][5];
		System.out.println("Informe um n�mero inteiro: ");
		int numero = teclado.nextInt();
		
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				/* Todos os elementos de uma coluna */
				System.out.println("Digite o elemento da linha " + i + " e da coluna " + j + ": ");
				matriz[i][j] = teclado.nextInt();
			}
		}

		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				/* Imprime todos os elementos de uma coluna */
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (numero == matriz[i][j]) {
					System.out.println("O n�mero " + numero + " est� na " + i + " linha e " + j + " coluna");
				}
			}
			System.out.println();
		}
		System.out.println();

		teclado.close();

	}

}
