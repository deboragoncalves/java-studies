package curso01.condicionais;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// 21
		
		System.out.println("Escolha a op��o: " + "\n1 - Soma de dois n�meros" 
		+ "\n2 - Diferen�a entre dois n�meros (maior pelo menor)" + "\n3 - Produto entre dois n�meros" 
		+ "\n4 - Divis�o entre n�meros (o denominador n�o pode ser 0)" + "\nOp��o (n�mero inteiro)");
		
		Scanner teclado = new Scanner(System.in);
		int n3 = teclado.nextInt();
		double n1, n2, resultado;
		
		if (n3 == 1) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 + n2;
			System.out.println("O resultado da Soma entre " + n1 + " e " + n2 + " � de " + resultado);
		} else if (n3 == 2) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			if (n1 > n2) {
				resultado = n1 - n2;
				System.out.println("O resultado da Subtra��o entre " + n1 + " e " + n2 + " � de " + resultado);
			} else {
				resultado = n2 - n1;
				System.out.println("O resultado da Subtra��o entre " + n2 + " e " + n1 + " � de " + resultado);
			}
		} else if (n3 == 3) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			resultado = n1 * n2;
			System.out.println("O resultado da Multiplica��o entre " + n1 + " e " + n2 + " � de " + resultado);
		} else if (n3 == 4) {
			System.out.println("Digite o valor 1: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite o valor 2: ");
			n2 = teclado.nextDouble();
			if (n2 != 0) {
				resultado = n1 / n2;
				System.out.println("O resultado da Divis�o entre " + n1 + " e " + n2 + " � de " + resultado);
			} else {
				System.out.println("� imposs�vel fazer a Opera��o Divis�o");
			}
		} else {
			System.out.println("A op��o � inv�lida");
		} 
		
		teclado.close();
	
	}

}
