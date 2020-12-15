package curso01.condicionais;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// 18
		
		System.out.println("Digite e escolha uma das 4 opera��es matem�ticas abaixo: ");
		System.out.println("Soma \n" + "Subtra��o \n" + "Multiplica��o \n" + "Divis�o");
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
			System.out.println("O resultado da " + operacao + " entre " + n1 + " e " + n2 + " � de " + resultado);
		} else if (operacao.equals("subtra��o") || operacao.equals("subtracao")) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 - n2;
			System.out.println("O resultado da " + operacao + " entre " + n1 + " e " + n2 + " � de " + resultado);
		} else if (operacao.equals("multiplicacao") || operacao.equals("multiplica��o")) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 * n2;
			System.out.println("O resultado da " + operacao + " entre " + n1 + " e " + n2 + " � de " + resultado);
		} else if (operacao.equals("divisao") || operacao.equals("divis�o")) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 / n2;
			System.out.println("O resultado da " + operacao + " entre " + n1 + " e " + n2 + " � de " + resultado);
		} else {
			System.out.println("A opera��o informada � inv�lida");
		} 
		
		teclado.close();
				
	}

}
