package Repeti��o;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// 16
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		int contagem = numero;
		
		if (numero > 0 && (numero % 2 != 0)) {
			
			for (int i = 0; i <= numero; i++) {
				System.out.println("N�mero " + (i + 1) + ": " + contagem);
				contagem--;
			}
			
		} else {
			System.out.println("Digite um n�mero positivo e �mpar.");
		}
		
		teclado.close();

	}

}
