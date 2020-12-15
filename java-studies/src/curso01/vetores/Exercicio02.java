package curso01.vetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// 2
		
		Scanner numeros = new Scanner(System.in);
				
		int[] vetNumeros = new int[6];
				
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o " + (i + 1) + "o n�mero: ");
			vetNumeros[i] = numeros.nextInt();
		}
		
		System.out.println("N�mero 1: " + vetNumeros[0]);
		System.out.println("N�mero 2: " + vetNumeros[1]);
		System.out.println("N�mero 3: " + vetNumeros[2]);
		System.out.println("N�mero 4: " + vetNumeros[3]);
		System.out.println("N�mero 5: " + vetNumeros[4]);
		System.out.println("N�mero 6: " + vetNumeros[5]);
				
		numeros.close();

	}

}
