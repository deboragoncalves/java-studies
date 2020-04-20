package com.motoboy.tarefa02;

import java.util.ArrayList;
import java.util.Scanner;

public class Avaliacao {
	
	// Programa que o usuário utiliza para avaliar 3 Motoboys, informando o nome dele e a nota.
	
	// 3 métodos estáticos para calcular maior, menor e média. Estáticos para não precisar instanciar a classe e nem chamar 
	// uma classe específica.
	
	// Métodos estáticos para não precisar instanciar nada. Chamar direto pela classe Notas.
	
	// A lista de notas vai entrar como argumento dos métodos maior, menor e média. Cada item da lista será pego para calcular:
	// notas.get(0)...
	
	// Objeto Scanner para ler as notas digitadas 
	
	// Criar objeto instanciado da classe Dados. (1 objeto apenas)
	
	// Ler as 3 notas e nomes digitadas e armazenar no objeto. Adicionar nas listas.
	
	// O atributo da nota é inteiro e não Double. Como Double, não consigo digitar do teclado uma String e depois
	// digitar um Double, com inteiro fazendo o parseInt de uma String consigo.
	// Try/catch para quando o usuário digitar um Double, aparecer a mensagem que deve ser inteiro. Caso isso aconteça, 
	// (i--), vai repetir e pedir pro usuário digitar novamente, até que seja um inteiro.
	
	// Criar um for que vai rodar até i < 3. Para não repetir código.
	// A cada nota (e nome) digitado dentro do for, o item é adicionado dentro de uma lista específica de int.

	// No fim, imprimir os dados digitados através do método Imprimir (argumentos nomes e notas e dentro um for, pra deixar
	// o main enxuto e calcular menor, maior nota e média, chamando os métodos.
	
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
