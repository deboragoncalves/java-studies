package curso01.matrizes;

import java.util.Random;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13
		
		// Acima da diagonal principal. i < j.

		Random aleatorio = new Random();

		int matriz[][] = new int[4][4];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt((20 - 1 + 1) - 1);
			}
		}
		
		System.out.println("Matriz original: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz transformada: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i < j) {
					matriz[i][j] = 0;
				}
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
