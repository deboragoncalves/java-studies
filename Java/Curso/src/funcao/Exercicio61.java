package funcao;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio61 {

	public static void main(String[] args) {
		// 61

		Set<Integer> vetorA = new HashSet<Integer>();
		Set<Integer> vetorB = new HashSet<Integer>();

		System.out.println(anagramas(vetorA, vetorB));

	}

	public static boolean anagramas(Set<Integer> vetorA, Set<Integer> vetorB) {

		Random aleatorio = new Random();
		int fatorial = 1;
		
		for (int i = 0; i < 3; i++) {
			vetorA.add(aleatorio.nextInt(73 - 65 + 1) + 65);
		}

		for (int i = 0; i < 3; i++) {
			vetorB.add(aleatorio.nextInt(73 - 65 + 1) + 65);
		}
		
		while (vetorA.size() < 3 || vetorB.size() < 3) {
			if (vetorA.size() > vetorB.size()) {
				vetorB.add(aleatorio.nextInt(73 - 65 + 1) + 65);
			} else {
				vetorA.add(aleatorio.nextInt(73 - 65 + 1) + 65);
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
		
		for (int valor : vetorB) {
			letrasB[contadorB] = valor;
			contadorB++;
		}

		for (int i = 0; i < letrasB.length; i++) {
			char letra = (char) letrasB[i];
			palavra2 += letra;
		}

		System.out.println();
		System.out.print("Palavra 2: " + palavra2);

		System.out.println();
		System.out.print("Anagramas - Palavra 1: ");
		for (int i = 0; i < anagramasA.length; i++) {
			String subString1 = palavra1.substring(0, 1);
			String subString2 = palavra1.substring(1, 2);
			String subString3 = palavra1.substring(2, 3);

			if (i == 0) {
				anagramasA[i] = subString1 + subString2 + subString3;
				System.out.print(anagramasA[i] + " ");
				
				if (anagramasA[i] == palavra2) {
					System.out.print("Este da Palavra 1 é igual à Palavra 2: ");
					return true;
				}
			} else if (i == 1) {
				anagramasA[i] = subString1 + subString3 + subString2;
				System.out.print(anagramasA[i] + " ");
				
				if (anagramasA[i] == palavra2) {
					System.out.print("Este da Palavra 1 é igual à Palavra 2: ");
					return true;
				}
			} else if (i == 2) {
				anagramasA[i] = subString2 + subString1 + subString3;
				System.out.print(anagramasA[i] + " ");
				
				if (anagramasA[i] == palavra2) {
					System.out.print("Este da Palavra 1 é igual à Palavra 2: ");
					return true;
				}
			} else if (i == 3) {
				anagramasA[i] = subString2 + subString3 + subString1;
				System.out.print(anagramasA[i] + " ");
				
				if (anagramasA[i] == palavra2) {
					System.out.print("Este da Palavra 1 é igual à Palavra 2: ");
					return true;
				}
			} else if (i == 4) {
				anagramasA[i] = subString3 + subString1 + subString2;
				System.out.print(anagramasA[i] + " ");
				
				if (anagramasA[i] == palavra2) {
					System.out.print("Este da Palavra 1 é igual à Palavra 2: ");
					return true;
				}
			} else if (i == 5) {
				anagramasA[i] = subString3 + subString2 + subString1;
				System.out.print(anagramasA[i] + " ");
				
				if (anagramasA[i] == palavra2) {
					System.out.print("Este da Palavra 1 é igual à Palavra 2: ");
					return true;
				}
			} 

		}
		System.out.println();
		System.out.print("Nenhum anagrama da Palavra 1 é igual à Palavra 2: ");
		return false;

	}

}
