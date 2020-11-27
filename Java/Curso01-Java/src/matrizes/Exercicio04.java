import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// 04
		
		Scanner teclado = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
				
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				/* Todos os elementos de uma coluna */ 
				System.out.println("Digite o elemento da linha " + i + " e da coluna " + j + ": ");
				matriz[i][j] = teclado.nextInt(); 
			}
		}
			
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				/* Imprime todos os elementos de uma coluna */
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
				
		System.out.println("O maior valor da matriz é " + matriz[3][3]);
		
		teclado.close();
		
	}

}
