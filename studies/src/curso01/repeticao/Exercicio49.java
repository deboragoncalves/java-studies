package curso01.repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		// 49
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		System.out.println("Digite o sal�rio do funcion�rio de Carlos: ");
		double salario1 = teclado.nextDouble();
		
		double salario2 = salario1 / 3;
		
		System.out.println("O sal�rio de Carlos � de R$ " + decimalFormat.format(salario1));
		System.out.println("O sal�rio de Jo�o � de R$ " + decimalFormat.format(salario2));
		
		double poupancaJoao = salario1;
		double poupancaCarlos = (salario1) + (salario1 * 0.02);
		double acumuladoJoao = salario2;
		int contador = 0;
		
		do {
			
			poupancaJoao = salario2 * 0.05;
			
			acumuladoJoao += poupancaJoao;
			contador++;
			
			System.out.println("Acumulado Jo�o: " + decimalFormat.format(acumuladoJoao));
			System.out.println("Contador: " + contador);

			
		} while (acumuladoJoao < poupancaCarlos);
		
		System.out.println("Passaram-se " + contador + " meses para o valor acumulado de Jo�o R$ " + decimalFormat.format(acumuladoJoao) + " ultrapassar/igualar o de Carlos R$ " + decimalFormat.format(poupancaCarlos));
		
		teclado.close();
	}

}
