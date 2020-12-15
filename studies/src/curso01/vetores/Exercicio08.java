package curso01.vetores;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// 08
		
		Scanner valores = new Scanner(System.in);
        
        int[] vetor = new int[6];
        
        for(int i = 0; i < 6; i++){
            System.out.println("Digite o " + (i + 1) + "o valor:");
            vetor[i] = valores.nextInt();
        }
        
        System.out.println("Vetor com valores invertidos: ");
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
        
        valores.close();

	}

}
