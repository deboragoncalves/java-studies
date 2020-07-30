import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		// 39

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor inteiro e positivo: ");
		int valorDigitado = teclado.nextInt();
		
		int denominadorCombinacao = 0;
		int linha = 0;
		int contador = valorDigitado;
		
		System.out.println();
		System.out.println("Triângulo de Pascal: ");
		while (contador >= 0) {
			for (int i = 0; i <= valorDigitado - contador; i++) {
				denominadorCombinacao = fatorial(i) * fatorial((valorDigitado - contador) - i);
				linha = fatorial(valorDigitado - contador) / denominadorCombinacao;
				System.out.print(linha + " ");
			}
			
			contador--;
			
			System.out.println();
		}
		
		teclado.close();
				
	}

	public static int fatorial(int linhas) {
		int fatorial = 1;

		for (int i = 1; i <= linhas; i++) {
			fatorial *= i;
		}

		return fatorial;
	}

}
