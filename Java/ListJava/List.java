package com.motoboy.tarefa04;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Utilizei OO para criar uma classe e instanciar ela, de maneira padrão, para que o usuário possa digitar a fruta que deseja.
// Atributo public (digitar).
// Para armazenar o nome da fruta, chamar o nome do objeto e o atributo.

// Variável n1 para armazenar a quantidade de frutas que se deseja adquirir.
// Set - Interface: lista de Strings sem repetição. TreeSet - classe: ordenar. 

// n1 precisa ser int para entrar na estrutura for. Mas ler uma string e transformar
// para int, porque se não dá bug e não consigo digitar as frutas (se for int e depois string)

// Imprimir i + 1

// Adicionar elemento digitado. Uma variável bool vai armazenar o elemento. Se repetir, ela não retornar falso.
// Se for falso, pedir pra digitar novamente.

// Foreach do set. Imprimir cada elemento

public class List {

	public static void main(String[] args) {
		
		Frutas frutas1 = new Frutas();
		int n1;
		Scanner f1 = new Scanner(System.in);
		Set<String> set = new TreeSet<String>();
		
		System.out.println("Digite quantas frutas deseja adquirir: ");
		
		n1 = Integer.parseInt(f1.nextLine());

		for (int i = 0; i < n1; i++) {
		System.out.println("Digite o nome da fruta " + (i + 1) + ": "); 
		frutas1.frutas = f1.nextLine();
		boolean repeticao = set.add(frutas1.frutas);
		
			if (repeticao == false) {
				System.out.println("A fruta não pode ser repetida. Informe novamente.");
				i--;
			}
		}
		
		System.out.println("Lista das frutas: ");
		
		for(String i : set) {
			System.out.println(i);
		}
		
		f1.close(); 

	}

}
