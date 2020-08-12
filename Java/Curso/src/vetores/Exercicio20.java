import java.util.Random;

public class Exercicio20 {

	public static void main(String[] args) {
		// 20
		
		Random aleatorio = new Random();
		
		int vetor[] = new int[10];
		int vetorImpares[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			vetor[i] = aleatorio.nextInt(51) + 0;
			
			if ((vetor[i] % 2) != 0) {
				vetorImpares[i] += vetor[i];
			}
		}
		
		System.out.println("Valores Vetor Original: ");
		
		for (int i = 0; i <= 1; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 2; i <= 3; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 4; i <= 5; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 6; i <= 7; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 7; i <= 8; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Valores Ímpares Vetor: ");
		
		for (int i = 0; i <= 1; i++) {
			if (vetorImpares[i] != 0) {
				System.out.print(vetorImpares[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 2; i <= 3; i++) {
			if (vetorImpares[i] != 0) {
				System.out.print(vetorImpares[i] + " ");
			}
		}
		
		System.out.println();
		
		for (int i = 4; i <= 5; i++) {
			if (vetorImpares[i] != 0) {
				System.out.print(vetorImpares[i] + " ");
			}
		}
		
		System.out.println();
		
		for (int i = 6; i <= 7; i++) {
			if (vetorImpares[i] != 0) {
				System.out.print(vetorImpares[i] + " ");
			}
		}
		
		System.out.println();
		
		for (int i = 7; i <= 8; i++) {
			if (vetorImpares[i] != 0) {
				System.out.print(vetorImpares[i] + " ");
			}
		}
	}

}
