package curso01.condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// 6
		
		int a2, a3;
		int diferenca;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		a2 = teclado.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		a3 = teclado.nextInt();
				
		if (a2 > a3) {
			System.out.println("N�mero 1: " + a2);
			System.out.println("N�mero 2: " + a3);
			System.out.println("O n�mero " + a2 + " � maior");
					
			diferenca = a2 - a3;
			System.out.println("A diferen�a entre " + a2 + " e " + a3 + " � de " + diferenca);
		} else {
			System.out.println("N�mero 1: " + a2);
			System.out.println("N�mero 2: " + a3);
			System.out.println("O n�mero " + a3 + " � maior");
					
			diferenca = a3 - a2;
			System.out.println("A diferen�a entre " + a3 + " e " + a2 + " � de " + diferenca);
		} 
		
		teclado.close();

	}

}
