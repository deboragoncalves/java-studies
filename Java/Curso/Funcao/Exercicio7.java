import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio7 {

	public static void main(String[] args) {
		// 7
		
		Random aleatorio = new Random();
		
		System.out.println(tempFahrenheit(aleatorio.nextInt(100) + 0));
	}
	
	public static String tempFahrenheit(int tempCelsius) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("#.00");
		double divisao = (double) 9.0 / 5.0;
		double tempFahrenheit = (tempCelsius * divisao) + 32.0;
		
		System.out.println("Temperatura em Celsius: " + tempCelsius);
		System.out.print("Temperatura em Fahrenheit: ");
		return formatacaoDecimal.format(tempFahrenheit);
	}

}
