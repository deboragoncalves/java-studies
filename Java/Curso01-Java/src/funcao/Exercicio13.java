package funcao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13
		
		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a operação que deseja: ");
		System.out.println("+ (Soma)");
		System.out.println("- (Subtração)");
		System.out.println("* (Multiplicação)");
		System.out.println("/ (Divisão)");
		String operacao = teclado.next();

		System.out.println(decisaoCarro(aleatorio.nextInt(15) + 0, aleatorio.nextInt(15) + 0, operacao));

		teclado.close();
	}
	
	public static String decisaoCarro(int numero1, int numero2, String operacao) {
		System.out.println(numero1 + " e " + numero2);
		int resultado = 0;
		
		if (operacao.equals("+")) {
			resultado = numero1 + numero2;
		} else if (operacao.equals("-")) {
			resultado = numero1 - numero2;
		} else if (operacao.equals("*")) {
			resultado = numero1 * numero2;
		} else if (operacao.equals("/")) {
			resultado = numero1 / numero2;
		} else {
			System.out.println("A operação é inválida.");
		}
		
		System.out.println(resultado);
		
		if (resultado < 8) {
			return "Venda o carro!";
		} else if (resultado > 8 && resultado < 14) {
			return "Econômico!";
		} else if (resultado > 12) {
			return "Super econômico!";
		} else {
			return "Não foi possível avaliar sobre o carro.";
		}
	}

}
