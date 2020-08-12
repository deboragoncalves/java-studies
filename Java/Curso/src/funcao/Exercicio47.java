package funcao;

import java.util.Random;

public class Exercicio47 {

	public static void main(String[] args) {
		// 47
		
		int matriz[][] = new int[4][4];
		
		System.out.println(maioresDez(matriz));

	}
	
	public static int maioresDez(int[][] matriz) {
		Random aleatorio = new Random();
		int contador = 0;
		
		System.out.println("Matriz: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(20) + 1;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				if (matriz[i][j] > 10) {
					contador++;
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Números maiores que 10: ");
		return contador;
	}

}
