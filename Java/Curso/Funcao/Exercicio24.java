package funcao;

import java.util.Arrays;
import java.util.Random;

public class Exercicio24 {

	public static void main(String[] args) {
		// 24

		Random aleatorio = new Random();

		triangulo(aleatorio.nextInt(15) + 1);

	}

	public static void triangulo(int numero) {
		System.out.println("Número: " + numero);
		int base = 2 * numero - 1;

		for (int i = 1; i <= base; i = i + 2) {
			char asterisco = '*';
			char[] vetorAsteriscos = new char[i];
			Arrays.fill(vetorAsteriscos, asterisco);
			String stringAsteriscos = new String(vetorAsteriscos);
		    System.out.println(stringAsteriscos);
		}

	}

}
