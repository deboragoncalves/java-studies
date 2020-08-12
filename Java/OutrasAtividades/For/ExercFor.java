package com.motoboy.tarefa03;

import java.util.Scanner;

public class ExercFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Você já é cliente da Motoboy.com? (Sim/Não): ");
		String cliente = teclado.nextLine();
		
		cliente = cliente.toUpperCase();
		
		if (cliente.equals("SIM") || cliente.equals("S")) {
			System.out.println("Agradecemos pela confiança! Estamos disponíveis para o que precisar :)");
		} else if (cliente.equals("NÃO") || cliente.equals("N") || cliente.equals("NAO")) {
			System.out.println("Informe em quantos Estados você deseja o atendimento da Motoboy.com: ");
	
			try {
				
				int numero = Integer.parseInt(teclado.nextLine());
				
				for (int i = 0; i < numero; i++) {
					System.out.println();
					System.out.println("Informe o Estado " + (i + 1) + " (UF): ");
					String estados = teclado.nextLine();
					
					estados = estados.toUpperCase();
					
					if (estados.equals("SP") || estados.equals("SÃO PAULO")) {
						System.out.println("Estamos disponíveis em SP. Baixe nosso aplicativo!");
					} else if (estados.equals("MG") || estados.equals("MINAS GERAIS")) {
						System.out.println("Estamos disponíveis em MG. Baixe nosso aplicativo!");
					} else if (estados.equals("PR") || estados.equals("PARANÁ")) {
						System.out.println("Estamos disponíveis no PR. Baixe nosso aplicativo!");
					} else if (estados.equals("RJ") || estados.equals("RIO DE JANEIRO") || estados.equals("RIO")) {
						System.out.println("Estamos disponíveis no RJ. Baixe nosso aplicativo!");
					} else {
						System.out.println("No momento não estamos disponíveis, mas estamos trabalhando para estar mais próximo a você.");
					}
				}	
			} catch (NumberFormatException e) {
				System.out.println("O valor informado é inválido. Você deve informar um número inteiro");
			}
		} else {
		System.out.println("A opção escolhida é inválida");
	} 
		
		}
	}


	
