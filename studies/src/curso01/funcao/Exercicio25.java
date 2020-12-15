package curso01.funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio25 {

	public static void main(String[] args) {
		// 25
		
		Random aleatorio = new Random();

		System.out.println(serie(aleatorio.nextInt(20) + 1));
	}
	
	public static String serie(int numero) {
		System.out.println("N�mero: " + numero);
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");
		double somatorio = (double) 0.0;
		
		for (int i = 1; i <= numero; i++) {
			somatorio += (Math.pow(i, 2) + 1) / (i + 3);
		}
		
		return formatacaoDecimal.format(somatorio);
	}

}
