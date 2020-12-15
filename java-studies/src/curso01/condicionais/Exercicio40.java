package curso01.condicionais;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		// 40
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o custo da f�brica: ");
		double custoF = teclado.nextDouble();
		double custoConsumidor;
		
		if (custoF <= 12000.00) {
			custoConsumidor = 0.05 * custoF + custoF;
			System.out.println("O custo final �: R$ " + custoConsumidor + " reais");
		} else if (custoF >= 12000.00 && custoF <= 25000.00) {
			custoConsumidor = (0.10 + 0.15) * custoF + custoF;
			System.out.println("O custo final �: R$ " + custoConsumidor + " reais");
		} else if (custoF > 25000.00) {
			custoConsumidor = (0.15 + 0.20) * custoF + custoF;
			System.out.println("O custo final �: R$ " + custoConsumidor + " reais");
		}
		
		teclado.close();

	}

}
