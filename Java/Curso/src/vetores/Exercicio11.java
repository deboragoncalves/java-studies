import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// 11
		
		Scanner teclado = new Scanner(System.in);
		
		int valores[] = new int[10];
		int contador = 0; 
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: ");
			valores[i] = teclado.nextInt();
			
			if (valores[i] < 0) {
				contador++;
			} else {
				soma += valores[i];
			}
		}
		
		System.out.println("A quantidade de valores negativos no vetor é de " + contador);
		System.out.println("A soma dos valores positivos do vetor é de " + soma);
		
		teclado.close();

	}

}
