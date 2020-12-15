package curso01.funcao;

import java.util.Random;

public class Exercicio22 {

	public static void main(String[] args) {
		// 22
		
		Random aleatorio = new Random();
		
		pontosExclamacao(aleatorio.nextInt(20) + 1);

	}
	
	public static void pontosExclamacao(int numero) {
		String pontos = "";
		System.out.println("N�mero: " + numero);
		
		for (int i = 1; i <= numero; i++) {
			pontos += "!";
			System.out.println(pontos);
		}
	}

}
