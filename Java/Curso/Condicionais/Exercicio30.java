package Condicionais;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		// 30
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		System.out.println("Número 1: ");
		double n1 = teclado.nextDouble();
		System.out.println("Número 2: ");
		double n2 = teclado.nextDouble();
		System.out.println("Número 3: ");
		double n3 = teclado.nextDouble();
		
		if ((n1 < n2) && (n1 < n3)) {
			if (n2 < n3) {
				System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);
			} else {
				System.out.println("Ordem crescente: " + n1 + ", " + n3 + ", " + n2);
			}
		} else if ((n2 < n1) && (n2 < n3)) {
			if (n1 < n3) {
				System.out.println("Ordem crescente: " + n2 + ", " + n1 + ", " + n3);
			} else {
				System.out.println("Ordem crescente: " + n2 + ", " + n3 + ", " + n1);
			}
		} else {
			if (n1 < n2) {
				System.out.println("Ordem crescente: " + n3 + ", " + n1 + ", " + n2);
			} else {
				System.out.println("Ordem crescente: " + n3 + ", " + n2 + ", " + n1);
			}
		}

		
		teclado.close();

	}

}
