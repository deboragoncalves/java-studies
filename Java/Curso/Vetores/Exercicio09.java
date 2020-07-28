import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// 09
		
		Scanner valores = new Scanner(System.in);
		
		int vetor[] = new int[6];
		int valoresPares[] = new int[6];
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o " + (i + 1) + "o valor: " );
			vetor[i] = valores.nextInt();
			
			if (vetor[i] % 2 == 0) {
				valoresPares[i] += vetor[i]; 
			} else {
				System.out.println("Digite um valor par.");
				i--;
			}
		}
		
		System.out.println("Valores pares ");
		for (int valor : valoresPares) {
			System.out.println(valor);
		}
		
		System.out.println("Vetor com valores pares invertidos: ");
        for(int i = valoresPares.length - 1; i >= 0; i--){
            System.out.println(valoresPares[i]);
        }
		
		valores.close();

	}

}
