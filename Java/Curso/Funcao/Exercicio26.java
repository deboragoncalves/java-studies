package funcao;

import java.util.Random;

public class Exercicio26 {

	public static void main(String[] args) {
		// 26
		
		Random aleatorio = new Random();
		
		System.out.println(somatorio(aleatorio.nextInt(20) + 1));
	}
	
	public static int somatorio(int numero) {
		System.out.println("Número: " + numero);
		int somatorio = 0;
		
		for (int i = 1; i <= numero; i++) {
			somatorio += i;
		}
		
		return somatorio;
	}	

}
