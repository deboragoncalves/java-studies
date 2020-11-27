package JavaFor;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		// 43
		
		Scanner teclado = new Scanner(System.in);
		
		int soma = 0;
		int contador = 0;
		double media = 0;
		
		boolean continuar = true;
		
		do {
			System.out.println("Entre com uma idade: ");
			int idade = teclado.nextInt();
			
			if (idade > 0) {
				soma += idade;
				contador++;
				
			} else {
				continuar = false;
				System.out.println("Programa finalizado");
			}
			
		} while (continuar);
		
		media = soma / contador;
		System.out.println("Média de idades " + media);

		teclado.close();

	}

}
