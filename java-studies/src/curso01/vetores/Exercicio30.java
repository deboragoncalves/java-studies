package curso01.vetores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio30 {

	public static void main(String[] args) {
		// 30
		
		Random aleatorio = new Random();

		Set<Integer> vetor1 = new HashSet<Integer>();
		Set<Integer> vetor2 = new HashSet<Integer>();
		ArrayList<Integer> vetorInterseccao = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			vetor1.add(aleatorio.nextInt(11) + 0);
			vetor2.add(aleatorio.nextInt(11) + 0);
		}
		
		for (int valor : vetor1) {
			if (vetor2.contains(valor)) {
				vetorInterseccao.add(valor);
			}
		}
		
		System.out.println("Vetor 1: " + vetor1);
		System.out.println("Vetor 2: " + vetor2);
		System.out.println("Vetor intersec��o entre 1 e 2: " + vetorInterseccao);
	}

}
