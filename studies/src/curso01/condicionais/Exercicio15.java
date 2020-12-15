package curso01.condicionais;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15
		
		int n1;
		Scanner leitura4 = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		n1 = leitura4.nextInt();
		
		switch(n1) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		
		case 2:
			System.out.println("Ter�a-feira");
			break;
			
		case 3:
			System.out.println("Quarta-feira");
			break;
			
		case 4:
			System.out.println("Quinta-feira");
			break;
			
		case 5:
			System.out.println("Sexta-feira");
			break;
			
		case 6:
			System.out.println("S�bado");
			break;
			
		case 7:
			System.out.println("Domingo");
			break;
			
		default:
			System.out.println("N�mero inv�lido");
			break;
		}
		
		leitura4.close();
		
	}

}
