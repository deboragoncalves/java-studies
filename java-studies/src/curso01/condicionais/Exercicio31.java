package curso01.condicionais;

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
				System.out.println("Classifica��o A");
			} else if ((altura > 1.20) && (altura < 1.70)) {
				System.out.println("Classifica��o B");
			} else if (altura > 1.70) {
				System.out.println("Classifica��o C");
			}
			
		} else if ((peso > 60) && (peso < 90)) {
			
			if (altura < 1.20) {
				System.out.println("Classifica��o D");
			} else if ((altura > 1.20) && (altura < 1.70)) {
				System.out.println("Classifica��o E");
			} else if (altura > 1.70) {
				System.out.println("Classifica��o F");
			}
			
		} else if (peso > 90) {
			if (altura < 1.20) {
				System.out.println("Classifica��o G");
			} else if ((altura > 1.20) && (altura < 1.70)) {
				System.out.println("Classifica��o H");
			} else if (altura > 1.70) {
				System.out.println("Classifica��o I");
			}
		}

		teclado.close();

	}

}
