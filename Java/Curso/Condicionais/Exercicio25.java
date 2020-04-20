package Condicionais;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// 25
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um valor inteiro para a: ");
		int a = teclado.nextInt();
		System.out.println("Informe um valor inteiro para b: ");
		int b = teclado.nextInt();
		System.out.println("Informe um valor inteiro para c: ");
		int c = teclado.nextInt();
					
		if (a != 0) {
			System.out.println("A equação de 2o grau é " + a + "x² + " + b + "x + " + c);
						
			double delta = (Math.pow(b, 2)) - (4 * a * c);
			System.out.println("O valor do delta é: " + delta);
						
			if (delta < 0.0) {
				System.out.println("Não existe raiz");
			} else if (delta == 0.0) {
				double raiz = (-b + Math.sqrt(delta)) / (2.0 * a);
				System.out.println("Raiz única: " + raiz);
			} else if (delta >= 0.0) {
				double raiz1 = (-b + Math.sqrt(delta)) / (2.0 * a);
				double raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);
				System.out.println("Duas raízes reais: " + raiz1 + " e " + raiz2);
			}
		} else {
			System.out.println("Não é uma equação do 2o grau");
		} 
		
		teclado.close();

	}

}
