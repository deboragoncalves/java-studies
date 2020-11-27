package Condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// 17
		
		double n8, n9, n10, area;
		Scanner leitura = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println("Digite o valor da base menor do trapézio: ");
		n8 = leitura.nextDouble();
		System.out.println("Digite o valor da base maior do trapézio: ");
		n9 = leitura.nextDouble();
		System.out.println("Digite o valor da altura do trapézio ");
		n10 = leitura.nextDouble();
		
		if ((n8 > 0) && (n9 > 0)) {
			area = ( (n8 + n9) * n10 ) / 2.0;
			System.out.println("A área do trapézio é de " + formato.format(area) + "m²");
		} else {
			System.out.println("Números inválidos");
		} 
		
		leitura.close();

	}

}
