package curso01.matrizes;

import java.util.Random;

public class Exercicio23 {

	public static void main(String[] args) {
		// 23
		
		int matrizA[][] = new int[3][3];
		int matrizB[][] = new int[3][3];

		Random aleatorio = new Random();
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = aleatorio.nextInt(10) + 1;
			}
		}
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				matrizB[i][j] = (int) Math.pow(matrizA[i][j], 2);
			}
		}
		
		System.out.println("Matriz A - Original: ");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz A elevada ao quadrado: ");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}

	}

}
