package curso01.repeticao;

import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {
		// 45
		
		Scanner teclado = new Scanner(System.in);
		
		double converter = 0;
		int opcao = 0;
		
		do {
			
			System.out.println("Digite a velocidade: ");
			double velocidade = teclado.nextDouble();
			
			
			System.out.println();
			System.out.println("Digite a op��o desejada: ");
			System.out.println("1 - Converter a velocidade de km/h para m/s");
			System.out.println("2 - Converter a velocidade de m/s para km/h");
			System.out.println("3 - Finalize o programa");
			
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				converter = velocidade / 3.6;
				System.out.println("Velocidade de " + velocidade + " km/h para " + converter + " m/s");
			} else if (opcao == 2) {
				converter = velocidade * 3.6;
				System.out.println("Velocidade de " + velocidade + " m/s para " + converter + " km/h");
			}
			
		} while (opcao == 1 || opcao == 2);

		teclado.close();

	}

}
