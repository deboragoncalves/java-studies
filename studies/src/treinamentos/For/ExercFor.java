package treinamentos.For;

import java.util.Scanner;

public class ExercFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Voc� j� � cliente da Motoboy.com? (Sim/N�o): ");
		String cliente = teclado.nextLine();
		
		cliente = cliente.toUpperCase();
		
		if (cliente.equals("SIM") || cliente.equals("S")) {
			System.out.println("Agradecemos pela confian�a! Estamos dispon�veis para o que precisar :)");
		} else if (cliente.equals("N�O") || cliente.equals("N") || cliente.equals("NAO")) {
			System.out.println("Informe em quantos Estados voc� deseja o atendimento da Motoboy.com: ");
	
			try {
				
				int numero = Integer.parseInt(teclado.nextLine());
				
				for (int i = 0; i < numero; i++) {
					System.out.println();
					System.out.println("Informe o Estado " + (i + 1) + " (UF): ");
					String estados = teclado.nextLine();
					
					estados = estados.toUpperCase();
					
					if (estados.equals("SP") || estados.equals("S�O PAULO")) {
						System.out.println("Estamos dispon�veis em SP. Baixe nosso aplicativo!");
					} else if (estados.equals("MG") || estados.equals("MINAS GERAIS")) {
						System.out.println("Estamos dispon�veis em MG. Baixe nosso aplicativo!");
					} else if (estados.equals("PR") || estados.equals("PARAN�")) {
						System.out.println("Estamos dispon�veis no PR. Baixe nosso aplicativo!");
					} else if (estados.equals("RJ") || estados.equals("RIO DE JANEIRO") || estados.equals("RIO")) {
						System.out.println("Estamos dispon�veis no RJ. Baixe nosso aplicativo!");
					} else {
						System.out.println("No momento n�o estamos dispon�veis, mas estamos trabalhando para estar mais pr�ximo a voc�.");
					}
				}	
			} catch (NumberFormatException e) {
				System.out.println("O valor informado � inv�lido. Voc� deve informar um n�mero inteiro");
			}
		} else {
		System.out.println("A op��o escolhida � inv�lida");
	} 
		
		}
	}


	
