package Condicionais;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// 20
		
		double n1, n2, n3;
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite o valor 1: ");
		n1 = teclado.nextDouble();
		System.out.println("Digite o valor 2: ");
		n2 = teclado.nextDouble();
		System.out.println("Digite o valor 3: ");
		n3 = teclado.nextDouble();
				
		if (n1 < (n2 + n3) || n2 < (n1 + n3) || n3 < (n2 + n1)) {
			if (n1 == n2 && n2 == n3) {
				System.out.println("O triângulo é equilátero");
			} else if (n1 == n2 || n2 == n3 || n3 == n1) {
				System.out.println("O triângulo é isósceles");
			} else if (n1 != n2 && n2 != n3) {
				System.out.println("O triângulo é escaleno");
			}
		} else {
			System.out.println("Os valores informados são inválidos");
		}
		
		teclado.close();
			
	}

}
