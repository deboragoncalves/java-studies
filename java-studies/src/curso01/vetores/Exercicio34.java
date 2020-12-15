package curso01.vetores;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio34 {

	public static void main(String[] args) {
		// 34
		
		Scanner teclado = new Scanner(System.in);
		
		Set<Integer> vetor = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			int numero = teclado.nextInt();
			
			if (vetor.contains(numero)) {
				i--;
			}
			
			vetor.add(numero);
		}
		
		System.out.println("Vetor " + vetor);

		teclado.close();

	}

}
