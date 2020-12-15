package curso01.funcao;

import java.util.Random;

public class Exercicio17 {

	public static void main(String[] args) {
		// 17
		
		Random aleatorio = new Random();
		
		System.out.println(numerosInteiros(aleatorio.nextInt(10) + 0, aleatorio.nextInt(20) + 10));

	}
	
	public static int numerosInteiros(int numero1, int numero2) {
		System.out.println("N�meros inteiros entre " + numero1 + " e " + numero2);
		int somatorio = 0;
		
		if (numero1 < numero2) {
			for (int i = numero1 + 1; i < numero2; i++) {
				somatorio += i;
			}
		} 
		
		System.out.print("Soma: ");
		return somatorio;
	}

}
