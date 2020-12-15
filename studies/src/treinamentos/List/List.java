package treinamentos.List;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
		
			if (!repeticao) {
				System.out.println("A fruta n�o pode ser repetida. Informe novamente.");
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
