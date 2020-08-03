import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio9 {

	public static void main(String[] args) {
		// 9
		
		Random aleatorio = new Random();
		
		System.out.println(volumeCilindro(aleatorio.nextInt(15) + 1, aleatorio.nextInt(15) + 1));
	}
	
	public static String volumeCilindro(int altura, int raio) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("#.00");

		double pi = 3.141592;
		
		double volume = pi * Math.pow(raio, 2) * altura;
		
		System.out.println("Altura: " + altura);
		System.out.println("Raio: " + raio);
		System.out.print("Volume do cilindro: ");
		return formatacaoDecimal.format(volume);
	}

}
