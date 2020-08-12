package JavaFor;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		// 30
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = teclado.nextInt();
		
		double somaParcial;
		double soma1 = 0;
		double soma2 = 0;
		double soma3 = 0;
		
		if (numero > 0) {
			for (int i = 1; i <= numero; i++) {
				somaParcial = i;
				soma1 += somaParcial;
			}
			
			for (int j = 1; j <= numero; j++) {
				somaParcial = (2 * j - 1);
				soma2 += somaParcial;
			}
			
			for (int l = 1; l <= numero; l = l + 2) {
				somaParcial = (2 * l - 1);
				soma3 += somaParcial;
			}
				
		}
		
		System.out.println("Soma 1: " + soma1);
		System.out.println("Soma 2: " + soma2);
		System.out.println("Soma 3: " + soma3);
		
		teclado.close();

	}

}
