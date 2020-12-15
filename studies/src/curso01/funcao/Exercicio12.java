package curso01.funcao;

import java.util.Random;

public class Exercicio12 {

	public static void main(String[] args) {
		// 12

		Random aleatorio = new Random();

		System.out.println(somaAlgarismos(aleatorio.nextInt(200) + 1));

	}

	public static int somaAlgarismos(int numero) {
		if (numero > 0) {
			System.out.println("N�mero: " + numero);
			
			String digitos = String.valueOf(numero);
			
			int somatorio = 0;
			
			System.out.print("Soma dos algarismos: ");
			if (numero < 100) {
				String digito1 = digitos.substring(0, 1);
				String digito2 = digitos.substring(1, 2);
				
				int numero1 = Integer.parseInt(digito1);
				int numero2 = Integer.parseInt(digito2);
				
				somatorio = numero1 + numero2;
				return somatorio;
			} else {
				String digito1 = digitos.substring(0, 1);
				String digito2 = digitos.substring(1, 2);
				String digito3 = digitos.substring(2, 3);
				
				int numero1 = Integer.parseInt(digito1);
				int numero2 = Integer.parseInt(digito2);
				int numero3 = Integer.parseInt(digito3);
				
				somatorio = numero1 + numero2 + numero3;
				return somatorio;
			}
			
		} else {
			System.out.println("O n�mero � inv�lido");
		}
		return 0;

	}
}
