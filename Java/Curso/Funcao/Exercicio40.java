package funcao;

import java.util.Random;

public class Exercicio40 {

	public static void main(String[] args) {
		// 40
		
		Random aleatorio = new Random();
		
		int vetor[] = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(20) + 1;
		}
		
		System.out.println(numerosPares(vetor));
	}
	
	public static int numerosPares(int[] vetor) {
		int contador = 0;
		
		System.out.print("Vetor: ");
		for (int numero : vetor) {
			System.out.print(numero + " ");
			
			if (numero % 2 == 0) {
				contador++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Quantidade de números pares do vetor: ");
		return contador;
	}

}
