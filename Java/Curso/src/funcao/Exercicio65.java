package funcao;

import java.util.Random;

public class Exercicio65 {

	public static void main(String[] args) {
		// 65

		String palavra1 = "";
		String palavra2 = "";

		Random aleatorio = new Random();

		for (int i = 0; i < 5; i++) {
			char letra = (char) ((char) aleatorio.nextInt(73 - 65 + 1) + 65);
			palavra1 += letra;
		}

		for (int i = 0; i < 5; i++) {
			char letra = (char) ((char) aleatorio.nextInt(73 - 65 + 1) + 65);
			palavra2 += letra;
		}
		
		if ((palavra1.length() == palavra2.length()) && palavra1.length() == 5) {
			System.out.println(concatenar(palavra1, palavra2, aleatorio.nextInt(5) + 1));
		}
	}

	public static String concatenar(String string1, String string2, int tamanho) {
		String subString = "";

		System.out.println("Palavra 1: " + string1);
		System.out.println("Palavra 2: " + string2);
		
		System.out.println("Caracteres - Palavra 1: " + tamanho);
		
		for (int i = 0; i <= tamanho; i++) {
			subString = string1.substring(0, i);
		}

		System.out.print("Concetenar: ");
		return string2 + subString;
	}

}
