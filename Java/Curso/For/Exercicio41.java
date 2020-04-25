package JavaFor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		// 41
		
		Scanner teclado = new Scanner(System.in);
		
		List<Double> resistencias = new ArrayList<Double>();
		boolean continuar = true;
		double resistencia;
		
		do {
			System.out.println("Entre com a resistência 1: ");
			int r1 = teclado.nextInt();
			
			System.out.println("Entre com a resistência 2: ");
			int r2 = teclado.nextInt();
			
			if (r1 > 0 && r2 > 0) {
				resistencia = (r1 * r2) / (r1 + r2);
				resistencias.add(resistencia);
			} else {
				continuar = false;
				System.out.println("Programa finalizado");
			}
			
		} while (continuar);

		Collections.sort(resistencias);
		
		for (double n : resistencias) {
			System.out.println("Resistência " + n);
		}

		teclado.close();


	}

}
