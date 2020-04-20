package Condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// 10
		
		String genero;
		double altura, peso;
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite o seu sexo (M/F): ");
		genero = teclado.nextLine();
				
		System.out.println("Digite a sua altura ");
		altura = teclado.nextDouble();
		
		genero = genero.toUpperCase();
				
		if (genero.equals("M")) {
			peso = (72.7 * altura) - 58;
			System.out.println("Seu peso ideal é " + formato.format(peso) + "kg");
		} else if (genero.equals("F")) {
			peso = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal é " + formato.format(peso) + "kg");
		} else {
			System.out.println("O sexo informado é inválido");
		}
				
		teclado.close(); 

	}

}
