import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// 12
		
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			vetor[i] = teclado.nextInt();
			soma += vetor[i];
		}
		
		System.out.println();
		System.out.println("Os valores do vetor são: ");
		for (int valor : vetor) {
			System.out.println(valor);
		}
		
		System.out.println();
		Arrays.sort(vetor);
		System.out.println("O maior valor do vetor é " + vetor[vetor.length-1]);
		System.out.println("O menor valor do vetor é " + vetor[0]);
		System.out.println("A média é de " + (soma / (vetor.length - 1)));
		
		teclado.close();

	}

}
