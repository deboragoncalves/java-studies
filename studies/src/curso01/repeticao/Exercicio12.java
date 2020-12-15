package curso01.repeticao;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// 12
		
				Scanner teclado = new Scanner(System.in);
				System.out.println("Digite um n�mero: ");
				int numero = teclado.nextInt();
				int contagem = numero;
				
				if (numero > 0) {
					
					for (int i = 0; i <= numero; i++) {
						System.out.println("N�mero " + (i + 1) + ": " + contagem);
						contagem--;
					}
					
				} else {
					System.out.println("Digite um n�mero positivo. ");
				}
				
				teclado.close();

	}

}
