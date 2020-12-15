package curso01.funcao;

import java.util.Random;

public class Exercicio39 {

	public static void main(String[] args) {
		// 39
		
		Random aleatorio = new Random();
		
		troca(aleatorio.nextInt(15) + 1, aleatorio.nextInt(15) + 1);

	}
	
	public static void troca(int numero1, int numero2) {
		System.out.println("Original: ");
		System.out.println("N�mero 1: " + numero1);
		System.out.println("N�mero 2: " + numero2);

		int numeroA = numero1;
		int numeroB = numero2;
		numero2 = numeroA;
		numero1 = numeroB;
		
		System.out.println();
		System.out.println("Troca: ");
		System.out.println("N�mero 1: " + numero1);
		System.out.println("N�mero 2: " + numero2);
	}

}
