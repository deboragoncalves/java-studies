package curso01.vetores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// 4
		
		Scanner valores = new Scanner(System.in);
		
		int vetor[] = new int[8];
		int coordenadasX[] = new int[8];
		int coordenadasY[] = new int[8];
		int soma = 0;

		for (int i = 0; i < 8; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			vetor[i] = valores.nextInt();
			
			if (i % 2 == 0) {
				coordenadasX[i] = vetor[i];
				soma = coordenadasX[i];
			} else {
				coordenadasY[i] = vetor[i];
				soma += coordenadasY[i];
				System.out.println("Soma das coordenadas X e Y: " + soma);
			}
		}
		
		valores.close();

	}

}
