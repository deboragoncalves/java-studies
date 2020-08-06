package funcao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio41 {

	public static void main(String[] args) {
		// 41
		
		Random aleatorio = new Random();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			numeros.add(aleatorio.nextInt(15) + 0);
		}
		
		System.out.println(maiorNumero(numeros));
	}
	
	public static int maiorNumero(ArrayList<Integer> listaNumeros) {
		System.out.println("Números: " + listaNumeros);
		Collections.sort(listaNumeros);
		System.out.print("Maior número: ");
		return listaNumeros.get(listaNumeros.size() - 1);
	}

}
