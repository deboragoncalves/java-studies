import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		System.out.println(verificarNumero(numero));
		
		teclado.close();

	}
	
	public static int verificarNumero(int valor) {
		if (valor > 0) {
			return 1;
		} else if (valor < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
