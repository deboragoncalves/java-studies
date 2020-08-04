package funcao;

import java.util.Random;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15
		
		Random aleatorio = new Random();
		
		System.out.println(triangulo(aleatorio.nextInt(15) + 0, aleatorio.nextInt(15) + 0, aleatorio.nextInt(15) + 0));

	}
	
	public static String triangulo(int lado1, int lado2, int lado3) {
		System.out.println("Lados do triângulo: " + lado1 + ", " + lado2 + ", " + lado3);
		
		if (lado1 < (lado2 + lado3) || lado2 < (lado1 + lado3) || lado3 < (lado2 + lado3)) {
			if ((lado1 == lado2) && (lado2 == lado3)) {
				return "Triângulo equilátero.";
			} else if ((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)) {
				return "Triângulo isósceles.";
			} else if ((lado1 != lado2) && (lado2 != lado3)) {
				return "Triângulo escaleno.";
			} else {
				return "Não foi possível saber o tipo de triângulo.";
			}
		} else {
			return "Não é um triângulo.";
		}
	}

}
