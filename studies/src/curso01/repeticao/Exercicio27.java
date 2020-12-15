package curso01.repeticao;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// 27
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		double harmonico = 0.0;
		double soma = 1;
		
		if (numero > 0) {
			
			for (int i = 1; i <= numero; i++) {
				harmonico = (1 / i);
				soma += harmonico;
			}
			
		} else {
			System.out.println("Digite um n�mero positivo.");
		}
		
		System.out.println("N�mero Harm�nico: " + soma);
		
		teclado.close();

	}

}
