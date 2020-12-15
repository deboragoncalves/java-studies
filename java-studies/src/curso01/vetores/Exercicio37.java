package curso01.vetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		// 37
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		for (int i = 0; i < 11; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			vetor.add(teclado.nextInt());
		}
		
		System.out.println("Vetor n�o ordenado: " + vetor);
		Collections.sort(vetor);
		System.out.println();
		System.out.println("Vetor ordenado: " + vetor);

		teclado.close();

	}

}
