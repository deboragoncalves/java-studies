package curso01.condicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// 8
		
		double nota1, nota2, media;
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite a nota 1: ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = teclado.nextDouble();
				
		if (nota1 > 0.0 && nota1 < 10.0 && nota2 > 0.0 && nota2 < 10.0) {
			media = ( nota1 + nota2 ) / 2;
			System.out.println("A m�dia � " + media);
		} else {
			System.out.println("As notas informadas n�o s�o v�lidas");
		} 
				
		teclado.close();

	}

}
