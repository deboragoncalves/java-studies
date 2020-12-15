package curso01.matrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// 21

		int matriz1[][] = new int[2][2];
		int matriz2[][] = new int[2][2];
		int novaMatriz[][] = new int[2][2];

		Random aleatorio = new Random();
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = aleatorio.nextInt(10) + 1;
			}
		}
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = aleatorio.nextInt(10) + 1;
			}
		}
		
		System.out.println("Matriz 1 - Original: ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz 2 - Original: ");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("1 - Somar as duas matrizes;");
		System.out.println("2 - Subtrair a primeira matriz pela segunda;");
		System.out.println("3 - Adicionar uma constante �s duas matrizes;");
		System.out.println("4 - Imprimir as matrizes;");
		
		System.out.println();
		System.out.println("Escolha a opera��o desejada e digite a op��o: ");
		int opcao = teclado.nextInt();
		
		if (opcao == 1) {
			System.out.println();
			System.out.println("Soma das matrizes: ");
			for (int i = 0; i < novaMatriz.length; i++) {
				for (int j = 0; j < novaMatriz[i].length; j++) {
					novaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
			
			for (int i = 0; i < novaMatriz.length; i++) {
				for (int j = 0; j < novaMatriz[i].length; j++) {
					System.out.print(novaMatriz[i][j] + " ");
				}
				System.out.println();
			}
		} else if (opcao == 2) {
			System.out.println();
			System.out.println("Subtra��o das matrizes: ");
			for (int i = 0; i < novaMatriz.length; i++) {
				for (int j = 0; j < novaMatriz[i].length; j++) {
					novaMatriz[i][j] = matriz1[i][j] - matriz2[i][j];
				}
			}
			
			for (int i = 0; i < novaMatriz.length; i++) {
				for (int j = 0; j < novaMatriz[i].length; j++) {
					System.out.print(novaMatriz[i][j] + " ");
				}
				System.out.println();
			}
		} else if (opcao == 3) {
			System.out.println();
			System.out.println("Digite a constante que deseja adicionar: ");
			int numero = teclado.nextInt();
			
			System.out.println("Adi��o da constante �s duas matrizes: ");
			
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[i].length; j++) {
					matriz1[i][j] = matriz1[i][j] + numero;
				}
			}
			
			for (int i = 0; i < matriz2.length; i++) {
				for (int j = 0; j < matriz2[i].length; j++) {
					matriz2[i][j] = matriz2[i][j] + numero;
				}
			}
			
			System.out.println();
			System.out.println("Matriz 1 - Constante: ");
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[i].length; j++) {
					System.out.print(matriz1[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("Matriz 2 - Constante: ");
			for (int i = 0; i < matriz2.length; i++) {
				for (int j = 0; j < matriz2[i].length; j++) {
					System.out.print(matriz2[i][j] + " ");
				}
				System.out.println();
			}
		} else if (opcao == 4) {
			
		} else {
			System.out.println("A op��o escolhida � inv�lida.");
		}
		
		teclado.close();
	}

}
