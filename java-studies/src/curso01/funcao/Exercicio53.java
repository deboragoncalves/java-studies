package curso01.funcao;

import java.util.Random;

public class Exercicio53 {

	public static void main(String[] args) {
		// 53
		
		int matriz[][] = null;
		
		System.out.println(identidade(matriz));

	}
	
	public static String identidade(int[][] matriz) {
		Random aleatorio = new Random();
		
		boolean identidade = false;
		int ordem = aleatorio.nextInt(4) + 2;;
		
		matriz = new int[ordem][ordem];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] = aleatorio.nextInt(15) + 0;
			}
		}
		
		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				if (i == j) {
					if (matriz[i][j] == 1) {
						identidade = true;
					} else {
						identidade = false;
					}
				} else {
					if (matriz[i][j] == 0) {
						identidade = true;
					} else {
						identidade = false;
					}
				}
			} 
			System.out.println();
		}
		
		System.out.println();
		if (identidade == false) {
			return "N�o � identidade!";
		} else {
			return "Identidade!";
		}
	}

}
