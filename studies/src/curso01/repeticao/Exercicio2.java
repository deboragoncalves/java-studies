package curso01.repeticao;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2
		
		int numero = 1;
		
		for (int i = 0; i < 100; i++) {
			System.out.println(numero);
			numero++;
		}
		
		while(numero < 101) {
			System.out.println(numero);
			numero++;
		} 
		
		do {
			System.out.println(numero);
			numero++;
		} while(numero < 101);

	}

}
