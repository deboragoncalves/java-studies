package Condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// 5 
		
		int a;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		a = teclado.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("O número " + a + " é par");
		} else {
			System.out.println("O número " + a + " é ímpar");
		} 
		
		teclado.close();
		
	}		
}
