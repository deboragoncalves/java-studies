package JavaFor;

import java.util.Scanner;

public class Exercicio57 {

	public static void main(String[] args) {
		// 57
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o n�mero 1: ");
		int a = teclado.nextInt();
		System.out.println("Digite o n�mero 2: ");
		int b = teclado.nextInt();
		int contador = 0;
		
		for (int i = a; i <= b; i++) {
			if (i % i == 0 && i % 1 == 0 && i % 2 != 0 && i % 3 != 0) {
				System.out.println("N�mero primo " + i);
				contador++;
			}
		}
		
		System.out.println("Entre " + a + " e " + b + ", existem " + contador + " n�meros primos");
		
		
		teclado.close();

	}

}
