package curso01.funcao;

import java.util.Random;

public class Exercicio34 {

	public static void main(String[] args) {
		// 34

		Random aleatorio = new Random();

		System.out.println(duploFatorial(aleatorio.nextInt(15) + 1));
	}

	public static int duploFatorial(int numero) {
		System.out.println("N�mero: " + numero);
		int fatorial = 1;

		for (int i = numero; i > 0; i--) {
			if (i % 2 != 0) {
				fatorial *= i;
			}
		}

		System.out.print("Duplo fatorial de " + numero + ": ");
		return fatorial;
	
	}

}
