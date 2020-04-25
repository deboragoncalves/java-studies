package JavaFor;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		// 48
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList <Integer> sequencia = new ArrayList <Integer>();

		int i = 0;
		sequencia.add(i);
		
		int j = 1;
		sequencia.add(j);
		
		int n;
		int soma = 0;
		  
		while((n = i + j) < 4000000) {
			
		 i = j;
		 j = n;
		 sequencia.add(n);
		 
		} 
		
		for (int a : sequencia) {
			
			if (a % 2 == 0) {
				soma += a;
			}
			
		}
		
		System.out.println("Soma dos números pares - Sequência de Fibonacci: " + soma);
		
		
		
		teclado.close();
	}

}
