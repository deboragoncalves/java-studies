import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		// 5

		Random aleatorio = new Random();

		System.out.println(volumeEsfera(aleatorio.nextInt(10) + 1));
	}
	
	public static String volumeEsfera(int raio) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("#.00");

		double pi = 3.14;
		double divisao = (double) 4 / 3;		
				
		System.out.println("Raio: " + raio);
		double resultado = divisao * pi * Math.pow(raio, 3);
		
		return formatacaoDecimal.format(resultado);
	}

}
