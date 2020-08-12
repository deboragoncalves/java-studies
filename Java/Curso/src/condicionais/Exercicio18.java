package Condicionais;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// 18
		
		System.out.println("Digite e escolha uma das 4 operações matemáticas abaixo: ");
		System.out.println("Soma \n" + "Subtração \n" + "Multiplicação \n" + "Divisão");
		Scanner teclado = new Scanner(System.in);
		String operacao = teclado.nextLine();
				
		double n1, n2, resultado;
		operacao = operacao.toLowerCase();
				
		if (operacao.equals("soma")) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 + n2;
			System.out.println("O resultado da " + operacao + " entre " + n1 + " e " + n2 + " é de " + resultado);
		} else if (operacao.equals("subtração") || operacao.equals("subtracao")) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 - n2;
			System.out.println("O resultado da " + operacao + " entre " + n1 + " e " + n2 + " é de " + resultado);
		} else if (operacao.equals("multiplicacao") || operacao.equals("multiplicação")) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 * n2;
			System.out.println("O resultado da " + operacao + " entre " + n1 + " e " + n2 + " é de " + resultado);
		} else if (operacao.equals("divisao") || operacao.equals("divisão")) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 / n2;
			System.out.println("O resultado da " + operacao + " entre " + n1 + " e " + n2 + " é de " + resultado);
		} else {
			System.out.println("A operação informada é inválida");
		} 
		
		teclado.close();
				
	}

}
