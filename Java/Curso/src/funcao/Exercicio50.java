package funcao;

import java.util.Random;

public class Exercicio50 {

	public static void main(String[] args) {
		// 50
		int matriz[][] = new int[3][3];

		System.out.println(diagonalPrincipal(matriz));

	}

	public static int diagonalPrincipal(int[][] matriz) {
		Random aleatorio = new Random();

		int somatorio = 0;

		System.out.println("Matriz: ");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(15) + 1;
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");

				if (i == j) {
					somatorio += matriz[i][j];
				}

			}
			System.out.println();
		}

		System.out.println();
		System.out.print("Soma - Diagonal principal: ");
		return somatorio;
	}
}
