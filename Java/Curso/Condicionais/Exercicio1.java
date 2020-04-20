package Condicionais;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1
		
		int n1, n2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		n1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		n2 = teclado.nextInt();
		
		if (n1 > n2) {
			System.out.println("O número " + n1 + " é maior");
		} else {
			System.out.println("O número " + n2 + " é maior");
		}
		
		teclado.close();
		
	}
		
		
	}


