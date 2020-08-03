import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio8 {

	public static void main(String[] args) {
		// 8
		
		Random aleatorio = new Random();
		
		System.out.println(hipotenusa(aleatorio.nextInt(15) + 1, aleatorio.nextInt(15) + 1));
	}
	
	public static String hipotenusa(int a, int b) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("#.00");

		double formula = Math.pow(a, 2) + Math.pow(b, 2);
		
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.print("Hipotenusa: ");
		
		return formatacaoDecimal.format(Math.sqrt(formula));
	}

}
