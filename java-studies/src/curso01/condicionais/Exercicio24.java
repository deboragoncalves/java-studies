package curso01.condicionais;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// 24
		
		String uf;
		double p1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o estado a ser entregue (UF): ");
		uf = teclado.nextLine();
		System.out.println("Informe o pre�o do produto: ");
		p1 = teclado.nextDouble();
		
		uf = uf.toUpperCase();
				
		if (uf.equals("MG")) {
			p1 += p1 * 0.07;
			System.out.println("O pre�o final do produto � de R$ " + p1);
		} else if (uf.equals("SP")) {
			p1 += p1 * 0.12;
			System.out.println("O pre�o final do produto � de R$ " + p1);
		} else if (uf.equals("RJ")) {
			p1 += p1 * 0.15;
			System.out.println("O pre�o final do produto � de R$ " + p1);
		} else if (uf.equals("MS")) {
			p1 += p1 * 0.08;
			System.out.println("O pre�o final do produto � de R$ " + p1);
		} else {
			System.out.println("O estado informado � inv�lido");
		} 
		
		teclado.close();

	}

}
