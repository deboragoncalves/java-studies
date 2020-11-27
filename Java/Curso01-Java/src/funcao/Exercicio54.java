package funcao;

import java.util.Random;

public class Exercicio54 {

	public static void main(String[] args) {
		// 54
		
		int matriz[][] = new int[4][4];
		
		System.out.println(soma(matriz));

	}
	
	public static int soma(int[][] matriz) {
		Random aleatorio = new Random();
		int somatorio = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(10) + 0;
				
				somatorio += matriz[i][j];
			}
		}
		
		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Somatório: ");
		return somatorio;
	}

}
