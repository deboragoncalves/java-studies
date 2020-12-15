package curso01.vetores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Exercicio32 {

	public static void main(String[] args) {
		// 32
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Integer> vetor1 = new ArrayList<Integer>();
		ArrayList<Integer> vetor2 = new ArrayList<Integer>();
		ArrayList<Integer> somaVetores = new ArrayList<Integer>();
		ArrayList<Integer> multiplicacaoVetores = new ArrayList<Integer>();
		ArrayList<Integer> subtracaoVetores = new ArrayList<Integer>();
		Set<Integer> vetorUniao = new HashSet<Integer>();
		Set<Integer> vetorInterseccao = new HashSet<Integer>();
		
		int soma = 0;
		int subtracao = 0;
		int multiplicacao = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("1 - Digite o " + (i + 1) + "o n�mero do vetor 1: ");
			vetor1.add(teclado.nextInt());
			
			System.out.println("2 - Digite o " + (i + 1) + "o n�mero do vetor 2: ");
			vetor2.add(teclado.nextInt());
		}
		
		System.out.println("Vetor 1: " + vetor1);
		System.out.println("Vetor 2: " + vetor2);
		
		for (int i = 0; i < 5; i++) {
			soma = vetor1.get(i) + vetor2.get(i);
			somaVetores.add(soma);
			
			multiplicacao = vetor1.get(i) * vetor2.get(i);
			multiplicacaoVetores.add(multiplicacao);
			
			subtracao = vetor1.get(i) - vetor2.get(i);
			subtracaoVetores.add(subtracao);
		}
		
		vetorUniao.addAll(vetor1);
		vetorUniao.addAll(vetor2);
		
		for (int valor : vetor1) {
			if (vetor2.contains(valor)) {
				vetorInterseccao.add(valor);
			}
		}
		
		System.out.println();
		System.out.println("Soma vetor 1 e 2: " + somaVetores);
		System.out.println();
		System.out.println("Multiplica��o vetor 1 e 2: " + multiplicacaoVetores);
		System.out.println();
		System.out.println("Subtra��o vetor 1 e 2: " + subtracaoVetores);
		System.out.println();
		System.out.println("Uni�o entre vetor 1 e 2: " + vetorUniao);
		System.out.println();
		System.out.println("Intersec��o entre vetor 1 e 2: " + vetorInterseccao);
		
		teclado.close();


	}

}
