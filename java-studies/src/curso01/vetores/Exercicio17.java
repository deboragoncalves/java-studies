package curso01.vetores;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// 17
		
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			vetor[i] = teclado.nextInt();
			
			if (vetor[i] < 0) {
				vetor[i] = 0;
			}
		}
		
		System.out.println("Valores do Vetor ");
		for (int valor : vetor) {
			System.out.println(valor);
		}
		
		teclado.close();

	}

}
