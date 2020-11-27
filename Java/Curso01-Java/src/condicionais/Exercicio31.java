package Condicionais;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		// 31
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		System.out.println("Digite seu peso: ");
		double peso = teclado.nextDouble();
		
		if (peso < 60) {
			
			if (altura < 1.20) {
				System.out.println("Classificação A");
			} else if ((altura > 1.20) && (altura < 1.70)) {
				System.out.println("Classificação B");
			} else if (altura > 1.70) {
				System.out.println("Classificação C");
			}
			
		} else if ((peso > 60) && (peso < 90)) {
			
			if (altura < 1.20) {
				System.out.println("Classificação D");
			} else if ((altura > 1.20) && (altura < 1.70)) {
				System.out.println("Classificação E");
			} else if (altura > 1.70) {
				System.out.println("Classificação F");
			}
			
		} else if (peso > 90) {
			if (altura < 1.20) {
				System.out.println("Classificação G");
			} else if ((altura > 1.20) && (altura < 1.70)) {
				System.out.println("Classificação H");
			} else if (altura > 1.70) {
				System.out.println("Classificação I");
			}
		}

		teclado.close();

	}

}
