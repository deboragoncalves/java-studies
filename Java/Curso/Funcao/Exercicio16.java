package funcao;

import java.util.Random;

public class Exercicio16 {

	public static void main(String[] args) {
		// 16
		
		Random aleatorio = new Random();
		
		System.out.println(DesenhaLinha(aleatorio.nextInt(20) + 1));

	}
	
	public static String DesenhaLinha(int numero) {
		String iguais = "";
		System.out.println("Número: " + numero);
		
		for (int i = 0; i < numero; i++) {
			iguais += "=";
		}
		
		return iguais;
	}

}
