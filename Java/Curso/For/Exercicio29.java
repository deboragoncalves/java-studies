package JavaFor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		// 29
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		int fatorial = 1;
		double formula;
		double soma = 0;
		
		for (int j = 0; j <= 10; j = j + 2) {
			
			if (j != 0) {
				System.out.println("Indice Fatorial: " + j);
				fatorial = fatorial(j);
				System.out.println("Fatorial: " + fatorial);
				formula = (1 / fatorial);
				decimalFormat.format(formula);
				soma += formula;
				System.out.println("Soma: " + soma);
			}
			
		}
		
		System.out.println("Fórmula = " + soma);
		
		teclado.close();

	}
	
	public static int fatorial(int numero) {
		
		if (numero == 1 || numero == 0) {
		       return (1);
		} else {
		       return (numero * fatorial(numero - 1));
		}
	}

}
