package curso01.funcao;

import java.util.Random;

public class Exercicio63 {

	public static void main(String[] args) {
		// 63
				
		String palavra1 = "";
		String palavra2 = "";
		
		System.out.println(stringsIguais(palavra1, palavra2));

	}
	
	public static boolean stringsIguais(String string1, String string2) {
		Random aleatorio = new Random();
		
		for (int i = 0; i < 5; i++) {
			char letra = (char) ((char) aleatorio.nextInt(73 - 65 + 1) + 65);
			string1 += letra;
		}
		
		for (int i = 0; i < 5; i++) {
			char letra = (char) ((char) aleatorio.nextInt(73 - 65 + 1) + 65);
			string2 += letra;
		}
		
		System.out.println("Palavra 1: " + string1);
		System.out.println("Palavra 2: " + string2);
		
		if (string1.equals(string2)) {
			System.out.print("Palavras iguais: ");
			return true;
		} else if (string2.equals(string1)) {
			System.out.print("Palavras iguais: ");
			return true;
		} else {
			System.out.print("Palavras diferentes: ");
			return false;
		}

	}

}
