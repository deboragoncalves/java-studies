package curso01.funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio46 {

	public static void main(String[] args) {
		// 46

		Random aleatorio = new Random();

		int numero = aleatorio.nextInt(10) + 1;
		int vetor[] = new int[numero];

		impressaoVetor(vetor);
	}

	public static void impressaoVetor(int[] vetor) {
		Random aleatorio = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(15) + 1;
		}

		vetorInvertido(vetor);
		System.out.println(media(vetor));
	}

	public static void vetorInvertido(int[] vetor) {
		int invertido[] = new int[vetor.length];

		System.out.print("Vetor: ");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}

		int contador = vetor.length - 1;
		System.out.println();

		for (int i = 0; i < vetor.length; i++) {
			invertido[i] = vetor[contador];
			contador--;
		}
		
		System.out.print("Vetor invertido: ");
		for (int numero : invertido) {
			System.out.print(numero + " ");
		}

	}
	
	public static String media(int[] vetor) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");
		int somatorio = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			somatorio += vetor[i]; 
		}
		
		double media = (double) (somatorio / vetor.length);
		System.out.println();
		System.out.print("M�dia: ");
		return formatacaoDecimal.format(media);
	}

}
