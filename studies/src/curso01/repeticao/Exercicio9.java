package curso01.repeticao;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// 9
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		int impar = 1;
		
		for (int i = 0; i < numero; i++) {
			System.out.println("N�mero " + (i + 1) + ": " + impar);
			impar += 2;
		}
		
		teclado.close();

	}

}
