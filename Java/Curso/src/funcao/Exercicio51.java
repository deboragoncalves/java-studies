package funcao;

import java.util.Random;

public class Exercicio51 {

	public static void main(String[] args) {
		// 51

		int matriz[][] = new int[3][3];

		System.out.println(diagonalSecundaria(matriz));

	}

	public static int diagonalSecundaria(int[][] matriz) {
		Random aleatorio = new Random();

		int somatorio = 0;
		int linha = 0;
		int coluna = 2;

		/*
		 * 0 2 
		 * 1 1 
		 * 2 0
		 */

		System.out.println("Matriz: ");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(15) + 1;
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				if (linha < 3) {
					somatorio += matriz[linha][coluna];
				}

				linha++;
				coluna--;
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("Soma - Diagonal secundária: ");
		return somatorio;
	}

}
