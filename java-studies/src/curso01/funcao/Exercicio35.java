package curso01.funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio35 {

	public static void main(String[] args) {
		// 35
		
		Random aleatorio = new Random();
		
		System.out.println(fatorialQuadruplo(aleatorio.nextInt(15) + 1));
	}
	
	public static String fatorialQuadruplo(int numero) {
		System.out.println("N�mero: " + numero);
		
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		int numerador = 2 * numero;
		int fatorialDenominador = 1;
		int fatorialNumerador = 1;
		
		for (int i = numerador; i > 0; i--) {
			fatorialNumerador *= i;
		}
		
		for (int i = numero; i > 0; i--) {
			fatorialDenominador *= i;
		}
		
		double divisao = (double) fatorialNumerador / fatorialDenominador;
		
		System.out.print("Fatorial Qu�druplo de " + numero + ": ");
		return formatacaoDecimal.format(divisao);
	}

}
