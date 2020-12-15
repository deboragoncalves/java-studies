package curso01.condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// 5 
		
		int a;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		a = teclado.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("O n�mero " + a + " � par");
		} else {
			System.out.println("O n�mero " + a + " � �mpar");
		} 
		
		teclado.close();
		
	}		
}
