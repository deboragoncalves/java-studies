package curso01.funcao;

import java.util.Random;

public class Exercicio62 {

	public static void main(String[] args) {
		// 62
		
		Random aleatorio = new Random();
	
		String palavra = "";
		
		
		for (int i = 0; i < 5; i++) {
			char letra = (char) ((char) aleatorio.nextInt(73 - 65 + 1) + 65);
			palavra += letra;
		}
		
		char letras[] = palavra.toCharArray();
		tamanho(letras, letras.length);

	}
	
	public static void tamanho(char[] letras, int tamanho) {
		System.out.print("Palavra: ");
		System.out.print(letras);
		System.out.println();
		System.out.println("Tamanho: " + tamanho);
	}

}
