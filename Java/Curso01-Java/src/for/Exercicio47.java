package JavaFor;

import java.util.Scanner;

public class Exercicio47 {

	public static void main(String[] args) {
		// 47
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao = 0;
		double resultado = 0;
		
		do {
			
			System.out.println("Digite o número 1: ");
			int numero1 = teclado.nextInt();
			System.out.println("Digite o número 2: ");
			int numero2 = teclado.nextInt();
			
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Saída");
			
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				resultado = numero1 + numero2;
				System.out.println("A soma é de " + resultado);
			} else if (opcao == 2) {
				resultado = numero1 - numero2;
				System.out.println("A subtração é de " + resultado);
			} else if (opcao == 3) {
				resultado = numero1 * numero2;
				System.out.println("A multiplicação é de " + resultado);
			} else if (opcao == 4) {
				resultado = numero1 / numero2;
				System.out.println("A divisão é de " + resultado);
			}
			
		} while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4);

		teclado.close();

	}

}
