package curso01.vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13
		
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int posicao = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			vetor[i] = teclado.nextInt();
		}
		
		Arrays.sort(vetor);
		System.out.println("O maior valor � " + vetor[4] + " e a sua posi��o � a de " + (vetor.length - 1));
		System.out.println("O menor valor � " + vetor[0] + " e a sua posi��o � a de " + posicao);
		
		teclado.close();

	}

}
