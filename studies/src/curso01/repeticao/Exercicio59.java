package curso01.repeticao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio59 {

	public static void main(String[] args) {
		// 59
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de habitantes de uma cidade: ");
		int habitantes = teclado.nextInt();
		
		List<Integer> listaConsumo = new ArrayList<Integer>();
		int somaConsumo = 0;
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;
		
		for (int i = 1; i <= habitantes; i++) {
			System.out.println(i + " - Digite o consumo do m�s: ");
			int consumo = teclado.nextInt();
			somaConsumo += consumo;
			listaConsumo.add(consumo);
			
			System.out.println(i + " - Digite o c�digo do consumidor: ");
			System.out.println("1 - Residencial, 2 - Comercial, 3 - Industrial");
			int codigo = teclado.nextInt();
			
			if (codigo == 1) {
				soma1 += consumo;
			} else if (codigo == 2) {
				soma2 += consumo;
			} else if (codigo == 3) {
				soma3 += consumo;
			}
 		}
		
		Collections.sort(listaConsumo);
		System.out.println("O menor consumo � de " + listaConsumo.get(0));
		System.out.println("O maior consumo � de " + listaConsumo.get(habitantes - 1));
		
		double media = somaConsumo / habitantes;
		System.out.println("A m�dia de consumo � de " + media);
		
		System.out.println("Na categoria 1, o total de consumo foi de " + soma1);
		System.out.println("Na categoria 2, o total de consumo foi de " + soma2);
		System.out.println("Na categoria 3, o total de consumo foi de " + soma3);
				
		teclado.close();

	}

}
