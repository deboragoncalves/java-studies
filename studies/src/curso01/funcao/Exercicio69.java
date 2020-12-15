package curso01.funcao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Exercicio69 {

	public static void main(String[] args) {
		// 69

		Random aleatorio = new Random();
		
		int numerador = aleatorio.nextInt(80) + 1;
		int denominador = aleatorio.nextInt(100) + 1;

		while (numerador > denominador) {
			numerador = aleatorio.nextInt(80) + 1;
		} 
		
		if (numerador < denominador) {
			leitura(numerador, denominador);
		}
		
	}

	public static void leitura(int numerador, int denominador) {
		if (numerador < denominador) {
			System.out.println("Numerador: " + numerador);
			System.out.println("Denominador: " + denominador);

			simplifica(numerador, denominador);
		} else {
			return;
		}
	}

	public static void simplifica(int numerador, int denominador) {
		ArrayList<Integer> divisores = new ArrayList<Integer>();

		for (int i = 1; i <= denominador; i++) {
			if (numerador % i == 0 && denominador % i == 0) {
				divisores.add(i);
			}
		}

		System.out.println();
		System.out.println("Divisores em comum: " + divisores);

		int maiorDivisor = divisores.get(divisores.size() - 1);
		int numeradorSimplificado = 1;
		int denominadorSimplificado = 1;

		if (maiorDivisor != 1) {
			numeradorSimplificado = numerador / maiorDivisor;
			denominadorSimplificado = denominador / maiorDivisor;
			System.out.println();
			System.out.println("Numerador Simplificado: " + numeradorSimplificado);
			System.out.println("Denominador Simplificado: " + denominadorSimplificado);
			
			System.out.println(operacoes(numeradorSimplificado, denominadorSimplificado));
		} else {
			System.out.println();
			System.out.println("A fra��o n�o � poss�vel de ser simplificada.");
		}
	}
	
	public static String operacoes(int numerador, int denominador) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");
		
		int soma = numerador + denominador;
		int subtracao = denominador - numerador;
		int multiplicacao = numerador * denominador;
		double divisao = denominador / numerador;
		
		System.out.println();
		System.out.println("Opera��es: ");
		return "Soma: " + soma + 
				"\nSubtra��o: " + subtracao + 
				"\nMultiplica��o: " + multiplicacao + 
				"\nDivis�o: " + formatacaoDecimal.format(divisao);

	}
}
