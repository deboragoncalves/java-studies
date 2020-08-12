package funcao;

import java.util.Random;

public class Exercicio21 {

	public static void main(String[] args) {
		// 21

		Random aleatorio = new Random();

		System.out.println(numerosPrimos(aleatorio.nextInt(20) + 1));

	}

	public static int numerosPrimos(int numero) {
		System.out.println("Número: " + numero);
		int contador = 0;

		for (int i = 1; i < numero; i++) {
			
			boolean ehPrimo = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					ehPrimo = false;
					break;
				}
			}
			

			if (ehPrimo) {
				contador++;
			}

		}
		
		System.out.print("Números primos: ");
		return contador;
	}

}
