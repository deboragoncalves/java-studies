package curso01.repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		// 42
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#0,00");
		
		boolean continuar = true;
		
		do {
			System.out.println();
			System.out.println("Entre com o n�mero: ");
			int numero = teclado.nextInt();
			
			if (numero > 0) {
				int quadrado = (int) Math.pow(numero, 2);
				int cubo = (int) Math.pow(numero, 3);
				double raiz = Math.sqrt(numero);
				
				System.out.println();
				System.out.println("N�mero: " + numero);
				System.out.println("Quadrado: " + quadrado);
				System.out.println("Cubo: " + cubo);
				System.out.println("Raiz: " + decimalFormat.format(raiz));
			} else {
				continuar = false;
				System.out.println("Programa finalizado");
			}
			
		} while (continuar);

		teclado.close();

	}

}
