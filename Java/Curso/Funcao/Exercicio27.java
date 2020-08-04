package funcao;

import java.util.Random;

public class Exercicio27 {

	public static void main(String[] args) {
		// 27

		Random aleatorio = new Random();
		
		System.out.println(senoTaylor(aleatorio.nextInt(100) + 1));
	}
	
	public static int senoTaylor(int angulo) {
		System.out.println("Ângulo em graus: " + angulo);
		double pi = 3.141593;
		double radianos = (double) (angulo * pi) / 180;
	}

}
