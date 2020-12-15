package curso01.funcao;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio59 {

	public static void main(String[] args) {
		// 59
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		
		System.out.println(uniaoVetor(vetorA, vetorB));

	}
	
	public static Set<Integer> uniaoVetor(int[] vetorA, int[] vetorB) {
		Set<Integer> uniaoVetores = new HashSet<Integer>();
		
		Random aleatorio = new Random();
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = aleatorio.nextInt(15) + 0;
			uniaoVetores.add(vetorA[i]);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = aleatorio.nextInt(15) + 0;
			uniaoVetores.add(vetorB[i]);
		}
		
		System.out.print("Vetor A: ");
		for (int numero : vetorA) {
			System.out.print(numero + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B: ");
		for (int numero : vetorB) {
			System.out.print(numero + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Uni�o - Vetor A e B: ");
		return uniaoVetores;
	}

}
