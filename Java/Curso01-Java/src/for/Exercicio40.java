package JavaFor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		// 40
		
		Scanner teclado = new Scanner(System.in);
		
		List<Integer> numeros = new ArrayList<Integer>();
		boolean continuar = true;
		int maior = 0;
		int menor = 0;
		
		do {
			System.out.println("Entre com um número: ");
			int numero = teclado.nextInt();
			
			if (numero >= 0) {
				numeros.add(numero);
			} else {
				continuar = false;
				System.out.println("Programa finalizado");
			}
			
		} while (continuar);

		Collections.sort(numeros);
		
		menor = numeros.get(0);  
		maior = numeros.get(numeros.size() - 1);
		
		System.out.println("Lista " + numeros);
		System.out.println("Maior " + maior);
		System.out.println("Menor " + menor);

		teclado.close();

	}

}
