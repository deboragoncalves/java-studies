package funcao;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Exercicio71 {

	public static void main(String[] args) {
		// 71
		
		Random aleatorio = new Random();
		
		System.out.println(dentroRetangulo(aleatorio.nextInt(10) + 0, aleatorio.nextInt(10) + 0));

	}
	
	public static int dentroRetangulo(int coordX, int coordY) {
		System.out.println("Ponto: " + "(" + coordX + ", " + coordY + ")");
		System.out.println();
		System.out.println("Coordenadas Retângulo: ");
		
		Integer[] coordRetX = new Integer[6];
		Integer[] coordRetY = new Integer[3];

		for (int i = 0; i < coordRetX.length; i++) {
			coordRetX[i] = i;
		}
		
		for (int i = 0; i < coordRetY.length; i++) {
			coordRetY[i] = i;
		}
		
		System.out.print("X: ");
		for (int coordenada : coordRetX) {
			System.out.print(coordenada + " ");
		}
		
		System.out.println();
		System.out.print("Y: ");
		for (int coordenada : coordRetY) {
			System.out.print(coordenada + " ");
		}
		
		List<Integer> coordenadasX = Arrays.asList(coordRetX);
		List<Integer> coordenadasY = Arrays.asList(coordRetY);
		
		System.out.println();
		System.out.println();
		if (coordenadasX.contains(coordX) && coordenadasY.contains(coordY)) {
			System.out.print("O ponto (" + coordX + ", " + coordY + ") pertence ao Retângulo: " );
			return 1;
		} else {
			System.out.print("O ponto (" + coordX + ", " + coordY + ") não pertence ao Retângulo: " );
			return 0;
		}
		
	}

}
