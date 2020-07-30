import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// 01
		
		Scanner teclado = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		int contador = 0;
				
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
				
				if (matriz[i][j] > 10) {
					contador++;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("A matriz possui " + contador + " números maiores que 10");

		teclado.close();

	}

}
