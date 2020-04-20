package Condicionais;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		// 34
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua nota: ");
		double nota = teclado.nextDouble();
		System.out.println("Digite quantas faltas você tem: ");
		int faltas = teclado.nextInt();
		
		if ((nota > 0.0) && (nota < 3.9)) {
			if (faltas < 20) {
				System.out.println("Conceito E");
			} else {
				System.out.println("Conceito E");
			}
		} else if ((nota > 4.0) && (nota < 4.9)) {
			if (faltas < 20) {
				System.out.println("Conceito D");
			} else {
				System.out.println("Conceito E");
			}
		} else if ((nota > 5.0) && (nota < 7.4)) {
			if (faltas < 20) {
				System.out.println("Conceito C");
			} else {
				System.out.println("Conceito D");
			}
		} else if ((nota > 7.5) && (nota < 8.9)) {
			if (faltas < 20) {
				System.out.println("Conceito B");
			} else {
				System.out.println("Conceito C");
			}
		} else if ((nota > 9.0) && (nota < 10.0)) {
			if (faltas < 20) {
				System.out.println("Conceito A");
			} else {
				System.out.println("Conceito B");
			}
		}
		
		teclado.close();

	}

}
