package curso01.funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio14 {

	public static void main(String[] args) {
		// 14
		
		Random aleatorio = new Random();
		
		System.out.println(consumoCarro(aleatorio.nextInt(500) + 0, aleatorio.nextInt(500) + 0));

	}
	
	public static String consumoCarro(int distancia, int litros) {
		System.out.println("A dist�ncia � de " + distancia + "km. E foram consumidos " + litros + "L.");
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");
		
		double consumo = (double) distancia / litros;
		System.out.print("O consumo foi de ");
		return formatacaoDecimal.format(consumo);
	}

}
