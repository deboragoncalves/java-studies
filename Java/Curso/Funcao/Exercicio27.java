package funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio27 {

	public static void main(String[] args) {
		// 27

		Random aleatorio = new Random();

		System.out.println(senoTaylor(aleatorio.nextInt(100) + 1));
	}

	public static String senoTaylor(int angulo) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		System.out.println("Ângulo em graus: " + angulo);

		double pi = 3.141593;
		double radianos = (double) (angulo * pi) / 180;
		System.out.println("Ângulo em radianos: " + formatacaoDecimal.format(radianos));

		double somatorio = 0.0;
		int fatorial = 1;

		for (int i = 0; i <= 5; i++) {
			int numero = 2 * i + 1;
			int numeroFatorial = numero;
			
			while (numeroFatorial > 0) {
				fatorial *= numeroFatorial;
				numeroFatorial--;
			}
			
			double divisao = (double) (Math.pow(radianos, numero) / fatorial);
			somatorio += divisao;
			fatorial = 1;
		}
		
		System.out.print("Série de Taylor: ");
		return formatacaoDecimal.format(somatorio);
	
	}

}
