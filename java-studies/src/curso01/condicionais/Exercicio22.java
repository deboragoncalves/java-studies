package curso01.condicionais;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// 22
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua idade (Apenas n�meros): ");
		int n1 = teclado.nextInt();
		
		System.out.println("Informe seu tempo de servi�o (Apenas n�meros): ");
		int n2 = teclado.nextInt();
				
		if (n1 >= 65 || n2 >= 30 || (n1 >= 60 && n2 >= 25)) {
			System.out.println("Apto � aposentadoria");
		} else {
			System.out.println("N�o apto � aposentadoria");
		} 
		
		teclado.close();

	}

}
