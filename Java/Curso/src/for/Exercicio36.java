package JavaFor;

public class Exercicio36 {

	public static void main(String[] args) {
		// 36
		
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;
		int diferenca = 0;
		
		for (int i = 1; i <= 100; i++) {
			soma1 += Math.pow(i, 2);
		}
		
		System.out.println("A soma dos quadrados: " + soma1);
		
		for (int i = 1; i <= 100; i++) {
			soma2 += i;
		}
		
		soma3 = (int) Math.pow(soma2, 2);
		System.out.println("O quadrado da soma: " + soma3);
		
		diferenca = soma3 - soma1;
		System.out.println("A diferença entre a soma dos quadrados e o quadrado da soma é " + diferenca);
		
		

	}

}
