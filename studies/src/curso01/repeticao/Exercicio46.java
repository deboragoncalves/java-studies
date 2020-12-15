package curso01.repeticao;

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
			System.out.println("Digite um n�mero e adivinhe qual n�mero foi gerado: ");
			numero2 = teclado.nextInt();
			
			if (numero > numero2 && numero != numero2) {
				System.out.println("O n�mero " + numero2 + " � menor que o n�mero gerado");
			} else if (numero2 > numero && numero != numero2) {
				System.out.println("O n�mero " + numero2 + " � maior que o n�mero gerado");
			}
			
		} while (numero != numero2);
		
		System.out.println("Acertou!");
		System.out.println("N�mero aleat�rio " + numero);
		System.out.println("N�mero digitado " + numero2);
		teclado.close();

	}

}
