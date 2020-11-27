package JavaFor;

import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {
		// 52
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do saque: ");
		int saque = teclado.nextInt();
		
		int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
		
		while (saque > 0) {
			if (saque > 100) {
				notas100 = saque / 100;
				saque = saque % 100;
				System.out.println("Notas de 100: " + notas100);
			} else if (saque > 50) {
				notas50 = saque / 50;
				saque = saque % 50;
				System.out.println("Notas de 50: " + notas50);
			} else if (saque > 20) {
				notas20 = saque / 20;
				saque = saque % 20;
				System.out.println("Notas de 20: " + notas20);
			} else if (saque > 10) {
				notas10 = saque / 10;
				saque = saque % 10;
				System.out.println("Notas de 10: " + notas10);
			} else if (saque > 5) {
				notas5 = saque / 5;
				saque = saque % 5;
				System.out.println("Notas de 5: " + notas5);
			} else if (saque > 2) {
				notas2 = saque / 2;
				saque = saque % 2;
				System.out.println("Notas de 2: " + notas2);
			} else if (saque > 1) {
				notas1 = saque / 1;
				saque = saque % 1;
				System.out.println("Notas de 2: " + notas1);
			}
		}
		

		
		teclado.close();

	}

}
