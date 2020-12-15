package curso01.repeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio53 {

	public static void main(String[] args) {
		// 53
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int numero = teclado.nextInt();
		
		int numeroLinha = 1;
		int j;
		
		if (numero > 0) {
			for (int i = 1; i <= numero; i++) {
				
				for(j = 1; j <= i; j++) {
					System.out.print(numeroLinha + " ");
					numeroLinha++;
		        }
				
				System.out.println();
			}
		}
		
		teclado.close();
		

	}

}
