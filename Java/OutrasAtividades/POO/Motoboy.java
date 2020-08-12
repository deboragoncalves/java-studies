package com.motoboy.tarefas050607;

import java.util.Scanner;

public class Motoboy {
	public static void main(String[] args) {
				
					Scanner teclado = new Scanner(System.in);
					
					Cliente n1 = new Cliente();
					
					System.out.println("Digite a sua cidade: ");
					n1.cidade = teclado.nextLine();
					
					System.out.println("Digite a sua necessidade (Imediata/Agendamento): ");
					n1.necessidade = teclado.nextLine();
					
					System.out.println("Digite o seu endereço de origem: ");
					n1.origem = teclado.nextLine();
					
					System.out.println("Digite o seu endereço de destino: ");
					n1.destino = teclado.nextLine();
					
					System.out.println(n1); 
					
					Cliente n2 = new Cliente ("São Paulo", "Agendamento", "Rua x", "Rua y");
					
					System.out.println(n2);
					
					Cupom cupom = new Cupom("Joinville", "Agendamento", "Motoboy2020"); 
					
					System.out.println(cupom);
					
					cupom.desconto("Motoboy2020");
					cupom.desconto("Motoboy2020", "Imediata");
					
					// teclado.close();
	}

}
