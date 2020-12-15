package curso01.vetores;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio33 {

	public static void main(String[] args) {
		// 33

		Scanner teclado = new Scanner(System.in);
		
		Set<Integer> vetor = new HashSet<Integer>();
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			vetor.add(teclado.nextInt());
		}
		
		System.out.println("Vetor com o valor 0 " + vetor);
		
		if (vetor.contains(0)) {
			vetor.remove(0);
		}
		
		System.out.println("Vetor sem o valor 0 " + vetor);
		
		teclado.close();
	}

}
