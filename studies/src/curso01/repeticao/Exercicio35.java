package curso01.repeticao;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		// 35
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial: ");
		int vInicial = teclado.nextInt();
		
		System.out.println("Digite o valor final: ");
		int vFinal = teclado.nextInt();
		int soma = 0;
		
		if (vFinal > vInicial) {
			for (int i = vInicial; i <= vFinal; i++) {
	        	if (i % 2 == 1) {
	        		soma += i;
	        	}
	        }
	        
	        System.out.println("Soma dos �mpares neste intervalo: " + soma);
		} else {
			System.out.println("Intervalo de valores inv�lido");
		}
		
        
		
		teclado.close();

	}

}
