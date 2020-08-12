import java.util.Random;

public class Exercicio18 {

	public static void main(String[] args) {
		// 18
		
		Random aleatorio = new Random();
		int matriz[][] = new int[3][3];
	
		int somaColunas[] = new int [3];
		int contador = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(20) + 0;
			}
		}
		
		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				somaColunas[contador] = matriz[contador][contador] + matriz[contador+1][contador] + matriz[contador+2][contador];
				somaColunas[contador+1] = matriz[contador][contador+1] + matriz[contador+1][contador+1] + matriz[contador+2][contador+1];
				somaColunas[contador+2] = matriz[contador][contador+2] + matriz[contador+1][contador+2] + matriz[contador+2][contador+2];
 			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Soma Itens Colunas: ");
		for (int valor : somaColunas) {
			System.out.print(valor + " ");
		}

	}

}
