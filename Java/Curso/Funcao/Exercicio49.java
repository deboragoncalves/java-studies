package funcao;

import java.util.Random;

public class Exercicio49 {

	public static void main(String[] args) {
		// 49

		int matriz[][] = new int[3][3];

		System.out.println(abaixoDiagonalPrincipal(matriz));

	}

	public static int abaixoDiagonalPrincipal(int[][] matriz) {
		Random aleatorio = new Random();

		int linha = 1;
		int coluna = 0;
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

				if (coluna <= 0 && linha == 1) {
					somatorio += matriz[linha][coluna];
				}

				linha++;
				while (linha == 2 && coluna <= 1) {
					somatorio += matriz[linha][coluna];
					coluna++;
				}
			
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("Soma - Abaixo da diagonal principal: ");
		return somatorio;
	}

}
