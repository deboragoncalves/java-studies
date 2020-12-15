package curso01.repeticao;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// 26
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		int contador = numero;
		
		System.out.println("M�ltiplos de 11, 13 ou 17: ");
		
		for (int i = 0; i <= numero; i++) {
			
			contador++;
			
			if (contador % 11 == 0 || contador % 13 == 0 || contador == 17) {
				System.out.println(contador);
			}
		}
		
		teclado.close();

	}

}
