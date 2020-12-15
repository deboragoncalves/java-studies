package curso01.repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// 28
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		int fatorial = 1;
		double formulaE;
		double soma = 1;
		
		if (numero > 0) {
			
			for (int i = numero; i > 0; i--) {
				fatorial = fatorial(i);
				formulaE = (1 / fatorial);
				decimalFormat.format(formulaE);
				soma += formulaE;
			}
		
		}

		System.out.println("E = " + soma);
		
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
