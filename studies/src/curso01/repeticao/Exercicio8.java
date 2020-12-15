package curso01.repeticao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
			// 8
		 
		    Scanner teclado = new Scanner(System.in);
		    int maior = 0, menor = 0;
		    int vetor[]= new int [10];
		    
		    for (int i = 0; i <= vetor.length - 1; i++) {
		        System.out.println("Digite o " + (i + 1) + "� valor: ");
		        vetor[i] = teclado.nextInt();
		        
		        if (vetor[i] > maior){
	                maior = vetor[i];
	            }
	            
	            if (vetor[i] < menor){
	               menor = vetor[i]; 
	            }
		    }
		    
		    System.out.println("Menor valor: "+ menor);
		    System.out.println("Maior valor: "+ maior);
		    
		    teclado.close();
	}

}
