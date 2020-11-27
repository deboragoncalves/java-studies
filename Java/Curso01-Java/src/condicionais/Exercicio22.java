package Condicionais;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// 22
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua idade (Apenas números): ");
		int n1 = teclado.nextInt();
		
		System.out.println("Informe seu tempo de serviço (Apenas números): ");
		int n2 = teclado.nextInt();
				
		if (n1 >= 65 || n2 >= 30 || (n1 >= 60 && n2 >= 25)) {
			System.out.println("Apto à aposentadoria");
		} else {
			System.out.println("Não apto à aposentadoria");
		} 
		
		teclado.close();

	}

}
