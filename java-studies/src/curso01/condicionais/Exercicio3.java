package curso01.condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3 
		
		double n7;
		double n8;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		n7 = teclado.nextDouble();
		
		if (n7 > 0) {
			n8 = Math.sqrt(n7);
			System.out.println("O n�mero digitado � " + n7);
			
			DecimalFormat formato = new DecimalFormat("#.##");  
			
			System.out.println("A raiz quadrada de " + n7 + " � " + formato.format(n8));
		} else {
			System.out.println("O n�mero deve ser positivo");
		}
		
		teclado.close();
		
	}

}
