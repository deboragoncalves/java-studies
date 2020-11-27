import java.util.Random;

public class Exercicio17 {

	public static void main(String[] args) {
		// 17
		
		int notasProvas[][] = new int[10][3];
		
		Random aleatorio = new Random();
		
		int menorNota1 = 0;
		int menorNota2 = 0;
		int menorNota3 = 0;
		int contador = 0;

		int notasAluno1[] = new int[3];
		int notasAluno2[] = new int[3];
		int notasAluno3[] = new int[3];
		int notasAluno4[] = new int[3];
		int notasAluno5[] = new int[3];
		int notasAluno6[] = new int[3];
		int notasAluno7[] = new int[3];
		int notasAluno8[] = new int[3];
		int notasAluno9[] = new int[3];
		int notasAluno10[] = new int[3];
		
		for (int i = 0; i < notasProvas.length; i++) {
			for (int j = 0; j < notasProvas[i].length; j++) {
				notasProvas[i][j] = aleatorio.nextInt(10) + 1;
			}
		}
		
		System.out.println("Notas de 10 alunos em 3 provas: ");
		for (int i = 0; i < notasProvas.length; i++) {
			for (int j = 0; j < notasProvas[i].length; j++) {
				System.out.print(notasProvas[i][j] + " ");
				notasAluno1[j] = notasProvas[contador][j];
				notasAluno2[j] = notasProvas[contador+1][j];
				notasAluno3[j] = notasProvas[contador+2][j];
				notasAluno4[j] = notasProvas[contador+3][j];
				notasAluno5[j] = notasProvas[contador+4][j];
				notasAluno6[j] = notasProvas[contador+5][j];
				notasAluno7[j] = notasProvas[contador+6][j];
				notasAluno8[j] = notasProvas[contador+7][j];
				notasAluno9[j] = notasProvas[contador+8][j];
				notasAluno10[j] = notasProvas[contador+9][j];
			}
			System.out.println();
		}
		
		if ((notasAluno1[0] < notasAluno1[1] && notasAluno1[0] < notasAluno1[2])) {
			menorNota1++;
		} else if ((notasAluno1[1] < notasAluno1[0] && notasAluno1[1] < notasAluno1[2])) {
			menorNota2++;
		} else if ((notasAluno1[2] < notasAluno1[0] && notasAluno1[2] < notasAluno1[1])) {
			menorNota3++;
		}
		
		if ((notasAluno2[0] < notasAluno2[1] && notasAluno2[0] < notasAluno2[2])) {
			menorNota1++;
		} else if ((notasAluno2[1] < notasAluno2[0] && notasAluno2[1] < notasAluno2[2])) {
			menorNota2++;
		} else if ((notasAluno2[2] < notasAluno2[0] && notasAluno2[2] < notasAluno2[1])) {
			menorNota3++;
		}
		
		if ((notasAluno3[0] < notasAluno3[1] && notasAluno3[0] < notasAluno3[2])) {
			menorNota1++;
		} else if ((notasAluno3[1] < notasAluno3[0] && notasAluno3[1] < notasAluno3[2])) {
			menorNota2++;
		} else if ((notasAluno3[2] < notasAluno3[0] && notasAluno3[2] < notasAluno3[1])) {
			menorNota3++;
		}
		
		if ((notasAluno4[0] < notasAluno4[1] && notasAluno4[0] < notasAluno4[2])) {
			menorNota1++;
		} else if ((notasAluno4[1] < notasAluno4[0] && notasAluno4[1] < notasAluno4[2])) {
			menorNota2++;
		} else if ((notasAluno4[2] < notasAluno4[0] && notasAluno4[2] < notasAluno4[1])) {
			menorNota3++;
		}
		
		if ((notasAluno5[0] < notasAluno5[1] && notasAluno5[0] < notasAluno5[2])) {
			menorNota1++;
		} else if ((notasAluno5[1] < notasAluno5[0] && notasAluno5[1] < notasAluno5[2])) {
			menorNota2++;
		} else if ((notasAluno5[2] < notasAluno5[0] && notasAluno5[2] < notasAluno5[1])) {
			menorNota3++;
		}
		
		if ((notasAluno6[0] < notasAluno6[1] && notasAluno6[0] < notasAluno6[2])) {
			menorNota1++;
		} else if ((notasAluno6[1] < notasAluno6[0] && notasAluno6[1] < notasAluno6[2])) {
			menorNota2++;
		} else if ((notasAluno6[2] < notasAluno6[0] && notasAluno6[2] < notasAluno6[1])) {
			menorNota3++;
		}
		
		if ((notasAluno7[0] < notasAluno7[1] && notasAluno7[0] < notasAluno7[2])) {
			menorNota1++;
		} else if ((notasAluno7[1] < notasAluno7[0] && notasAluno7[1] < notasAluno7[2])) {
			menorNota2++;
		} else if ((notasAluno7[2] < notasAluno7[0] && notasAluno7[2] < notasAluno7[1])) {
			menorNota3++;
		}
		
		if ((notasAluno8[0] < notasAluno8[1] && notasAluno8[0] < notasAluno8[2])) {
			menorNota1++;
		} else if ((notasAluno8[1] < notasAluno8[0] && notasAluno8[1] < notasAluno8[2])) {
			menorNota2++;
		} else if ((notasAluno8[2] < notasAluno8[0] && notasAluno8[2] < notasAluno8[1])) {
			menorNota3++;
		}
		
		if ((notasAluno9[0] < notasAluno9[1] && notasAluno9[0] < notasAluno9[2])) {
			menorNota1++;
		} else if ((notasAluno9[1] < notasAluno9[0] && notasAluno9[1] < notasAluno9[2])) {
			menorNota2++;
		} else if ((notasAluno9[2] < notasAluno9[0] && notasAluno9[2] < notasAluno9[1])) {
			menorNota3++;
		}
		
			if ((notasAluno10[0] < notasAluno10[1] && notasAluno10[0] < notasAluno10[2])) {
				menorNota1++;
			} else if ((notasAluno10[1] < notasAluno10[0] && notasAluno10[1] < notasAluno10[2])) {
				menorNota2++;
			} else if ((notasAluno10[2] < notasAluno10[0] && notasAluno10[2] < notasAluno10[1])) {
				menorNota3++;
			}
		
		System.out.println();
		System.out.println("Pior nota prova 1 - Número de alunos: " + menorNota1);
		System.out.println("Pior nota prova 2 - Número de alunos: " + menorNota2);
		System.out.println("Pior nota prova 3 - Número de alunos: " + menorNota3);
	}

}
