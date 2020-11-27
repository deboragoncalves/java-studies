package JavaFor;

import java.util.Scanner;

public class Exercicio55 {

	public static void main(String[] args) {
		// 55
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		if (numero > 0) {
			
			for (int i = 1; i <= numero; i++) {
				if (i % i == 0 && i % 1 == 0 && i % 2 != 0 && i % 3 != 0) {
					System.out.println("Número primo " + i);
				}
			}
			
		}
		
		teclado.close();

	}

}
