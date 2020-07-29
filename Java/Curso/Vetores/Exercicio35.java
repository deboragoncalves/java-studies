import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		// 35

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número inteiro entre 0 e 10.000: ");
		int a = teclado.nextInt();

		System.out.println("Digite um outro número inteiro entre 0 e 10.000: ");
		int b = teclado.nextInt();

		ArrayList<Integer> vetorA = new ArrayList<Integer>();
		ArrayList<Integer> vetorB = new ArrayList<Integer>();
		ArrayList<Integer> somaVetores = new ArrayList<Integer>();

		int soma = 0;
		int unidadeA, dezenaA, centenaA, unidMilharA;
		int unidadeB, dezenaB, centenaB, unidMilharB;
		String numeroA = Integer.toString(a);
		String numeroB = Integer.toString(b);

		if (a > 0 && a < 10000) {

			if (numeroA.length() == 4) {

				unidMilharA = a / 1000;
				a = a % 1000;

				centenaA = a / 100;
				a = a % 100;

				dezenaA = a / 10;
				a = a % 10;

				unidadeA = a;

				vetorA.add(unidMilharA);
				vetorA.add(centenaA);
				vetorA.add(dezenaA);
				vetorA.add(unidadeA);

			} else if (numeroA.length() == 3) {

				centenaA = a / 100;
				a = a % 100;

				dezenaA = a / 10;
				a = a % 10;

				unidadeA = a;

				vetorA.add(centenaA);
				vetorA.add(dezenaA);
				vetorA.add(unidadeA);

			} else if (numeroA.length() == 2) {

				dezenaA = a / 10;
				a = a % 10;

				unidadeA = a;

				vetorA.add(dezenaA);
				vetorA.add(unidadeA);

			}
				Collections.sort(vetorA);
				
				System.out.println("Vetor A: " + vetorA);
		} else {
			System.out.println("Não foi possível calcular o vetor A. Os valores informados não estão dentro do intervalo requerido (0 e 10.000).");
			return;
		}
		
		if (b > 0 && b < 10000) {
				if (numeroB.length() == 4) {

					unidMilharB = b / 1000;
					b = b % 1000;

					centenaB = b / 100;
					b = b % 100;

					dezenaB = b / 10;
					b = b % 10;

					unidadeB = b;

					vetorB.add(unidMilharB);
					vetorB.add(centenaB);
					vetorB.add(dezenaB);
					vetorB.add(unidadeB);

				} else if (numeroB.length() == 3) {

					centenaB = b / 100;
					b = b % 100;

					dezenaB = b / 10;
					b = b % 10;

					unidadeB = b;

					vetorB.add(centenaB);
					vetorB.add(dezenaB);
					vetorB.add(unidadeB);

				} else if (numeroB.length() == 2) {

					dezenaB = b / 10;
					b = b % 10;

					unidadeB = b;

					vetorB.add(dezenaB);
					vetorB.add(unidadeB);

				}
				
				System.out.println("Vetor B: " + vetorB);
		} else {
			System.out.println("Não foi possível calcular o vetor B. Os valores informados não estão dentro do intervalo requerido (0 e 10.000).");
			return;
		}
		
		if (numeroA.length() == numeroB.length()) {
			for (int i = 0; i < numeroA.length(); i++) {
				soma = vetorA.get(i) + vetorB.get(i);
				somaVetores.add(soma);
			}
		}
		
		System.out.println("Soma Vetores A e B: " + somaVetores);
				

		teclado.close();
	}

}


