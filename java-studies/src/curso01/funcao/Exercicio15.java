package curso01.funcao;

import java.util.Random;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15
		
		Random aleatorio = new Random();
		
		System.out.println(triangulo(aleatorio.nextInt(15) + 0, aleatorio.nextInt(15) + 0, aleatorio.nextInt(15) + 0));

	}
	
	public static String triangulo(int lado1, int lado2, int lado3) {
		System.out.println("Lados do tri�ngulo: " + lado1 + ", " + lado2 + ", " + lado3);
		
		if (lado1 < (lado2 + lado3) || lado2 < (lado1 + lado3) || lado3 < (lado2 + lado3)) {
			if ((lado1 == lado2) && (lado2 == lado3)) {
				return "Tri�ngulo equil�tero.";
			} else if ((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)) {
				return "Tri�ngulo is�sceles.";
			} else if ((lado1 != lado2) && (lado2 != lado3)) {
				return "Tri�ngulo escaleno.";
			} else {
				return "N�o foi poss�vel saber o tipo de tri�ngulo.";
			}
		} else {
			return "N�o � um tri�ngulo.";
		}
	}

}
