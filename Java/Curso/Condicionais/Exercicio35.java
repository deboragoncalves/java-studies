package Condicionais;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		// 35
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma data: ");
		System.out.println("Digite o dia: ");
		int dia = teclado.nextInt();
		System.out.println("Digite o mês: ");
		int mes = teclado.nextInt();
		System.out.println("Digite o ano: ");
		int ano = teclado.nextInt();
		
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			
			if (mes == 2) {
				if ((dia > 1) && (dia < 29)) {
					System.out.println("O dia é válido");
				} else {
					System.out.println("O dia não é válido");
				}
			} else if (mes == 1) {
				if ((dia > 1) && (dia < 31)) {
					System.out.println("O dia é válido");
				} else {
					System.out.println("O dia não é válido");
				}
			} else if ((mes > 2) && (mes <= 12)) {
				if ((dia > 1) && (dia < 31)) {
					System.out.println("O dia é válido");
				} else {
					System.out.println("O dia não é válido");
				}
			} else {
				System.out.println("A data não é válida");
			}
			
		} else {
			if (mes == 2) {
				if ((dia > 1) && (dia < 28)) {
					System.out.println("O dia é válido");
				} else {
					System.out.println("O dia não é válido");
				}
			} else if (mes == 1) {
				if ((dia > 1) && (dia < 31)) {
					System.out.println("O dia é válido");
				} else {
					System.out.println("O dia não é válido");
				}
			} else if ((mes > 2) && (mes <= 12)) {
				if ((dia > 1) && (dia < 31)) {
					System.out.println("O dia é válido");
				} else {
					System.out.println("O dia não é válido");
				}
			} else {
				System.out.println("A data não é válida");
			}
		} 

		teclado.close();
	}

}
