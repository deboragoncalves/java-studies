package funcao;

import java.util.Random;

public class Exercicio48 {

	public static void main(String[] args) {
		// 48
		
		int matriz[][] = new int[3][3];
		
		System.out.println(acimaDiagonalPrincipal(matriz));

	}
	
	public static int acimaDiagonalPrincipal(int[][] matriz) {
		Random aleatorio = new Random();
		
		int linha = 0;
		int coluna = 1;
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
				
				while (coluna <= 2 && linha == 0) {
					somatorio += matriz[linha][coluna];
					coluna++;
				}
				
				linha++;
				coluna--;
				if (linha == 1 && coluna == 2) {
					somatorio += matriz[linha][coluna];
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Soma - Acima da diagonal principal: ");
		return somatorio;
	}

}
