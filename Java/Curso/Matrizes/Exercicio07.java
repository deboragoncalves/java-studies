
public class Exercicio07 {

	public static void main(String[] args) {
		// 07
		
		int matriz[][] = new int[10][10];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i < j) {
					matriz[i][j] = 2 * i + 7 * j;
				} else if (i == j) {
					matriz[i][j] = (int) (3 * Math.pow(i, 2)) - 1;
				} else {
					matriz[i][j] = (int) ((4 * Math.pow(i, 3)) - (5 * Math.pow(j, 2))) + 1; 
				}
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
		

	}

}
