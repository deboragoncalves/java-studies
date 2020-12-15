package curso01.repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// 5
		Scanner teclado = new Scanner(System.in);
		int a, soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um n�mero: ");
			a = teclado.nextInt();
			soma += a;
		}
		
		System.out.println("A soma � " + soma);
		
		teclado.close();

	}

}
