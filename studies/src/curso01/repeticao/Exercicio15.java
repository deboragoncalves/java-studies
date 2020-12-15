package curso01.repeticao;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		int contagem = 1;
		
		if (numero > 0 && (numero % 2 != 0)) {
			
			for (int i = 0; i < numero; i++) {
				System.out.println("N�mero " + (i + 1) + ": " + contagem);
				contagem++;
			}
			
		} else {
			System.out.println("Digite um n�mero positivo e �mpar.");
		}
		
		teclado.close();

	}

}
