package Condicionais;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// 9 
		
		double salario, emprestimo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o salário do funcionário: ");
		salario = teclado.nextDouble();
		
		System.out.println("Digite a prestação do empréstimo: ");
		emprestimo = teclado.nextDouble();
		
		 if (emprestimo > (salario * 0.2)) {
			System.out.println("Empréstimo não concedido");
		} else {
			System.out.println("Empréstimo concedido");
		} 
		
		teclado.close(); 

	}

}
