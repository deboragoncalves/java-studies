package funcao;

import java.util.Random;

public class Exercicio57 {

	public static void main(String[] args) {
		// 57

		int matriz[][] = new int[7][6];

		System.out.println(somaColuna(matriz));

	}

	public static String somaColuna(int[][] matriz) {
		Random aleatorio = new Random();

		int somatorio = 0;
		int coluna = aleatorio.nextInt(5) + 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(15) + 0;
			}
		}

		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");

				if (j == coluna) {
					somatorio += matriz[i][j];
				}
			}
			System.out.println();
		}

		System.out.println();
		return "Somatório da coluna " + coluna + ": " + somatorio;

	}

}
