package funcao;

import java.util.Random;

public class Exercicio23 {

	public static void main(String[] args) {
		// 23

		Random aleatorio = new Random();

		triangulo(aleatorio.nextInt(10) + 1);

	}

	public static void triangulo(int numero) {
		System.out.println("Número: " + numero);
		int base = 2 * numero - 1;
		String asterisco = "";
		
		for (int i = base; i > 0; i--) {
			asterisco += "*";
			System.out.println(asterisco);
		}

	}
}
