package curso01.condicionais;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		// 29
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Prova de Matem�tica");
		
		int a, b, c, soma, count = 0;
		
		a = 50;
		b = 50;
		soma = a + b;
		
		System.out.println("1) Fa�a a soma: ");
		System.out.print(a + " + " + b + " =");
		c = teclado.nextInt();
		System.out.println("A resposta certa �: " + soma);
		
		if (c == soma) {
			count++;
		}
		
		a = 20;
		b = 30;
		soma = a + b;
		
		System.out.println("2) Fa�a a soma: ");
		System.out.print(a + " + " + b + " =");
		c = teclado.nextInt();
		System.out.println("A resposta certa �: " + soma);
		
		if (c == soma) {
			count++;
		}
		
		a = 10;
		b = 30;
		soma = a + b;
		
		System.out.println("3) Fa�a a soma: ");
		System.out.print(a + " + " + b + " =");
		c = teclado.nextInt();
		System.out.println("A resposta certa �: " + soma);
		
		if (c == soma) {
			count++;
		}
		
		a = 20;
		b = 40;
		soma = a + b;
		
		System.out.println("4) Fa�a a soma: ");
		System.out.print(a + " + " + b + " =");
		c = teclado.nextInt();
		System.out.println("A resposta certa �: " + soma);
		
		if (c == soma) {
			count++;
		}
		
		a = 20;
		b = 80;
		soma = a + b;
		
		System.out.println("5) Fa�a a soma: ");
		System.out.print(a + " + " + b + " =");
		c = teclado.nextInt();
		System.out.println("A resposta certa �: " + soma);
		
		System.out.println("Voc� acertou " + count + " perguntas.");
		
		teclado.close();

	}

}
