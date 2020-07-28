import java.util.Arrays;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// 24
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroAlunos[] = new int[10];
		double alturaAlunos[] = new double[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número do aluno " + (i + 1));
			numeroAlunos[i] = teclado.nextInt();
			
			System.out.println();
			System.out.println("Digite a altura do aluno " + (i + 1));
			alturaAlunos[i] = teclado.nextDouble();
		}
		
		Arrays.sort(numeroAlunos);
		Arrays.sort(alturaAlunos);
		
		System.out.println("Número");
		for (int numero : numeroAlunos) {
			System.out.println(numero);
		}
		
		System.out.println("Altura");
		for (double altura : alturaAlunos) {
			System.out.println(altura);
		}
		
		System.out.println("Número do aluno mais baixo: " + numeroAlunos[0]);
		System.out.println("Altura do aluno mais baixo: " + alturaAlunos[0]);
		System.out.println();
		System.out.println("Número do aluno mais alto: " + numeroAlunos[numeroAlunos.length-1]);
		System.out.println("Altura do aluno mais alto: " + alturaAlunos[alturaAlunos.length-1]);
		
		teclado.close();

	}

}
