package Repetição;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// 10
		
		Scanner teclado = new Scanner(System.in);
		int par = 2;
		
		for (int i = 0; i < 50; i++) {
			par += 2;
		}
		
		System.out.println("Soma dos 50 primeiros números pares: " + par);
		
		teclado.close();

	}

}
