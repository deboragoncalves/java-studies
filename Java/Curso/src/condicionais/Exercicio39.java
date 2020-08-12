package Condicionais;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		// 39
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		double salario_atual = teclado.nextDouble();
		System.out.println("Digite o seu tempo de serviço: ");
		double tempo = teclado.nextInt();
		
		double salario_novo;
		
		if (salario_atual <= 500.00 && tempo <= 1) {
			salario_novo = 0.25 * salario_atual + salario_atual;
			System.out.println("Novo salário: R$ " + salario_novo);
		} else if ((salario_atual <= 1000.00) && (tempo > 1) && (tempo <= 3)) {
			salario_novo = 0.20 * salario_atual + salario_atual + 100.00;
			System.out.println("Novo salário: R$ " + salario_novo);
		} else if ((salario_atual <= 1500.00) && (tempo > 4) && (tempo <= 6)) {
			salario_novo = 0.15 * salario_atual + salario_atual + 200.00;
			System.out.println("Novo salário: R$ " + salario_novo);
		} else if ((salario_atual <= 2000.00) && (tempo > 7) && (tempo <= 10)) {
			salario_novo = 0.10 * salario_atual + salario_atual + 300.00;
			System.out.println("Novo salário: R$ " + salario_novo);
		} else if ((salario_atual > 2000.00) && (tempo > 10)) {
			salario_novo = salario_atual + 500.00;
			System.out.println("Novo salário: R$ " + salario_novo);
		}
		
		teclado.close();
	}

}
