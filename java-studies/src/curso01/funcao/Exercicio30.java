package curso01.funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio30 {

	public static void main(String[] args) {
		// 30
		
		Random aleatorio = new Random();

		System.out.println(cossenoHiperbolicoTaylor(aleatorio.nextInt(100) + 1));

	}

	public static String cossenoHiperbolicoTaylor(int angulo) {
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
			
			somatorio += divisao;
			
			fatorial = 1;
		}
		
		System.out.print("Cosseno Hiperb�lico - S�rie de Taylor: ");
		return formatacaoDecimal.format(somatorio);
	}

}
