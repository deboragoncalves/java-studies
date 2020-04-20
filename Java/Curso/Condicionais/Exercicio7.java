package Condicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// 7
		
		int a4, a5;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		a4 = teclado.nextInt();
		System.out.println("Digite outro número inteiro: ");
		a5 = teclado.nextInt();
		
		if (a4 > a5) {
			System.out.println("Número 1: " + a4);
			System.out.println("Número 2: " + a5);
			System.out.println("O número " + a4 + " é maior");
		} else if (a5 > a4) {
			System.out.println("Número 1: " + a4);
			System.out.println("Número 2: " + a5);
			System.out.println("O número " + a5 + " é maior");
		} else {
			System.out.println("Número 1: " + a4);
			System.out.println("Número 2: " + a5);
			System.out.println("Os números " + a4 + " e " + a5 + " são iguais");
		} 
		
		teclado.close();

	}
	
}
