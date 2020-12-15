package curso01.funcao;

import java.util.Random;

public class Exercicio36 {

	public static void main(String[] args) {
		// 36
		
		Random aleatorio = new Random();
		
		System.out.println(superFatorial(aleatorio.nextInt(15) + 1));
	}
	
	public static int superFatorial(int numero) {
		System.out.println("N�mero: " + numero);
		
		int fatorial = 1;
		int multiplicacao = 1;
		int numeroFatorial = 1;
		
		for (int i = numero; i > 0; i--) {
			numeroFatorial = i;
			
			while (numeroFatorial > 0) {
				fatorial *= numeroFatorial;
				numeroFatorial--;
			}
			
			multiplicacao *= fatorial;
			fatorial = 1;
		}
		
		System.out.print("Super Fatorial de " + numero + ": ");
		return multiplicacao;
	}

}
