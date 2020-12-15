package curso01.funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio28 {

	public static void main(String[] args) {
		// 28
		
		Random aleatorio = new Random();

		System.out.println(cossenoTaylor(aleatorio.nextInt(100) + 1));
	}
	
	public static String cossenoTaylor(int angulo) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		System.out.println("�ngulo em graus: " + angulo);

		double pi = 3.141593;
		double radianos = (double) (angulo * pi) / 180;
		System.out.println("�ngulo em radianos: " + formatacaoDecimal.format(radianos));

		double somatorio = 0.0;
		int fatorial = 1;

		for (int i = 0; i <= 5; i++) {
			int numero = 2 * i;
			int numeroFatorial = numero;
			
			while (numeroFatorial > 0) {
				fatorial *= numeroFatorial;
				numeroFatorial--;
			}
			
			double divisao = (double) (Math.pow(radianos, numero) / fatorial);
			
			if (i == 1 || i == 3 || i == 5) {
				somatorio -= divisao;
			} else {
				somatorio += divisao;
			}
			
			fatorial = 1;
		}
		
		System.out.print("Cosseno - S�rie de Taylor: ");
		return formatacaoDecimal.format(somatorio);
	}

}
