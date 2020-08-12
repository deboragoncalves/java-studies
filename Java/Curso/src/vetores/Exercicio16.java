import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// 16
		
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor");
			vetor[i] = teclado.nextInt();
		}
		
		System.out.println("Informe um código: ");
		int codigo = teclado.nextInt();
		
		if (codigo == 0) {
			System.out.println("Fim");
			return;
		} else if (codigo == 1) {
			System.out.println("Vetor na ordem direta: ");
			for (int valor : vetor) {
				System.out.println(valor);
			}
		} else if (codigo == 2) {
			System.out.println("Vetor na ordem inversa: ");
			for (int i = vetor.length - 1; i >= 0; i--) {
				System.out.println(vetor[i]);
			}
		} else {
			System.out.println("O código é inválido");
		}
		
		teclado.close();

	}

}
