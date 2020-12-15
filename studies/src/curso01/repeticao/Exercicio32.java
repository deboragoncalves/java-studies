package curso01.repeticao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// 32
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas jogadas? ");
		int numero = teclado.nextInt();
		Random d1 = new Random();
		Random d2 = new Random();
		
		for (int i = 1; i <= numero; i++) {
			int a = d1.nextInt(7);
			int b = d2.nextInt(7);
			System.out.println();
            System.out.println("Dado " + i + " d1: " + a);
            System.out.println("Dado " + i + " d2: " + b);
            
            if (a == b) {
            	System.out.println("Os n�meros s�o iguais!");
            } else if (a > b) {
            	System.out.println("O dado " + a + " � maior que " + b);
            } else {
            	System.out.println("O dado " + b + " � maior que " + a);
            }
         }
		
		teclado.close();

	}

}
