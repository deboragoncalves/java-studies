package funcao;

import java.util.Random;

public class Exercicio52 {

	public static void main(String[] args) {
		// 52
		
		int matriz[][] = null;
		
		transposta(matriz);

	}
	
	public static void transposta(int[][] matriz) {
		Random aleatorio = new Random();
		
		int numero = aleatorio.nextInt(5) + 2;
		
		matriz = new int[numero][numero];
		int transposta[][] = new int[numero][numero];
				
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(15) + 1;
			}
		}
		
		System.out.println("Matriz Original: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < transposta.length; i++) {
			for (int j = 0; j < transposta[i].length; j++) {
				transposta[i][j] = matriz[j][i];
			}
		}
		
		System.out.println();
		System.out.println("Matriz Transposta: ");
		for (int i = 0; i < transposta.length; i++) {
			for (int j = 0; j < transposta[i].length; j++) {
				System.out.print(transposta[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
