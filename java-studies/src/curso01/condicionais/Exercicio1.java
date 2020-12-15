package curso01.condicionais;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1
		
		int n1, n2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		n1 = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro: ");
		n2 = teclado.nextInt();
		
		if (n1 > n2) {
			System.out.println("O n�mero " + n1 + " � maior");
		} else {
			System.out.println("O n�mero " + n2 + " � maior");
		}
		
		teclado.close();
		
	}
		
		
	}


