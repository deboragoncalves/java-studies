package curso01.funcao;

import java.util.Random;

public class Exercicio60 {

	public static void main(String[] args) {
		// 60
		
		Random aleatorio = new Random();
		
		System.out.println(subString(aleatorio.nextInt(300) + 0));

	}
	
	public static String subString(int numero) {
		System.out.println("N�mero: " + numero);
		
		String stringNumero = String.valueOf(numero);
		return "Primeira posi��o: " + stringNumero.substring(0, 1);
	}

}
