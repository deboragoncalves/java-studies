import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1
		Random aleatorio = new Random();
		
		System.out.println("Dobro: " + dobroInteiro(aleatorio.nextInt(10) + 1));
	}
	
	public static int dobroInteiro(int numero) {
		System.out.println("Número: " + numero);
		int dobro = (int) Math.pow(numero, 2);
		return dobro;
	}

}
