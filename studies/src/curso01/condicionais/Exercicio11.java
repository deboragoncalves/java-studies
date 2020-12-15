package curso01.condicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// 11 
		
		int n1, soma = 0;
		String numero;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = leitura.nextLine();
		n1 = Integer.parseInt(numero);
		
		if (n1 > 0) {
			while (n1 > 0) {
				soma += (n1 % 10);
				n1 /= 10;
			}
			
			System.out.println("Soma dos algarismos: " + soma);
		} else {
			System.out.println("N�mero inv�lido");
		}
		
		leitura.close();
	}

}
