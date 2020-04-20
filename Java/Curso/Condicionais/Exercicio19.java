package Condicionais;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// 19
		
		Scanner teclado10 = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n1 = teclado10.nextInt();
		
		if ((n1 % 3 == 0) && (n1 % 5 == 0)) {
			System.out.println("O número " + n1 + " é divisível por 3 e por 5");
		} else if ((n1 % 3 == 0) || (n1 % 5 == 0)) {
			if (n1 % 5 == 0) {
				System.out.println("O número " + n1 + " é divisível por 5");
			} else {
				System.out.println("O número " + n1 + " é divisível por 3");
			}
		} else {
			System.out.println("O número " + n1 + " não é divisível nem por 5 nem por 3");
		} 
		
		
		
		teclado10.close();
		
	}

}
