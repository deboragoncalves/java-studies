package curso01.funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio72 {

	public static void main(String[] args) {
		// 72
		
		double vetor1[] = new double[3];
		double vetor2[] = new double[3];
		
		somaVetores(vetor1, vetor2);
		System.out.println();

	}
	
	public static void somaVetores(double[] vetor1, double[] vetor2) {
		Random aleatorio = new Random();
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");
		
		double soma[] = new double[vetor1.length];
		
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = aleatorio.nextDouble();
		}
		
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = aleatorio.nextDouble();
		}
		
		System.out.print("Vetor 1: ");
		for (double valor : vetor1) {
			System.out.print(formatacaoDecimal.format(valor) + " ");
		}
		
		System.out.println();
		System.out.print("Vetor 2: ");
		for (double valor : vetor2) {
			System.out.print(formatacaoDecimal.format(valor) + " ");
		}
		
		for (int i = 0; i < soma.length; i++) {
			soma[i] = vetor1[i] + vetor2[i];
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Soma Vetores: ");
		for (double valor : soma) {
			System.out.print(formatacaoDecimal.format(valor) + " ");
		}
		
	}

}
