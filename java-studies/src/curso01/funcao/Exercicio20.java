package curso01.funcao;

import java.util.Random;

public class Exercicio20 {

	public static void main(String[] args) {
		// 20
		
		Random aleatorio = new Random();
		
		System.out.println(fatorial(aleatorio.nextInt(20) + 0));
	}
	
	public static int fatorial(int numero) {
		int resultado = numero;
		System.out.println("N�mero: " + numero);
		
		for (int i = numero - 1; i > 0; i--) {
			resultado *= i;
		}
		
		System.out.print("Resultado: ");
		return resultado;
	}

}
