package Condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// 6
		
		int a2, a3;
		int diferenca;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		a2 = teclado.nextInt();
		System.out.println("Digite outro número inteiro: ");
		a3 = teclado.nextInt();
				
		if (a2 > a3) {
			System.out.println("Número 1: " + a2);
			System.out.println("Número 2: " + a3);
			System.out.println("O número " + a2 + " é maior");
					
			diferenca = a2 - a3;
			System.out.println("A diferença entre " + a2 + " e " + a3 + " é de " + diferenca);
		} else {
			System.out.println("Número 1: " + a2);
			System.out.println("Número 2: " + a3);
			System.out.println("O número " + a3 + " é maior");
					
			diferenca = a3 - a2;
			System.out.println("A diferença entre " + a3 + " e " + a2 + " é de " + diferenca);
		} 
		
		teclado.close();

	}

}
