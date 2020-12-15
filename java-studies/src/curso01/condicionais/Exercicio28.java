package curso01.condicionais;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// 28
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros inteiros: ");
		System.out.println("Digite o n�mero 1: ");
		int n1 = teclado.nextInt();
		System.out.println("Digite o n�mero 2: ");
		int n2 = teclado.nextInt();
		System.out.println("Digite o n�mero 3: ");
		int n3 = teclado.nextInt();
		
		System.out.println("Digite o n�mero desejado para calcular a m�dia: ");
		System.out.println("1 - M�dia Ponderada");
		System.out.println("2 - M�dia Aritm�tica");
		System.out.println("3 - M�dia Harm�nica");
		System.out.println("4 - M�dia Geom�trica");
		int media = teclado.nextInt();

		if (media == 1) {
			double mediaPonderada = (n1 + 2 * n2 + 3 * n3) / 6;
			System.out.println("Media Ponderada: " + mediaPonderada);
		} else if (media == 2) {
			double mediaAritmetica = (n1 + n2 + n3) / 3;
			System.out.println("Media Aritm�tica: " + mediaAritmetica);
		} else if (media == 3) {
			double mediaHarmonica = 1 / (1 / n1 + 1 / n2 + 1 / n3);
			System.out.println("M�dia Harm�mica: " + mediaHarmonica);
		} else if (media == 4) {
			double mediaGeometrica = Math.cbrt(n1 * n2 * n3);
			System.out.println("M�dia Geom�trica: " + mediaGeometrica);
		}
		
		teclado.close();
	}

}
