package curso01.condicionais;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// 23
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o ano (YYYY): ");
		int ano = teclado.nextInt();
		
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			System.out.println("O ano � bissexto");
		} else {
			System.out.println("O ano n�o � bissexto");
		} 
		
		teclado.close();
		
	}

}
