package curso01.condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		// 4
		
		int n9;
		double n10, n11;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		n9 = teclado.nextInt();
		
		if (n9 > 0) {
			n10 = Math.pow(n9, 2);
			n11 = Math.sqrt(n9);
			
			DecimalFormat formato = new DecimalFormat("#.##");  
			
			System.out.println("O quadrado de " + n9 + " � " + n10);
			System.out.println("A raiz quadrada de " + n9 + " � " + formato.format(n11));
		} else {
			System.out.println("O n�mero deve ser positivo");
		}
		
		teclado.close();
								
	}

}
