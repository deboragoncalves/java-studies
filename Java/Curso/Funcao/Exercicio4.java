import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		// 4
		
		Random aleatorio = new Random();
		
		quadradoPerfeito(aleatorio.nextInt(100) + 1);

	}
	
	public static void quadradoPerfeito(int numero) {
		if (numero > 0) {
			double resultado = Math.sqrt(numero);
			if (resultado % 1 == 0) {
				System.out.println(numero + " é um quadrado perfeito.");
			} else {
				System.out.println(numero + " não é um quadrado perfeito.");
			}
		} 
	}

}
