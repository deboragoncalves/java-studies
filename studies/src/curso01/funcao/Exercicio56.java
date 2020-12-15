package curso01.funcao;

import java.util.Random;

public class Exercicio56 {

	public static void main(String[] args) {
		// 56
		
		int matriz[][] = new int[7][6];
		
		System.out.println(somaLinha(matriz));

	}
	
	public static String somaLinha(int[][] matriz) {
		Random aleatorio = new Random();
		
		int somatorio = 0; 
		int linha = aleatorio.nextInt(6) + 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(15) + 0;
			}
		}
		
		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				if (i == linha) {
					somatorio += matriz[i][j];
				}
			}			
			System.out.println();
		}
		
		System.out.println();
		return "Somat�rio da linha " + linha + ": " + somatorio;

	}

}
