import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// 2
		
		Scanner numeros = new Scanner(System.in);
				
		int[] vetNumeros = new int[6];
				
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o " + (i + 1) + "o número: ");
			vetNumeros[i] = numeros.nextInt();
		}
		
		System.out.println("Número 1: " + vetNumeros[0]);
		System.out.println("Número 2: " + vetNumeros[1]);
		System.out.println("Número 3: " + vetNumeros[2]);
		System.out.println("Número 4: " + vetNumeros[3]);
		System.out.println("Número 5: " + vetNumeros[4]);
		System.out.println("Número 6: " + vetNumeros[5]);
				
		numeros.close();

	}

}
