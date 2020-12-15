package curso01.vetores;

public class Exercicio01 {

	public static void main(String[] args) {
		// 1. a)
		
		int A[] = {0, 1, 5, -2, -5, 7};
				
		// 1. b)
				
		int soma = A[0];
		soma += A[1];
		soma += A[5];
				
		System.out.println("Soma das posi��es 0, 1 e 5 � de " + soma);
				
		// 1. c)
				
		A[4] = 100;
		System.out.println("A posi��o 4 tem valor de " + A[4]);
				
		// 1. d)
				
		System.out.println("O valor 0 do vetor A � de " + A[0]);
		System.out.println("O valor 1 do vetor A � de " + A[1]);
		System.out.println("O valor 2 do vetor A � de " + A[2]);
		System.out.println("O valor 3 do vetor A � de " + A[3]);
		System.out.println("O valor 4 do vetor A � de " + A[4]);
		System.out.println("O valor 5 do vetor A � de " + A[5]);

	}

}
