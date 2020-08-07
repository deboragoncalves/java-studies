package funcao;

import java.util.Random;

public class Exercicio66 {

	public static void main(String[] args) {
		// 66
		
		Random aleatorio = new Random();
		
		char letra = (char) ((char) aleatorio.nextInt(122 - 97 + 1) + 97);
		
		System.out.println(letraMaiuscula(letra));
	}
	
	public static char letraMaiuscula(char letra) {
		System.out.println("Letra Minúscula: " + letra);
		String stringLetra = String.valueOf(letra).toUpperCase();
		System.out.print("Letra Maiúscula: ");
		return stringLetra.charAt(0);
	}

}
