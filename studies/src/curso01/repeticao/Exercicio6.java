package curso01.repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// 6

		Scanner teclado = new Scanner(System.in);
		int a, soma = 0;
		double media;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um n�mero: ");
			a = teclado.nextInt();
			soma += a;
		}
		
		media = soma / 10;
		System.out.println("A m�dia � " + media);
		
		teclado.close();
	}

}
