package JavaFor;

public class Exercicio56 {

	public static void main(String[] args) {
		// 56
		
		
		int soma = 0;
		
		for (int i = 1; i < 2000000; i++) {
			if (i % i == 0 && i % 1 == 0 && i % 2 != 0 && i % 3 != 0) {
				soma += i;
			}
		}
		
		System.out.println("Soma dos números primos abaixo de 2 milhões: ");
		System.out.println(soma);

	}
}