import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio14 {

	public static void main(String[] args) {
		// 14 (incompleto)
		
		Random aleatorio = new Random();
	    Set<Integer> listaNumero = new HashSet<>();
	    int numero = 0;
	    
	    int matriz[][] = new int[5][5];
		
	    for (int i = 0; i < matriz.length; i++) {
	    	numero = aleatorio.nextInt((99 - 0 + 1) + 0);
	    	System.out.println("Número: " + numero);
	    	listaNumero.add(numero);
	    }
	    
	    for (int valor : listaNumero) {
	    	for (int i = 0; i < matriz.length; i++) {
	    		for (int j = 0; j < matriz[i].length; j++) {
	    			matriz[i][j] = valor;
	    		}
	    	}
	    }
	    
	    System.out.println("Matriz: ");
	    System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				/* Imprime todos os elementos de uma coluna */
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
