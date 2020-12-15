package curso01.condicionais;

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
			System.out.println("A equa��o de 2o grau � " + a + "x� + " + b + "x + " + c);
						
			double delta = (Math.pow(b, 2)) - (4 * a * c);
			System.out.println("O valor do delta �: " + delta);
						
			if (delta < 0.0) {
				System.out.println("N�o existe raiz");
			} else if (delta == 0.0) {
				double raiz = (-b + Math.sqrt(delta)) / (2.0 * a);
				System.out.println("Raiz �nica: " + raiz);
			} else if (delta >= 0.0) {
				double raiz1 = (-b + Math.sqrt(delta)) / (2.0 * a);
				double raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);
				System.out.println("Duas ra�zes reais: " + raiz1 + " e " + raiz2);
			}
		} else {
			System.out.println("N�o � uma equa��o do 2o grau");
		} 
		
		teclado.close();

	}

}
