package curso01.funcao;

import java.util.Random;

public class Exercicio68 {

	public static void main(String[] args) {
		// 68

		String palavra1 = "";
		String palavra2 = "";

		intercalar(palavra1, palavra2);
		System.out.println();

	}

	public static void intercalar(String string1, String string2) {
		Random aleatorio = new Random();

		for (int i = 0; i < 5; i++) {
			char letra = (char) ((char) aleatorio.nextInt(73 - 65 + 1) + 65);
			string1 += letra;
		}

		for (int i = 0; i < 5; i++) {
			char letra = (char) ((char) aleatorio.nextInt(73 - 65 + 1) + 65);
			string2 += letra;
		}

		String[] intercalar = new String[string2.length() + string1.length()];
		String subString1 = "";
		String subString2 = "";
		
		int contador1 = 0;
		int contador2 = 1;
		int contador3 = 0;
		int contador4 = 1;
		int par = 0;
		int impar = 1;

		for (int i = 0; i < intercalar.length; i++) {

			if (i % 2 == 0) {
				while (contador1 < 5 && contador2 < 6 && par < 9) {
					subString1 = string1.substring(contador1, contador2);
					intercalar[par] = subString1;
					contador1++;
					contador2++;
					par = par + 2;
				}
			}

			if (i % 2 != 0) {
				while (contador3 < 5 && contador4 < 6 && impar < 10) {
					subString2 = string2.substring(contador3, contador4);
					intercalar[impar] = subString2;
					contador3++;
					contador4++;
					impar = impar + 2;
				}
			}

		}

		System.out.println("Palavra 1: " + string1);
		System.out.println("Palavra 2: " + string2);
		
		System.out.print("Strings Intercaladas: ");
		for (String letra : intercalar) {
			System.out.print(letra + " ");
		}
	}

}
