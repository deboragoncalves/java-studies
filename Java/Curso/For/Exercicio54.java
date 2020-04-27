package JavaFor;

import java.util.Scanner;

public class Exercicio54 {

	public static void main(String[] args) {
		// 54
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		if (numero > 1) {
			if (numero % numero == 0 && numero % 1 == 0 && numero % 2 != 0 && numero % 3 != 0) {
				System.out.println("O número " + numero + " é primo");
			} else {
				System.out.println("O número " + numero + " não é primo");
			}
		}
		
		teclado.close();

	}

}
