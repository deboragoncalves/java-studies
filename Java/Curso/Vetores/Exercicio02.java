import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// 2
		
		Scanner numeros = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int numero6;

		System.out.println("Informe o primeiro número: ");
		numero1 = numeros.nextInt();
		
		System.out.println("Informe o segundo número: ");
		numero2 = numeros.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		numero3 = numeros.nextInt();
		
		System.out.println("Informe o quarto número: ");
		numero4 = numeros.nextInt();
		
		System.out.println("Informe o quinto número: ");
		numero5 = numeros.nextInt();
		
		System.out.println("Informe o sexto número: ");
		numero6 = numeros.nextInt();
		
		System.out.println("Esse é o primeiro número: " + numero1);
		System.out.println("Esse é o segundo número: " + numero2);
		System.out.println("Esse é o terceiro número: " + numero3);
		System.out.println("Esse é o quarto número: " + numero4);
		System.out.println("Esse é o quinto número: " + numero5);
		System.out.println("Esse é o sexto número: " + numero6);
		
		numeros.close();

	}

}
