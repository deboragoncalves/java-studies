package funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio42 {

	public static void main(String[] args) {
		// 42
		
		Random aleatorio = new Random();
		
		int vetor[] = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(20) + 0;
		}
		
		System.out.println(mediaNumeros(vetor));
	}
	
	public static String mediaNumeros(int[] vetor) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		int somatorio = 0;
		double media = 0.0;
		
		System.out.print("Vetor: ");
		for (int numero : vetor) {
			System.out.print(numero + " ");
			
			somatorio += numero;
		}
		
		media = (double) (somatorio / vetor.length);
		System.out.println();
		System.out.print("Média: ");
		return formatacaoDecimal.format(media);
	}

}
