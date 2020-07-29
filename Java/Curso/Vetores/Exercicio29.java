import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		// 29
		
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[6];
		int numerosPares[] = new int[6];
		int numerosImpares[] = new int[6];
		int somatorio = 0;
		int contador = 0;
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			vetor[i] = teclado.nextInt();
			
			if (vetor[i] % 2 == 0) {
				numerosPares[i] = vetor[i];
				somatorio += vetor[i];
			} else {
				numerosImpares[i] = vetor[i];
				contador++;
			}
		}
		
		System.out.println();
		System.out.println("Vetor: ");
		for (int valor : vetor) {
			System.out.println(valor);
		}
		
		System.out.println();
		System.out.println("Números pares: ");
		for (int valor : numerosPares) {
			if (valor != 0) {
				System.out.println(valor);
			}
		}
		
		System.out.println();
		System.out.println("Somatório de números pares: " + somatorio);
		
		System.out.println();
		System.out.println("Números ímpares: ");
		for (int valor : numerosImpares) {
			if (valor != 0) {
				System.out.println(valor);
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de números ímpares: " + contador);
		
		teclado.close();

	}

}
