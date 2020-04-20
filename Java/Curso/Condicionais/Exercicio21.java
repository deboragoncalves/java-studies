package Condicionais;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// 21
		
		System.out.println("Escolha a opção: " + "\n1 - Soma de dois números" 
		+ "\n2 - Diferença entre dois números (maior pelo menor)" + "\n3 - Produto entre dois números" 
		+ "\n4 - Divisão entre números (o denominador não pode ser 0)" + "\nOpção (número inteiro)");
		
		Scanner teclado = new Scanner(System.in);
		int n3 = teclado.nextInt();
		double n1, n2, resultado;
		
		if (n3 == 1) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 + n2;
			System.out.println("O resultado da Soma entre " + n1 + " e " + n2 + " é de " + resultado);
		} else if (n3 == 2) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			if (n1 > n2) {
				resultado = n1 - n2;
				System.out.println("O resultado da Subtração entre " + n1 + " e " + n2 + " é de " + resultado);
			} else {
				resultado = n2 - n1;
				System.out.println("O resultado da Subtração entre " + n2 + " e " + n1 + " é de " + resultado);
			}
		} else if (n3 == 3) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 * n2;
			System.out.println("O resultado da Multiplicação entre " + n1 + " e " + n2 + " é de " + resultado);
		} else if (n3 == 4) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			if (n2 != 0) {
				resultado = n1 / n2;
				System.out.println("O resultado da Divisão entre " + n1 + " e " + n2 + " é de " + resultado);
			} else {
				System.out.println("É impossível fazer a Operação Divisão");
			}
		} else {
			System.out.println("A opção é inválida");
		} 
		
		teclado.close();
	
	}

}
