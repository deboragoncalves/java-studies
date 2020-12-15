package curso01.condicionais;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// 9 
		
		double salario, emprestimo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = teclado.nextDouble();
		
		System.out.println("Digite a presta��o do empr�stimo: ");
		emprestimo = teclado.nextDouble();
		
		 if (emprestimo > (salario * 0.2)) {
			System.out.println("Empr�stimo n�o concedido");
		} else {
			System.out.println("Empr�stimo concedido");
		} 
		
		teclado.close(); 

	}

}
