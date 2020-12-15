package curso01.condicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// 7
		
		int a4, a5;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		a4 = teclado.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		a5 = teclado.nextInt();
		
		if (a4 > a5) {
			System.out.println("N�mero 1: " + a4);
			System.out.println("N�mero 2: " + a5);
			System.out.println("O n�mero " + a4 + " � maior");
		} else if (a5 > a4) {
			System.out.println("N�mero 1: " + a4);
			System.out.println("N�mero 2: " + a5);
			System.out.println("O n�mero " + a5 + " � maior");
		} else {
			System.out.println("N�mero 1: " + a4);
			System.out.println("N�mero 2: " + a5);
			System.out.println("Os n�meros " + a4 + " e " + a5 + " s�o iguais");
		} 
		
		teclado.close();

	}
	
}
