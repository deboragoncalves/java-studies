package curso01.repeticao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio60 {

	public static void main(String[] args) {
		// 60
		
		Scanner teclado = new Scanner(System.in);
		int soma = 0;
		int somaPares = 0;
		int contador = 0, contador2 = 0;
		double media, mediaPares;
		int numero2;
		
		List<Integer> listaNumeros = new ArrayList<Integer>();
		
		do {
			
			System.out.println("Digite um n�mero: ");
			numero2 = teclado.nextInt();
			soma += numero2;
			
			contador++;
			
			listaNumeros.add(numero2);
			
			if (numero2 % 2 == 0) {
				somaPares += numero2;
				contador2++;
			}
		} while (numero2 != 0);
		
		System.out.println("A soma dos n�meros � " + soma);
		System.out.println("Foram digitados " + contador + " n�meros");
		
		media = soma / contador;
		System.out.println("A m�dia dos n�meros � " + media);
		
		Collections.sort(listaNumeros);
		System.out.println("O menor n�mero � " + listaNumeros.get(0));
		System.out.println("O maior n�mero � " + listaNumeros.get(listaNumeros.size() - 1));
		
		mediaPares = somaPares / contador2;
		
		System.out.println("A m�dia dos n�meros pares � de " + mediaPares);
		
		teclado.close();

	}

}
