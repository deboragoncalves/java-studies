package funcao;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio70 {

	public static void main(String[] args) {
		// 70

		Random aleatorio = new Random();

		int numerador = aleatorio.nextInt(80) + 1;
		int denominador = aleatorio.nextInt(100) + 1;
		
		double numeroA = aleatorio.nextDouble();
		double numeroB = aleatorio.nextDouble();

		System.out.println(divisao(numerador, denominador));
		System.out.println(negativo(numerador, denominador));
		System.out.println(soma(numeroA, numeroB));
		System.out.println(multiplicacao(numeroA, numeroB));
		System.out.println(divisao(numeroA, numeroB));

	}

	public static String divisao(int numerador, int denominador) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		System.out.println("Numerador: " + numerador);
		System.out.println("Denominador: " + denominador);

		double divisao = numerador / denominador;

		System.out.println();
		System.out.print("Divisão entre " + numerador + " e " + denominador + ": ");
		return formatacaoDecimal.format(divisao);
		
	}
	
	public static String negativo(int numerador, int denominador) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");
		
		double divisao = numerador / denominador;

		System.out.println();
		System.out.print("Número Negativo (" + divisao + "): ");
		
		double numeroNegativo = divisao * (-1);
		return formatacaoDecimal.format(numeroNegativo);
	}
	
	public static String soma(double numero1, double numero2) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		double somatorio = numero1 + numero2;
		
		System.out.println();
		System.out.print("Soma de " + formatacaoDecimal.format(numero1) + " e " + formatacaoDecimal.format(numero2) + ": ");
		return formatacaoDecimal.format(somatorio);
	}
	
	public static String multiplicacao(double numero1, double numero2) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		double multiplicacao = numero1 * numero2;
		
		System.out.println();
		System.out.print("Multiplicação de " + formatacaoDecimal.format(numero1) + " e " + formatacaoDecimal.format(numero2) + ": ");
		return formatacaoDecimal.format(multiplicacao);
	}
	
	public static String divisao(double numero1, double numero2) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		double divisao = numero2 / numero1;
		
		System.out.println();
		System.out.print("Divisão de " + formatacaoDecimal.format(numero2) + " e " + formatacaoDecimal.format(numero1) + ": ");
		return formatacaoDecimal.format(divisao);
	}

}
