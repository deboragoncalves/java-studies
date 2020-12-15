package curso01.matrizes;

public class Exercicio03 {

	public static void main(String[] args) {
		// 03
		
		int matriz[][] = new int[4][4];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				/* Imprimir todos os elementos da coluna */
					matriz[i][j] = i * j;
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
