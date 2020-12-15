package curso01.repeticao;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// 22
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de notas que seja calcular: ");
		int nota = teclado.nextInt();		
		int[] notas = new int[nota];
		int soma = 0;
		int media = 0;
		
		for (int i = 0; i < notas.length; i++) {
				System.out.println("Digite a nota: ");
				notas[i] = teclado.nextInt();
				
			if (notas[i] >= 10 && notas[i] <= 20) {
				soma += notas[i];
			} else {
				soma = 0;
			}
			
		}

		media = soma / notas.length;
		System.out.println("A m�dia � de " + media); 
		
		teclado.close();
	}

}
