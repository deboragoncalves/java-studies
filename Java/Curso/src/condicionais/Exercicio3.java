package Condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3 
		
		double n7;
		double n8;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n7 = teclado.nextDouble();
		
		if (n7 > 0) {
			n8 = Math.sqrt(n7);
			System.out.println("O número digitado é " + n7);
			
			DecimalFormat formato = new DecimalFormat("#.##");  
			
			System.out.println("A raiz quadrada de " + n7 + " é " + formato.format(n8));
		} else {
			System.out.println("O número deve ser positivo");
		}
		
		teclado.close();
		
	}

}
