package curso01.repeticao;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// 24
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = teclado.nextInt();
		int soma = 0;
		
		if (numero > 0) {
			
			System.out.println("Divisores: ");
			
			for (int i = numero; i > 0; i--) {
				if (numero % i == 0 && i != numero) {
					System.out.println(i);
					soma += i;
				}
			}
			
		} else {
			System.out.println("Digite um n�mero positivo.");
		}
		
		System.out.println("A soma dos divisores � " + soma); 
		
		teclado.close();
	}

}
