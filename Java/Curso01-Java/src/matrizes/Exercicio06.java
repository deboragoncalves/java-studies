import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// 06
		
		Scanner teclado = new Scanner(System.in);

		int matriz1[][] = new int[4][4];
		int matriz2[][] = new int[4][4];
		int matriz3[][] = new int[4][4];
		
		System.out.println();
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				/* Todos os elementos de uma coluna */
				System.out.println("Digite o elemento da linha " + i + " e da coluna " + j + " da matriz 1: ");
				matriz1[i][j] = teclado.nextInt();
			}
		}

		System.out.println();
		System.out.println("Matriz 1: ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				/* Imprime todos os elementos de uma coluna */
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				/* Todos os elementos de uma coluna */
				System.out.println("Digite o elemento da linha " + i + " e da coluna " + j + " da matriz 2: ");
				matriz2[i][j] = teclado.nextInt();
			}
		}

		System.out.println();
		System.out.println("Matriz 2: ");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				/* Imprime todos os elementos de uma coluna */
				System.out.print(matriz2[i][j] + " ");
				
				if (matriz2[i][j] > matriz1[i][j]) {
					matriz3[i][j] = matriz2[i][j];
				} else {
					matriz3[i][j] = matriz1[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz 3 com os maiores elementos de cada matriz (1 e 2): ");
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3[i].length; j++) {
				/* Imprime todos os elementos de uma coluna */
				System.out.print(matriz3[i][j] + " ");
			}
			System.out.println();
		}
		
		teclado.close();


	}

}
