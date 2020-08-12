import java.util.Arrays;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// 06
		
		Scanner valores = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			vetor[i] = valores.nextInt();
		}
		
		Arrays.sort(vetor);
		
		System.out.println("Valores do vetor: ");
		for (int valor : vetor) {
			System.out.println(valor);
		}
		
		System.out.println("Menor valor: " + vetor[0]);
		System.out.println("Maior valor: " + vetor[9]);

		valores.close();

	}

}
