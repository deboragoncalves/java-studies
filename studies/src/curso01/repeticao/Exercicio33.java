package curso01.repeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		// 33
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = teclado.nextInt();
		System.out.println("Digite 2 n�meros inteiros: ");
		System.out.println("Digite o primeiro n�mero inteiro: ");
		int i = teclado.nextInt();
		System.out.println("Digite o segundo n�mero inteiro: ");
		int j = teclado.nextInt();
		int multiplosI = 0;
		int multiplosJ = 0;
		List<Integer> lista = new ArrayList<Integer>();
		
		if (i != 0 && j != 0) {
			
			for (int a = 0; a <= numero; a++) {
				if (a % i == 0) {
					multiplosI = a / i;
					lista.add(multiplosI);
				} else if (a % j == 0) {
					multiplosJ = a / j;
					lista.add(multiplosJ);
				}
				
			}
			
			System.out.println("Os m�ltiplos de " + i + " e de " + j + " s�o " + lista);
		}
		
		teclado.close();

	}

}
