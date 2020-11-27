package funcao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio19 {

	public static void main(String[] args) {
		// 19
		
		Random aleatorio = new Random();
		
		System.out.println(maiorDivisor(aleatorio.nextInt(20) + 0));

	}
	
	public static int maiorDivisor(int numero) {
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		System.out.println("Número: " + numero);
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisores.add(i);
			}
		}
		
		Collections.sort(divisores);
		System.out.print("Maior divisor: ");
		return divisores.get(divisores.size() - 1);
	}

}
