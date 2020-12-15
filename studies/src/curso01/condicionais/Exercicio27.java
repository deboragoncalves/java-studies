package curso01.condicionais;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// 27
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a idade de um nadador: ");
		int idade = teclado.nextInt();
		
		if ((idade > 5) && (idade < 7)) {
			System.out.println("Infantil A");
		} else if ((idade > 8) && (idade < 10)) {
			System.out.println("Infantil B");
		} else if ((idade > 11) && (idade < 13)) {
			System.out.println("Juvenil A");
		} else if ((idade > 14) && (idade < 17)) {
			System.out.println("Juvenil B");
		} else if (idade > 18) {
			System.out.println("S�nior");
		}
		
		teclado.close();

	}

}
