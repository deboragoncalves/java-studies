package curso01.repeticao;

import java.util.Scanner;

public class Exercicio58 {

	public static void main(String[] args) {
		// 58
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o n�mero 1: ");
		int a = teclado.nextInt();
		System.out.println("Digite o n�mero 2: ");
		int b = teclado.nextInt();
		int soma = 0;
		
		for (int i = a; i <= b; i++) {
			if (i % i == 0 && i % 1 == 0 && i % 2 != 0 && i % 3 != 0) {
				System.out.println("N�mero primo " + i);
				soma += i;
			}
		}
		
		System.out.println("A soma dos n�meros primos entre " + a + " e " + b + " � de " + soma);
		
		
		teclado.close();

	}

}
