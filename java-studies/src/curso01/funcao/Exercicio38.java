package curso01.funcao;

import java.util.Random;

public class Exercicio38 {

	public static void main(String[] args) {
		// 38
		
		Random aleatorio = new Random();
		
		System.out.println(fatorialExpoencial(aleatorio.nextInt(15) + 1));

	}
	
	public static int fatorialExpoencial(int numero) {
		double potenciacao = 1.0;
		
		for (int i = 0; i < numero - 1; i++) {
			potenciacao = Math.pow(i + 1, i);
		}
				
		int resultado = (int) Math.pow(numero, potenciacao);
		System.out.print("Fatorial Expoencial de " + numero + ": ");
		return resultado;
	}

}
