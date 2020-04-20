package Condicionais;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// 14
		
		double n5, n6, n7, media;
		Scanner leitura = new Scanner(System.in);
				
		System.out.println("Digite a nota 1 - Trabalho de Laboratório: ");
		n5 = leitura.nextDouble();
				
		System.out.println("Digite a nota 2 - Avaliação Semestral: ");
		n6 = leitura.nextDouble();
				
		System.out.println("Digite a nota 3 - Exame Final: ");
		n7 = leitura.nextDouble();
				
		if (((0.0 <= n5) && (10.0 >= n5)) && ((0.0 <= n6) && (10.0 >= n6)) && ((0.0 <= n7) && (10.0 >= n7))) {
			media = ((n5 * 2.0) + (n6 * 3.0) + (n7 * 5.0)) / 10.0;
			System.out.println("A média é de " + media);
					
			if ((media >= 0.0) && (media <= 2.9)) {
				System.out.println("Aluno reprovado");
			} else if ((media >= 3.0) && (media <= 4.9)) {
				System.out.println("Aluno em recuperação");
			} else {
				System.out.println("Aluno aprovado");
			}
		} else {
			System.out.println("Notas inválidas");
		}
				
		leitura.close();

	}

}
