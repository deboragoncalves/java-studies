import java.util.Random;

public class Exercicio19 {

	public static void main(String[] args) {
		// 19 (incompleto)
		
		Random aleatorio = new Random();
		
		int informacoesAlunos[][] = new int [5][4];
		int informacoesAluno1[] = new int[3];
		int informacoesAluno2[] = new int[3];
		int informacoesAluno3[] = new int[3];
		int informacoesAluno4[] = new int[3];
		int informacoesAluno5[] = new int[3];
		
		int contador = 0;
		
		
		for (int i = 0; i < informacoesAlunos.length; i++) {
			for (int j = 0; j < informacoesAlunos[i].length; j++) {
				informacoesAlunos[i][j] = aleatorio.nextInt(10) + 1;				
			}
		}
		
		System.out.println();
		System.out.println("Informações Alunos: ");
		for (int i = 0; i < informacoesAlunos.length; i++) {
			for (int j = 0; j < informacoesAlunos[i].length; j++) {
				System.out.print(informacoesAlunos[i][j] + " ");
				
				if (j < 3) {
					informacoesAluno1[j] = informacoesAlunos[contador][j];
					informacoesAluno2[j] = informacoesAlunos[contador + 1][j];
					informacoesAluno3[j] = informacoesAlunos[contador + 2][j];
					informacoesAluno4[j] = informacoesAlunos[contador + 3][j];
					informacoesAluno5[j] = informacoesAlunos[contador + 4][j];
				}
												
			}
			System.out.println();
		}
		
		/* Cada linha é um aluno: matrícula, média dos trabalhos, média das provas e média final */
		
		System.out.println();
		System.out.println("Informações - Aluno 1: ");
		for (int info : informacoesAluno1) {
			System.out.print(info + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Informações - Aluno 2: ");
		for (int info : informacoesAluno2) {
			System.out.print(info + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Informações - Aluno 3: ");
		for (int info : informacoesAluno3) {
			System.out.print(info + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Informações - Aluno 4: ");
		for (int info : informacoesAluno4) {
			System.out.print(info + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Informações - Aluno 5: ");
		for (int info : informacoesAluno5) {
			System.out.print(info + " ");
		}
		

	}

}
