package curso01.condicionais;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// 20
		
		double n1, n2, n3;
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite o valor 1: ");
		n1 = teclado.nextDouble();
		System.out.println("Digite o valor 2: ");
		n2 = teclado.nextDouble();
		System.out.println("Digite o valor 3: ");
		n3 = teclado.nextDouble();
				
		if (n1 < (n2 + n3) || n2 < (n1 + n3) || n3 < (n2 + n1)) {
			if (n1 == n2 && n2 == n3) {
				System.out.println("O tri�ngulo � equil�tero");
			} else if (n1 == n2 || n2 == n3 || n3 == n1) {
				System.out.println("O tri�ngulo � is�sceles");
			} else if (n1 != n2 && n2 != n3) {
				System.out.println("O tri�ngulo � escaleno");
			}
		} else {
			System.out.println("Os valores informados s�o inv�lidos");
		}
		
		teclado.close();
			
	}

}
