package curso01.repeticao;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// 19
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = teclado.nextInt();
		
		if (numero >= 100 & numero <= 999) {
			char[] numeros = String.valueOf(numero).toCharArray();
			System.out.println("Algarismos: ");
			
			for (char n : numeros) {
				System.out.println(n);
			}
			
		} else {
			System.out.println("Digite um n�mero entre 100 e 999");
		}
		
		teclado.close();

	}

}
