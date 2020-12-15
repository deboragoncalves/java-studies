package curso01.matrizes;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio14 {

	public static void main(String[] args) {
		// 14 

		Random aleatorio = new Random();

		Set<Integer> numerosAleatorios = new HashSet<Integer>();
		int matriz[][] = new int[5][5];
		int numero = 0;
		int novoNumero = 0;
		int contador1 = 0;
		int contador2 = 0;
		int elementosMatriz[] = new int[25];
		
		
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					numero = aleatorio.nextInt((99 - 0 + 1) + 0);
					numerosAleatorios.add(numero);
				}
			}
			
			while (numerosAleatorios.size() < 25) {
				novoNumero = aleatorio.nextInt((99 - 0 + 1) + 0);
				numerosAleatorios.add(novoNumero);
			}
		
			for (int valor : numerosAleatorios) {
				elementosMatriz[contador1] = valor;
				contador1++;
			}
			
			for (int i = 0; i < matriz.length; i++) {
				/* Imprimir todos os elementos de uma linha */
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] = elementosMatriz[contador2];
					contador2++;
				}
			}
			
			System.out.println();
			System.out.println("Cartela de bingo com n�meros diferentes: ");
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}


	}
}
