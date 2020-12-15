package curso01.repeticao;

public class Exercicio25 {

	public static void main(String[] args) {
		// 25
		
		int soma = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
				soma += i;
			} 
		}
		
		System.out.println("A soma dos n�meros m�ltiplos entre 3 e 5 entre 0 e 999 � " + soma);

	}

}
