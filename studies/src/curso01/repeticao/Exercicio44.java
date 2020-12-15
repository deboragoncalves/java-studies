package curso01.repeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		// 44
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com um n�mero para o limite da Sequ�ncia de Fibonacci: ");
		int numero = teclado.nextInt();
		
		ArrayList <Integer> sequencia = new ArrayList <Integer>();

		int i = 0;
		sequencia.add(i);
		
		int j = 1;
		sequencia.add(j);
		
		int n;
		  
		while((n = i + j) < (numero + i)) {
			
		 i = j;
		 j = n;
		 sequencia.add(n);
		 
		} 
		
		System.out.println("Sequ�ncia de Fibonacci " + sequencia);
		
		teclado.close();

	}

}
