package Condicionais;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// 28
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 3 números inteiros: ");
		System.out.println("Digite o número 1: ");
		int n1 = teclado.nextInt();
		System.out.println("Digite o número 2: ");
		int n2 = teclado.nextInt();
		System.out.println("Digite o número 3: ");
		int n3 = teclado.nextInt();
		
		System.out.println("Digite o número desejado para calcular a média: ");
		System.out.println("1 - Média Ponderada");
		System.out.println("2 - Média Aritmética");
		System.out.println("3 - Média Harmônica");
		System.out.println("4 - Média Geométrica");
		int media = teclado.nextInt();

		if (media == 1) {
			double mediaPonderada = (n1 + 2 * n2 + 3 * n3) / 6;
			System.out.println("Media Ponderada: " + mediaPonderada);
		} else if (media == 2) {
			double mediaAritmetica = (n1 + n2 + n3) / 3;
			System.out.println("Media Aritmética: " + mediaAritmetica);
		} else if (media == 3) {
			double mediaHarmonica = 1 / (1 / n1 + 1 / n2 + 1 / n3);
			System.out.println("Média Harmômica: " + mediaHarmonica);
		} else if (media == 4) {
			double mediaGeometrica = Math.cbrt(n1 * n2 * n3);
			System.out.println("Média Geométrica: " + mediaGeometrica);
		}
		
		teclado.close();
	}

}
