package curso01.vetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio31 {

	public static void main(String[] args) {
		// 31
		
		Random aleatorio = new Random();

		ArrayList<Integer> vetor1 = new ArrayList<Integer>();
		ArrayList<Integer> vetor2 = new ArrayList<Integer>();
		Set<Integer> vetorUniao = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			vetor1.add(aleatorio.nextInt(11) + 0);
			vetor2.add(aleatorio.nextInt(11) + 0);
		}
		
		Collections.sort(vetor1);
		Collections.sort(vetor2);
		
		vetorUniao.addAll(vetor1);
		vetorUniao.addAll(vetor2);
				
		System.out.println("Vetor 1: " + vetor1);
		System.out.println("Vetor 2: " + vetor2);
		System.out.println("Vetor uni�o entre 1 e 2: " + vetorUniao);

	}

}
