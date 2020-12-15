package curso01.condicionais;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// 26
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a dist�ncia percorrida em KM: ");
		int distancia = teclado.nextInt();
		
		System.out.println("Digite a quantidade de litros consumida: ");
		int litros = teclado.nextInt();
		
		int consumo = distancia / litros;
		
		if (consumo < 8) {
			System.out.println("Venda o carro");
		} else if ((8 < consumo) && (consumo < 12)) {
			System.out.println("Econ�mico");
		} else if (consumo > 12) {
			System.out.println("Super econ�mico!");
		}
		
		teclado.close();
		
	}

}
