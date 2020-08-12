package JavaFor;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// 20
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite quantos números inteiros serão digitados: ");
		int numero = teclado.nextInt();
		System.out.println("Digite quantos números pares serão digitados: ");
		int pares = teclado.nextInt();
		
		int[] numeros = new int[numero];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número " + (i + 1) + ":");
			numeros[i] = teclado.nextInt();
			
			if (numeros[i] % 2 == 0) {
				System.out.println("O número é par");
			} 
				
		}
			
		teclado.close();

	}

}
