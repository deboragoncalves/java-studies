package curso01.vetores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio27 {

	public static void main(String[] args) {
		// 27

		Random aleatorio = new Random();

		ArrayList<Integer> vetor = new ArrayList<Integer>();
		Set<Integer> numerosNaoPrimos = new HashSet<Integer>();
		Set<Integer> numerosPrimos = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			vetor.add(aleatorio.nextInt(11) + 0);
		}

		numerosPrimos.addAll(vetor);
		
		System.out.println("Vetor: " + vetor);
		System.out.println("N�meros primos: " + numerosPrimos);

		/* N�meros n�o primos */

		for (int valor : vetor) {	
			for (int j = valor; j > 0; j--) {
				if (j != 1 && j != valor) {
					if (valor % j == 0) {
						numerosNaoPrimos.add(valor);
						numerosPrimos.remove(valor);
					}
				}

				}

		}
				
		System.out.println("N�meros n�o primos: " + numerosNaoPrimos);
		System.out.println("N�meros primos: " + numerosPrimos);

		} 
		
		/* Remover elementos repetidos ArrayList e criar numerosPrimos */
	}

