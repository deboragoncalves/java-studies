package JavaFor;

import java.util.Random;
import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		// 46
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		int numero = random.nextInt(100);
		int numero2;
	
		do {
			System.out.println("Digite um número e adivinhe qual número foi gerado: ");
			numero2 = teclado.nextInt();
			
			if (numero > numero2 && numero != numero2) {
				System.out.println("O número " + numero2 + " é menor que o número gerado");
			} else if (numero2 > numero && numero != numero2) {
				System.out.println("O número " + numero2 + " é maior que o número gerado");
			}
			
		} while (numero != numero2);
		
		System.out.println("Acertou!");
		System.out.println("Número aleatório " + numero);
		System.out.println("Número digitado " + numero2);
		teclado.close();

	}

}
