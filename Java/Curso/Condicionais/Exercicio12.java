package Condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// 12 
		
		int a5;
		double a6;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println("Digite um número inteiro: ");
		a5 = teclado.nextInt();
				
		if (a5 >= 0) {
			a6 = Math.log10(a5);
			System.out.println("Logaritmo de " + a5 + " é " + formato.format(a6));
		} else {
			System.out.println("Número inválido");
		}
				
		teclado.close();

	}

}
