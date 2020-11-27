import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// 18
		
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int contador = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			vetor[i] = teclado.nextInt();
		}
		
		System.out.print("Digite um número: ");
		int numero = teclado.nextInt();
		
		for (int valor : vetor) {
			if (valor % numero == 0) {
				contador++;
				System.out.println();
				System.out.println("Múltiplo de " + numero + " é " + valor);
			}
		}
		
		System.out.println();
		System.out.println("Existem " + contador + " múltiplos de " + numero);
		
		teclado.close();

	}

}
