
public class Exercicio19 {

	public static void main(String[] args) {
		// 19
				
		int vetor[] = new int[50];
		
		for (int i = 0; i < 50; i++) {
			vetor[i] = (i + 5 * i) % (i + 1);
		}
		
		System.out.println("Valores do Vetor: ");
		for (int valor : vetor) {
			System.out.println(valor);
		}
		
	}

}
