package funcao;

import java.util.Random;

public class Exercicio44 {

	public static void main(String[] args) {
		// 44

		Random aleatorio = new Random();

		int vetor[] = new int[30];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(25) + 1;
		}

		vetorParImpar(vetor);
		System.out.println();
	}

	public static void vetorParImpar(int[] vetor) {
		System.out.print("Vetor: ");

		for (int numero : vetor) {
			System.out.print(numero + " ");
		}

		int contadorPar = 0;
		int contadorImpar = 0;
		int vetorPar[] = new int[vetor.length];
		int vetorImpar[] = new int[vetor.length];

		System.out.println();
		for (int numero : vetor) {

			if (numero % 2 == 0) {
				contadorPar++;
				vetorPar[contadorPar] = numero;
			} else {
				contadorImpar++;
				vetorImpar[contadorImpar] = numero;
			}
		}
		
		System.out.println();
		System.out.println("Vetor - Números Pares: ");
		for (int numero : vetorPar) {
			if (numero != 0) {
				System.out.print(numero + " ");
			}
		} 
		
		System.out.println();
		System.out.println();
		System.out.println("Vetor - Números Impares: ");
		for (int numero : vetorImpar) {
			if (numero != 0) {
				System.out.print(numero + " ");
			}
		}
	}

}
