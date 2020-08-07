package funcao;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio61 {

	public static void main(String[] args) {
		// 61

		Set<Integer> vetorA = new HashSet<Integer>();
		Set<Integer> vetorB = new HashSet<Integer>();
		boolean tamanhoA = (vetorA.size() == 3);
		boolean tamanhoB = (vetorB.size() == 3);

		System.out.println(anagramas(vetorA, vetorB, tamanhoA, tamanhoB));

	}

	public static String anagramas(Set<Integer> vetorA, Set<Integer> vetorB, boolean tamanhoA, boolean tamanhoB) {

		Random aleatorio = new Random();
		int fatorial = 1;

		if (tamanhoA && tamanhoB) {
			for (int i = 0; i < vetorA.size(); i++) {
				vetorA.add(aleatorio.nextInt(73 - 65 + 1) + 65);
			}

			for (int i = 0; i < vetorB.size(); i++) {
				vetorB.add(aleatorio.nextInt(73 - 65 + 1) + 65);
			}
		}

		int letrasA[] = new int[vetorA.size()];
		int letrasB[] = new int[vetorB.size()];

		int contadorA = 0;
		int contadorB = 0;
		int tamanho = vetorA.size();

		String palavra1 = "";
		String palavra2 = "";

		while (tamanho > 0) {
			fatorial *= tamanho;
			tamanho--;
		}

		System.out.println("Fatorial: " + fatorial);
		String anagramasA[] = new String[fatorial];
		
			for (int valor : vetorA) {
				letrasA[contadorA] = valor;
				contadorA++;
			}

			for (int i = 0; i < letrasA.length; i++) {
				char letra = (char) letrasA[i];
				palavra1 += letra;
			}

			System.out.print("Palavra 1: " + palavra1);

			System.out.println();
			for (int i = 0; i < anagramasA.length; i++) {
				String subString1 = palavra1.substring(0, 1);
				String subString2 = palavra1.substring(1, 2);
				String subString3 = palavra1.substring(2, 3);

				if (i == 0) {
					anagramasA[i] = subString1 + subString2 + subString3;
					System.out.print(anagramasA[i] + " ");
				} else if (i == 1) {
					anagramasA[i] = subString1 + subString3 + subString2;
					System.out.print(anagramasA[i] + " ");
				} else if (i == 2) {
					anagramasA[i] = subString2 + subString1 + subString3;
					System.out.print(anagramasA[i] + " ");
				} else if (i == 3) {
					anagramasA[i] = subString2 + subString3 + subString1;
					System.out.print(anagramasA[i] + " ");
				} else if (i == 4) {
					anagramasA[i] = subString3 + subString1 + subString2;
					System.out.print(anagramasA[i] + " ");
				} else if (i == 5) {
					anagramasA[i] = subString3 + subString2 + subString1;
					System.out.print(anagramasA[i] + " ");
				}

			}

			System.out.println();
			for (int valor : vetorB) {
				letrasB[contadorB] = valor;
				contadorB++;
			}

			System.out.print("Palavra 2: ");
			for (int valor : letrasB) {
				char letra = (char) valor;
				System.out.print(letra);
			}

		return " ";
	}

}
