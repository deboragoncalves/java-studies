package curso01.funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio31 {

	public static void main(String[] args) {
		// 31

		Random aleatorio = new Random();

		System.out.println(numeroNeperiano(aleatorio.nextInt(15) + 1));

	}

	public static String numeroNeperiano(int quantidade) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		System.out.println("Quantidade: " + quantidade);

		double somatorio = 0.0;
		int fatorial = 1;

		for (int i = 0; i <= quantidade; i++) {
			int numeroFatorial = i;

			while (numeroFatorial > 0) {
				fatorial *= numeroFatorial;
				numeroFatorial--;
			}

			double divisao = (double) 1 / fatorial;
		
			somatorio += divisao;

			fatorial = 1;
		}

		System.out.print("N�mero Neperiano: ");
		return formatacaoDecimal.format(somatorio);

	}
}
