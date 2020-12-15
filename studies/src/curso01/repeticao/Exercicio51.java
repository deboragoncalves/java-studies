package curso01.repeticao;

public class Exercicio51 {

	public static void main(String[] args) {
		// 51
		
		double salarioInicial = 2000;
		double aumento = (1.5 / 100);
		double salarioAtual = salarioInicial + (salarioInicial * aumento);
		
		int anoInicial = 1997;
		int anoAtual = 2020;
		
		do {
			aumento *= 2;
			
			System.out.println();
			System.out.println("O aumento foi de " + aumento);
			salarioAtual = salarioAtual + (salarioAtual * aumento);
			System.out.println("O sal�rio atual � de R$ " + salarioAtual);
			
			anoInicial++;
			System.out.println("Ano " + anoInicial);
			
		} while (anoInicial < anoAtual);
		
		System.out.println();
		System.out.println("O sal�rio atual � de R$ " + salarioAtual);

	}

}
