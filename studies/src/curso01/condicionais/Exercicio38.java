package curso01.condicionais;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		// 38
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o dia: ");
		int dia = teclado.nextInt();
		System.out.println("Digite o m�s: ");
		int mes = teclado.nextInt();
		System.out.println("Digite o ano: ");
		int ano = teclado.nextInt();
		
		Calendar calendar = Calendar.getInstance();
		int ano_atual = calendar.get(Calendar.YEAR);
		
		if (ano <= ano_atual && ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))) {
			if (mes == 2) {
				if ((dia > 0) && (dia <= 29)) {
					System.out.println("A data � v�lida");
				} else {
					System.out.println("A data n�o � v�lida");
				}
			} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia <= 31) {
					System.out.println("A data � v�lida");
				} else {
					System.out.println("A data n�o � v�lida");
				}
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia <= 30) {
					System.out.println("A data � v�lida");
				} else {
					System.out.println("A data n�o � v�lida");
				}
			} else {
				System.out.println("A data n�o � v�lida");
			}
		} else {
			if (mes == 2) {
				if ((dia > 0) && (dia <= 28)) {
					System.out.println("A data � v�lida");
				} else {
					System.out.println("A data n�o � v�lida");
				}
			} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia <= 31) {
					System.out.println("A data � v�lida");
				} else {
					System.out.println("A data n�o � v�lida");
				}
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia <= 30) {
					System.out.println("A data � v�lida");
				} else {
					System.out.println("A data n�o � v�lida");
				}
			} else {
				System.out.println("A data n�o � v�lida");
			}
		}
		
		teclado.close();
	}

}
