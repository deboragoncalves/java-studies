package curso01.funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio45 {

	public static void main(String[] args) {
		// 45
		
		Random aleatorio = new Random();
		
		System.out.println(desvioPadrao(aleatorio.nextInt(10) + 1));

	}
	
	public static String desvioPadrao(int numero) {
		Random aleatorio = new Random();
		
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");
		
		int vetor[] = new int[numero];
		int somatorioMedia = 0;
		double somatorioDesvioPadrao = 0.0;
		double media = 0.0;
		double desvioPadrao = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(10) + 0;
		}
		
		for (int valor : vetor) {
			System.out.print(valor + " ");
			somatorioMedia += valor;
		}
		
		System.out.println();
		media = (double) (somatorioMedia / vetor.length);
		
		for (int valor : vetor) {
			double subtracao = valor - media;
			somatorioDesvioPadrao += Math.pow(subtracao, 2);
		}
		
		desvioPadrao = (double) (somatorioDesvioPadrao / numero);
		System.out.print("Desvio Padr�o: ");
		return formatacaoDecimal.format(desvioPadrao);
		
		
	}

}
