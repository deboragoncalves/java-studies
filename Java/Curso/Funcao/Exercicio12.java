package funcao;

import java.util.Random;

public class Exercicio12 {

	public static void main(String[] args) {
		// 12

		Random aleatorio = new Random();

		somaAlgarismos(aleatorio.nextInt(200) + 1);

	}

	public static void somaAlgarismos(int numero) {
		if (numero > 0) {
			System.out.println("Número: " + numero);
			
			char digitos[] = String.valueOf(numero).toCharArray();

			System.out.print("Algarismos: ");
			for (char a : digitos) {
				System.out.print(a + " ");
			}
			
		} else {
			System.out.println("O número é inválido");
		}

	}
}
