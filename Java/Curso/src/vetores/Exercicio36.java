import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio36 {

	public static void main(String[] args) {
		// 36
		
		Random aleatorio = new Random();
		ArrayList<Integer> vetor = new ArrayList<Integer>(); 
		
		for (int i = 0; i < 10; i++) {
			vetor.add(aleatorio.nextInt(11) + 0);
		}
		
		System.out.println("Vetor não ordenado: " + vetor);
		Collections.sort(vetor);
		System.out.println();
		System.out.println("Vetor ordenado: " + vetor);

	}

}
