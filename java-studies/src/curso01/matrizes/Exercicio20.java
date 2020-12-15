package curso01.matrizes;

import java.util.Random;

public class Exercicio20 {

	public static void main(String[] args) {
		// 20
		
		int matriz[][] = new int[3][6];
		
		Random aleatorio = new Random();
		
		int somatorioColuna1 = 0;
		int somatorioColuna3 = 0;
		int somatorioColuna5 = 0;
		int somatorioLinha1 = 0;
		int somatorioLinha2 = 0;
		int somatorioLinha3 = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(10) + 1;
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
		System.out.println("Colunas �mpares: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j % 2 != 0) {
					System.out.print(matriz[i][j] + " ");
					
					if (j == 1) {
						somatorioColuna1 += matriz[i][j];
					} else if (j == 3) {
						somatorioColuna3 += matriz[i][j];
					} else if (j == 5) {
						somatorioColuna5 += matriz[i][j];
					}
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Somat�rio - Coluna 1: " + somatorioColuna1);
		System.out.println("Somat�rio - Coluna 2: " + somatorioColuna3);
		System.out.println("Somat�rio - Coluna 3: " + somatorioColuna5);
		
		System.out.println();
		System.out.println("Elementos da 2a e 4a coluna: ");
		
		somatorioColuna1 = 0;
		somatorioColuna3 = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 1 || j == 3) {
					System.out.print(matriz[i][j] + " ");
					
					if (j == 1) {
						somatorioColuna1 += matriz[i][j];
					} else if (j == 3) {
						somatorioColuna3 += matriz[i][j];
					} 
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("M�dia - Coluna 2: " + somatorioColuna1 / matriz.length);
		System.out.println("M�dia - Coluna 4: " + somatorioColuna3 / matriz.length);
		
		System.out.println();
		System.out.println("Elementos da 1a e 2a coluna: ");
		
		somatorioColuna1 = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 0 || j == 1) {
					System.out.print(matriz[i][j] + " ");
					
					if (i == 0) {
						somatorioLinha1 += matriz[i][j];
					} else if (i == 1) {
						somatorioLinha2 += matriz[i][j];
					} else if (i == 2) {
						somatorioLinha3 += matriz[i][j];
					}
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Soma - Linha 1: " + somatorioLinha1);
		System.out.println("Soma - Linha 2: " + somatorioLinha2);
		System.out.println("Soma - Linha 3: " + somatorioLinha3);
		
		int somaLinhas[] = { somatorioLinha1, somatorioLinha2, somatorioLinha3 };
		
		System.out.println();
		System.out.println("Nova matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == matriz[i].length - 1) {
					matriz[i][j] = somaLinhas[i];
				}
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	

}
