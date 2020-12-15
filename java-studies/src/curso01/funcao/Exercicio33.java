package curso01.funcao;

import java.util.Random;

public class Exercicio33 {

	public static void main(String[] args) {
		// 33
		
		Random aleatorio = new Random();
		
		System.out.println(somaAlgarismosFatorial(aleatorio.nextInt(15) + 1));

	}
	
	public static int somaAlgarismosFatorial(int numero) {
		System.out.println("N�mero: " + numero);
		int fatorial = 1;
		int numeroFatorial = numero;
		
		while (numeroFatorial > 0) {
			fatorial *= numeroFatorial;
			numeroFatorial--;
		}
		
		System.out.println("Fatorial de " + numero + ": " + fatorial);
		
		String fatorialString = Integer.toString(fatorial);
		int tamanhoNumero = fatorialString.length();
		int somatorio = 0;
	
		System.out.print("Soma dos algarismos: ");
		if (tamanhoNumero == 10) {
			String digito1 = fatorialString.substring(0, 1);
			String digito2 = fatorialString.substring(1, 2);
			String digito3 = fatorialString.substring(2, 3);
			String digito4 = fatorialString.substring(3, 4);
			String digito5 = fatorialString.substring(4, 5);
			String digito6 = fatorialString.substring(5, 6);
			String digito7 = fatorialString.substring(6, 7);
			String digito8 = fatorialString.substring(7, 8);
			String digito9 = fatorialString.substring(8, 9);
			String digito10 = fatorialString.substring(9, 10);
			
			int numero1 = Integer.parseInt(digito1);
			int numero2 = Integer.parseInt(digito2);
			int numero3 = Integer.parseInt(digito3);
			int numero4 = Integer.parseInt(digito4);
			int numero5 = Integer.parseInt(digito5);
			int numero6 = Integer.parseInt(digito6);
			int numero7 = Integer.parseInt(digito7);
			int numero8 = Integer.parseInt(digito8);
			int numero9 = Integer.parseInt(digito9);
			int numero10 = Integer.parseInt(digito10);

			
			somatorio = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;
			return somatorio;
		} else if (tamanhoNumero == 9) {
			String digito1 = fatorialString.substring(0, 1);
			String digito2 = fatorialString.substring(1, 2);
			String digito3 = fatorialString.substring(2, 3);
			String digito4 = fatorialString.substring(3, 4);
			String digito5 = fatorialString.substring(4, 5);
			String digito6 = fatorialString.substring(5, 6);
			String digito7 = fatorialString.substring(6, 7);
			String digito8 = fatorialString.substring(7, 8);
			String digito9 = fatorialString.substring(8, 9);
			
			int numero1 = Integer.parseInt(digito1);
			int numero2 = Integer.parseInt(digito2);
			int numero3 = Integer.parseInt(digito3);
			int numero4 = Integer.parseInt(digito4);
			int numero5 = Integer.parseInt(digito5);
			int numero6 = Integer.parseInt(digito6);
			int numero7 = Integer.parseInt(digito7);
			int numero8 = Integer.parseInt(digito8);
			int numero9 = Integer.parseInt(digito9);
			
			somatorio = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9;
			return somatorio;
		} else if (tamanhoNumero == 8) {
			String digito1 = fatorialString.substring(0, 1);
			String digito2 = fatorialString.substring(1, 2);
			String digito3 = fatorialString.substring(2, 3);
			String digito4 = fatorialString.substring(3, 4);
			String digito5 = fatorialString.substring(4, 5);
			String digito6 = fatorialString.substring(5, 6);
			String digito7 = fatorialString.substring(6, 7);
			String digito8 = fatorialString.substring(7, 8);
			
			int numero1 = Integer.parseInt(digito1);
			int numero2 = Integer.parseInt(digito2);
			int numero3 = Integer.parseInt(digito3);
			int numero4 = Integer.parseInt(digito4);
			int numero5 = Integer.parseInt(digito5);
			int numero6 = Integer.parseInt(digito6);
			int numero7 = Integer.parseInt(digito7);
			int numero8 = Integer.parseInt(digito8);
			
			somatorio = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8;
			return somatorio;
		} else if (tamanhoNumero == 7) {
			String digito1 = fatorialString.substring(0, 1);
			String digito2 = fatorialString.substring(1, 2);
			String digito3 = fatorialString.substring(2, 3);
			String digito4 = fatorialString.substring(3, 4);
			String digito5 = fatorialString.substring(4, 5);
			String digito6 = fatorialString.substring(5, 6);
			String digito7 = fatorialString.substring(6, 7);
			
			int numero1 = Integer.parseInt(digito1);
			int numero2 = Integer.parseInt(digito2);
			int numero3 = Integer.parseInt(digito3);
			int numero4 = Integer.parseInt(digito4);
			int numero5 = Integer.parseInt(digito5);
			int numero6 = Integer.parseInt(digito6);
			int numero7 = Integer.parseInt(digito7);
			
			somatorio = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7;
			return somatorio;
		} else if (tamanhoNumero == 6) {
			String digito1 = fatorialString.substring(0, 1);
			String digito2 = fatorialString.substring(1, 2);
			String digito3 = fatorialString.substring(2, 3);
			String digito4 = fatorialString.substring(3, 4);
			String digito5 = fatorialString.substring(4, 5);
			String digito6 = fatorialString.substring(5, 6);
			
			int numero1 = Integer.parseInt(digito1);
			int numero2 = Integer.parseInt(digito2);
			int numero3 = Integer.parseInt(digito3);
			int numero4 = Integer.parseInt(digito4);
			int numero5 = Integer.parseInt(digito5);
			int numero6 = Integer.parseInt(digito6);
			
			somatorio = numero1 + numero2 + numero3 + numero4 + numero5 + numero6;
			return somatorio;
		} else if (tamanhoNumero == 5) {
			String digito1 = fatorialString.substring(0, 1);
			String digito2 = fatorialString.substring(1, 2);
			String digito3 = fatorialString.substring(2, 3);
			String digito4 = fatorialString.substring(3, 4);
			String digito5 = fatorialString.substring(4, 5);
			
			int numero1 = Integer.parseInt(digito1);
			int numero2 = Integer.parseInt(digito2);
			int numero3 = Integer.parseInt(digito3);
			int numero4 = Integer.parseInt(digito4);
			int numero5 = Integer.parseInt(digito5);
			
			somatorio = numero1 + numero2 + numero3 + numero4 + numero5;
			return somatorio;
		} else if (tamanhoNumero == 4) {
			String digito1 = fatorialString.substring(0, 1);
			String digito2 = fatorialString.substring(1, 2);
			String digito3 = fatorialString.substring(2, 3);
			String digito4 = fatorialString.substring(3, 4);
			
			int numero1 = Integer.parseInt(digito1);
			int numero2 = Integer.parseInt(digito2);
			int numero3 = Integer.parseInt(digito3);
			int numero4 = Integer.parseInt(digito4);
			
			somatorio = numero1 + numero2 + numero3 + numero4;
			return somatorio;
		} else if (tamanhoNumero == 3) {
			String digito1 = fatorialString.substring(0, 1);
			String digito2 = fatorialString.substring(1, 2);
			String digito3 = fatorialString.substring(2, 3);
			
			int numero1 = Integer.parseInt(digito1);
			int numero2 = Integer.parseInt(digito2);
			int numero3 = Integer.parseInt(digito3);
			
			somatorio = numero1 + numero2 + numero3;
			return somatorio;
		} else if (tamanhoNumero == 2) {
			String digito1 = fatorialString.substring(0, 1);
			String digito2 = fatorialString.substring(1, 2);
			
			int numero1 = Integer.parseInt(digito1);
			int numero2 = Integer.parseInt(digito2);
			
			somatorio = numero1 + numero2;
			return somatorio;
		} else {
			return fatorial;
		}
	}

}
