package curso01.repeticao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// 7
		
		Scanner teclado = new Scanner(System.in);
		int a, soma = 0;
		double media;
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite o n�mero " + (i + 1) + ": ");
				a = teclado.nextInt();
				
				if (a < 0) {
					System.out.println("Digite um n�mero positivo.");
				} else {
					soma += a;
				}

			}
		
		System.out.println("A soma �: " + soma);
		media = (soma / 10);
		System.out.println("A m�dia �: " + media);
	
		teclado.close();

	}

}
