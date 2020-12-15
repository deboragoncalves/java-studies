package curso01.condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// 17
		
		double n8, n9, n10, area;
		Scanner leitura = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println("Digite o valor da base menor do trap�zio: ");
		n8 = leitura.nextDouble();
		System.out.println("Digite o valor da base maior do trap�zio: ");
		n9 = leitura.nextDouble();
		System.out.println("Digite o valor da altura do trap�zio ");
		n10 = leitura.nextDouble();
		
		if ((n8 > 0) && (n9 > 0)) {
			area = ( (n8 + n9) * n10 ) / 2.0;
			System.out.println("A �rea do trap�zio � de " + formato.format(area) + "m�");
		} else {
			System.out.println("N�meros inv�lidos");
		} 
		
		leitura.close();

	}

}
