package funcao;

import java.util.Random;

public class Exercicio64 {

	public static void main(String[] args) {
		// 64
		
		String palavra1 = "";
		String palavra2 = "";
		
		System.out.println(concatenar(palavra1, palavra2));

	}
	
	public static String concatenar(String string1, String string2) {
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
		
		System.out.print("Concatenar: ");
		return string2 + string1;
	}
}
