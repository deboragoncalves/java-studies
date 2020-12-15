package JavaFor;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// 23
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = teclado.nextInt();
		
		if (numero > 0) {
			
			System.out.println("Divisores: ");
			
			for (int i = numero; i > 0; i--) {
				if (numero % i == 0) {
					System.out.println(i);
				}
			}
			
		} else {
			System.out.println("Digite um número positivo.");
		}
		
		teclado.close();

	}

}
