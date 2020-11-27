import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		// 14
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
				
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			int numero = teclado.nextInt();
			
			if (numeros.contains(numero)) {
				System.out.println();
				System.out.print("Valor repetido: ");
				System.out.println(numero);
			}
			
			numeros.add(numero);
		}
		
		teclado.close();

		}
				

	}