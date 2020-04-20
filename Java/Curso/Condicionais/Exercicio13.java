package Condicionais;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13
		
		double n1, n2, n3, media;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		n1 = leitura.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		n2 = leitura.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		n3 = leitura.nextDouble();
		
		media = ((n1 * 1.0) + (n2 * 1.0) + (n3 * 2.0)) / 3.0;
		
		if (media >= 6.0) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}

		leitura.close();
	
	}

}
