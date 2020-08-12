package JavaFor;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		// 44
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com um número para o limite da Sequência de Fibonacci: ");
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
		
		System.out.println("Sequência de Fibonacci " + sequencia);
		
		teclado.close();

	}

}
