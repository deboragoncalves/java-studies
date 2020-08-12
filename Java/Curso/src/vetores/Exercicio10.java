import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// 10
		
		Scanner teclado = new Scanner(System.in);
		
		int notas[] = new int[15];
		int soma = 0;
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			notas[i] = teclado.nextInt();
			soma += notas[i];
		}
		
		System.out.println();
		System.out.println("As notas são: ");
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println();
		System.out.println("A média de notas é " + (soma / notas.length));
		
		teclado.close();

	}

}
