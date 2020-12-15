package curso01.funcao;

import java.util.Random;

public class Exercicio55 {

	public static void main(String[] args) {
		// 55

		int matriz[][] = new int[3][3];

		System.out.println(somaDiagonal(matriz));

	}

	public static String somaDiagonal(int[][] matriz) {
		Random aleatorio = new Random();
		int somatorioPrincipal = 0;
		int somatorioSecundaria = 0;
		int linha = 0;
		int coluna = 2;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(10) + 0;

				if (i == j) {
					somatorioPrincipal += matriz[i][j];
				}
			}
			
		}
		
		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				while (linha < 3 && coluna >= 0) {
					somatorioSecundaria += matriz[linha][coluna];
					linha++;
					coluna--;
				}
			}
			System.out.println();
		}

		System.out.println();
		return "Soma - Diagonal Principal: " + somatorioPrincipal + " e Soma - Diagonal Secund�ria: " + somatorioSecundaria;
	}

}
