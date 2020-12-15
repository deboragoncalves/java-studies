package curso01.funcao;

import java.util.Random;

public class Exercicio37 {

	public static void main(String[] args) {
		// 37
		
		Random aleatorio = new Random();
		
		System.out.println(hiperFatorial(aleatorio.nextInt(15) + 1));
	}
	
	public static int hiperFatorial(int numero) {
		System.out.println("N�mero: " + numero);
		
		int multiplicacao = 1;
		
		for (int i = 1; i <= numero; i++) {
			double potenciacao = Math.pow(i, i);
			multiplicacao *= potenciacao;
		}
		
		System.out.print("Hiperfatorial de " + numero + ": ");
		return multiplicacao;
	}

}
