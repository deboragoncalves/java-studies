package funcao;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio32 {

	public static void main(String[] args) {
		// 32
		
		Random aleatorio = new Random();
		
		simplifica(aleatorio.nextInt(80) + 1, aleatorio.nextInt(100) + 1);
	}
	
	public static void simplifica(int numerador, int denominador) {
		System.out.println("Numerador: " + numerador);
		System.out.println("Denominador: " + denominador);
		
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
		} else {
			System.out.println();
			System.out.println("A fração não é possível de ser simplificada.");
		}
	}

}
