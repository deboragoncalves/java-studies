import java.util.Random;

public class Exercicio6 {

	public static void main(String[] args) {
		// 6
		
		Random aleatorio = new Random();
		
		System.out.println(transformarSegundos(aleatorio.nextInt(23) + 0, aleatorio.nextInt(60) + 0, aleatorio.nextInt(60) + 0));
	}
	
	public static int transformarSegundos(int horas, int minutos, int segundos) {
		System.out.println("Horas " + horas);
		System.out.println("Minutos " + minutos);
		System.out.println("Segundos " + segundos);

		System.out.println();
		System.out.println("Transformar em segundos: ");
		return (horas * 3600 + minutos * 60 + segundos);
	}

}
