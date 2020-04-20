package Condicionais;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2 
		
		int n5;
		double n6;
		Scanner teclado1 = new Scanner(System.in);
				
		System.out.println("Digite um número inteiro: ");
		n5 = teclado1.nextInt();
				
		if (n5 > 0) {
			n6 = Math.sqrt(n5);
			
			DecimalFormat formato = new DecimalFormat("#.##");  
			
			System.out.println("A raiz quadrada de " + n5 + " é " + formato.format(n6));
		} else {
			System.out.println("O número " + n5 + " é inválido");
		}
				
		teclado1.close();
				
	}

	}

