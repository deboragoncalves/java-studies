package funcao;

import java.util.Random;

public class Exercicio58 {

	public static void main(String[] args) {
		// 58
		
		int matrizA[][] = null;
		int matrizB[][] = null;

		produtoMatrizes(matrizA, matrizB);

	}
	
	public static void produtoMatrizes(int[][] matrizA, int[][] matrizB) {
		Random aleatorio = new Random();
		
		int ordem = aleatorio.nextInt(4) + 2;
		
		matrizA = new int[ordem][ordem];
		matrizB = new int[ordem][ordem];
		int matrizC[][] = new int[ordem][ordem]; 
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = aleatorio.nextInt(10) + 0;
			}
		}
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				matrizB[i][j] = aleatorio.nextInt(10) + 0;
			}
		}
		
		System.out.println("Matriz A: ");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz B: ");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
			}
		}
		
		System.out.println();
		System.out.println("Matriz C - Muliplicação: ");
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}

	}

}
