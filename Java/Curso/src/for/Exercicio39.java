package JavaFor;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		// 39
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor da base do triângulo: ");
		int base = teclado.nextInt();
		System.out.println("Digite o valor da altura do triângulo: ");
		int altura = teclado.nextInt();
		
		double area = 0;
		
		if (base > 0 && altura > 0) {
			area = (altura * base) / 2;
			System.out.println("A área é de " + area);
		} else {
			System.out.println("Digite valores válidos.");
		}
		
		teclado.close();

	}

}
