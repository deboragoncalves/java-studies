package curso01.repeticao;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// 17
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = teclado.nextInt();
		int contagem = 0, soma = 0;
		
		if (numero > 0) {
			
			for (int i = 0; i < numero; i++) {
				System.out.println("N�mero " + (i + 1) + ": " + contagem);
				contagem++;
				soma += contagem;
			}
			
			System.out.println("A soma dos n�meros �: " + soma);
			
		} else {
			System.out.println("Digite um n�mero positivo.");
		}
		
		teclado.close();

	}

}
