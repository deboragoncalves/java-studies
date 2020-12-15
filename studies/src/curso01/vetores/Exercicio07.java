package curso01.vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// 07
		
		Scanner valores = new Scanner(System.in);
		
		int numeros[] = new int[10];
		int posicao = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor " + (i + 1) + "o valor: ");
			numeros[i] = valores.nextInt();
			posicao = i;
		}
		
		Arrays.sort(numeros);
		System.out.println("O maior valor � " + numeros[9] + " e est� na posi��o " + posicao);
		
		valores.close();

	}

}
