package curso01.repeticao;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		int contagem = 0;
		
		if (numero > 0 && (numero % 2 == 0)) {
			
			for (int i = 0; i < numero; i++) {
				System.out.println("N�mero " + (i + 1) + ": " + contagem);
				contagem++;
			}
			
		} else {
			System.out.println("Digite um n�mero positivo e par.");
		}
		
		teclado.close();

	}

}
