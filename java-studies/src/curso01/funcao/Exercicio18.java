package curso01.funcao;

import java.util.Random;

public class Exercicio18 {

	public static void main(String[] args) {
		// 18
		
		Random aleatorio = new Random();
		
		System.out.println(expoenciacao(aleatorio.nextInt(15) + 1, aleatorio.nextInt(15) + 1));

	}
	
	public static int expoenciacao(int numero, int expoente) {
		int resultado = numero;
		System.out.println("N�mero " + numero + " e expoente " + expoente);
		
		for (int i = 1; i < expoente; i++) {
			resultado *= numero;
		}
		
		System.out.print("Resultado: ");
		return resultado;
	}

}
