package com.motoboy.tarefa02;

import java.util.ArrayList;
import java.util.Scanner;

public class Avaliacao {
	
	public static void main(String[] args) {
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("Digite o seu nome: ");
				String nome = teclado.nextLine();
				
				System.out.println();
				System.out.println("As notas de avaliação de 3 Motoboys da Motoboy.com: ");
				
				Dados dados = new Dados();	
				
				ArrayList<Integer> notas = new ArrayList<Integer>();
				ArrayList<String> nomes = new ArrayList<String>();
				
				for (int i = 0; i < 3; i++) {
					System.out.println("\nNome e Nota do Motoboy " + (i+1) + ": ");
					System.out.println("Nome: ");
					dados.nome = teclado.nextLine();
					nomes.add(dados.nome);
					System.out.println("Nota: ");
					
					try {
						dados.nota = Integer.parseInt(teclado.nextLine());
						notas.add(dados.nota);
						
						
					} catch (NumberFormatException e) {
						System.out.println("Você deve digitar um número inteiro");
						i--;
					}
				}
				
				Imprimir(nomes, notas);
				
				maiorNota(notas);
				menorNota(notas);
				media(notas);

	}
	
	public static void Imprimir (ArrayList<String> nomes, ArrayList<Integer> notas) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("\nMotoboy " + (i+1) + ": " + "\nNome: " + nomes.get(i) + "\nNota: " + notas.get(i));
		}
		
	}
	
	public static void maiorNota(ArrayList<Integer> notas) {
		 if (notas.get(0) > notas.get(1) && notas.get(0) > notas.get(2)) {
				 System.out.println("\nA nota " + notas.get(0) + " é a maior");
			 
		 } else if (notas.get(1) > notas.get(2) && notas.get(1) > notas.get(0)) {
				 System.out.println("\nA nota " + notas.get(1) + " é a maior");
		 } else {
				 System.out.println("\nA nota " + notas.get(2) + " é a maior");	 
		}
	}
	
	public static void menorNota(ArrayList<Integer> notas) {
		 if (notas.get(0) < notas.get(1) && notas.get(0) < notas.get(2)) {
				 System.out.println("\nA nota " + notas.get(0) + " é a menor");
			 
		 } else if (notas.get(1) < notas.get(2) && notas.get(1) < notas.get(0)) {
				 System.out.println("\nA nota " + notas.get(1) + " é a menor");
			 
		 } else {
				 System.out.println("\nA nota " + notas.get(2) + " é a menor");
		}
	}
	
	public static void media(ArrayList<Integer> notas) {
			System.out.println("\nA média é de " + Math.floor((notas.get(0) + notas.get(1) + notas.get(2)) / 3)); 
	}

	
}
