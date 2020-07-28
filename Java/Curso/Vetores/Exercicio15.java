import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
						
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			int numero = teclado.nextInt();
					
				if (numeros.contains(numero)) {
					System.out.print("Valor repetido: ");
					System.out.println(numero);
				} else {
					numeros.add(numero);
				}
					
		}
		
		System.out.println("Vetor sem repetição: " + numeros);
				
		teclado.close();

	}

}
