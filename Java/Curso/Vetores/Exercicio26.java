import java.util.Random;

public class Exercicio26 {

	public static void main(String[] args) {
		// 26
		
		Random aleatorio = new Random();
		
		int vetor[] = new int[10];	
		int somatorioMedia = 0;
		int somatorioQuadradoDesvio = 0;
		double media = 0;
		double desvio[] = new double[10];
		double quadradoDesvio[] = new double[10];
		double variancia = 0;
		double desvioPadrao = 0;
		
		for (int i = 0; i < 10; i++) {
			vetor[i] = aleatorio.nextInt(11) + 0;
			somatorioMedia += vetor[i];
		}
		
		/* Media */
		media = somatorioMedia / (vetor.length - 1);
		
		/* Desvio em relação à média */
		
		for (int i = 0; i < 10; i++) {
			desvio[i] = media - vetor[i];
		}
		
		/* Quadrado do desvio */
		
		for (int i = 0; i < 10; i++) {
			quadradoDesvio[i] = Math.pow(desvio[i], 2);
			somatorioQuadradoDesvio += quadradoDesvio[i];
		}
		/* Variância */
		
		variancia = somatorioQuadradoDesvio / (vetor.length);
		
		/* Desvio padrão */
		
		desvioPadrao = Math.sqrt(variancia);
		
		System.out.println();
		System.out.println("Vetor: ");
		for (int valor : vetor) {
			System.out.println(valor);
		}
		
		System.out.println();
		System.out.println("Média: " + media);
		
		System.out.println();
		System.out.println("Variância: " + variancia);
		
		System.out.println();
		System.out.println("Desvio padrão: " + desvioPadrao);
		
	}

}
