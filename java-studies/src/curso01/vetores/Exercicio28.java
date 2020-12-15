package curso01.vetores;

import java.util.Random;

public class Exercicio28 {

	public static void main(String[] args) {
		// 28
		
		Random aleatorio = new Random();

		int v[] = new int[10];
		int v1[] = new int[10];
		int v2[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			v[i] = aleatorio.nextInt(11) + 0;
			
			if (v[i] % 2 == 0) {
				v1[i] = v[i];
			} else {
				v2[i] = v[i];
			}
		}
		
		System.out.println("Vetor original: ");
		for (int valor : v) {
			System.out.println(valor);
		}
		
		System.out.println();
		System.out.println("Vetor com valores pares: ");
		for (int valor : v1) {
			if (valor != 0) {
				System.out.println(valor);
			}
		}
		
		System.out.println();
		System.out.println("Vetor com valores �mpares: ");
		for (int valor : v2) {
			if (valor != 0) {
				System.out.println(valor);
			}
		}

	}

}
