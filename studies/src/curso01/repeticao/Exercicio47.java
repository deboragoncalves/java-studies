package curso01.repeticao;

import java.util.Scanner;

public class Exercicio47 {

	public static void main(String[] args) {
		// 47
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao = 0;
		double resultado = 0;
		
		do {
			
			System.out.println("Digite o n�mero 1: ");
			int numero1 = teclado.nextInt();
			System.out.println("Digite o n�mero 2: ");
			int numero2 = teclado.nextInt();
			
			System.out.println("Digite a op��o desejada: ");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Sa�da");
			
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				resultado = numero1 + numero2;
				System.out.println("A soma � de " + resultado);
			} else if (opcao == 2) {
				resultado = numero1 - numero2;
				System.out.println("A subtra��o � de " + resultado);
			} else if (opcao == 3) {
				resultado = numero1 * numero2;
				System.out.println("A multiplica��o � de " + resultado);
			} else if (opcao == 4) {
				resultado = numero1 / numero2;
				System.out.println("A divis�o � de " + resultado);
			}
			
		} while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4);

		teclado.close();

	}

}
