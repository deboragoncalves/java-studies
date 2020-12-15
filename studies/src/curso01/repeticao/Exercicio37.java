package curso01.repeticao;

public class Exercicio37 {

	public static void main(String[] args) {
		// 37
		
		for (int i = 1000; i <= 9999; i++) {
			int divisao = i / 100;
			int resto = i % 100;
			
			int soma = divisao + resto;
			int quadrado = (int) Math.pow(soma, 2);
			
			if (quadrado == i) {
				System.out.println(quadrado + " � igual a " + i);
			}
		}

	}

}
