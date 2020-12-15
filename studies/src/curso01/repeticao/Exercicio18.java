package curso01.repeticao;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// 18
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		int maior = 0;
		int numeros[] = new int[numero];
		
		for (int i = 0; i < numero; i++) {
			System.out.println("Digite um n�mero: ");
			numeros[i] = teclado.nextInt();
			
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
				
		}
		
		System.out.println("O maior n�mero � " + maior);
		
		teclado.close();
	}

}
