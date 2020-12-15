package curso01.vetores;

public class Exercicio25 {

	public static void main(String[] args) {
		// 25
		
		int numerosNaturais[] = new int[100];
		
		for (int i = 0; i < 100; i++) {
			String valorI = String.valueOf(i);
			String ultimo = valorI.substring(valorI.length() - 1);
			
			if (i % 7 != 0 || ultimo == "7") {
				numerosNaturais[i] += i;
			}
		}
		
		System.out.println();
		System.out.println("Vetor - Valores Naturais: ");
		for (int valor : numerosNaturais) {
			if (valor != 0) {
				System.out.println(valor);
			}
		}
	
	}

}
