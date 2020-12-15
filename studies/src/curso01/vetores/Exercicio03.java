package curso01.vetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3
		
		Scanner numero = new Scanner(System.in);
		
		int[] vetNumeros = new int[10];
		int[] vetQuadrado = new int[10];

		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "o n�mero: ");
			vetNumeros[i] = numero.nextInt();
			vetQuadrado[i] = (int) Math.pow(vetNumeros[i], 2);
		}
		
		System.out.println("Valores do vetor original: ");
		for (int valor : vetNumeros) {
			System.out.println(valor);
		}
		
		System.out.println();
		System.out.println("Valores do vetor elevado ao quadrado: ");
		for (int valor : vetQuadrado) {
			System.out.println(valor);
		}
		
		numero.close();

	}

}
