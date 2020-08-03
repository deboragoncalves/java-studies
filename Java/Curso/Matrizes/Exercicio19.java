import java.util.Random;

public class Exercicio19 {

	public static void main(String[] args) {
		// 19 (incompleto)

		Random aleatorio = new Random();

		int informacoesAlunos[][] = new int[5][4];
		int informacoesAluno1[] = new int[4];
		int informacoesAluno2[] = new int[4];
		int informacoesAluno3[] = new int[4];
		int informacoesAluno4[] = new int[4];
		int informacoesAluno5[] = new int[4];

		int contador = 0;
		int somatorio = 0;

		for (int i = 0; i < informacoesAlunos.length; i++) {
			for (int j = 0; j < informacoesAlunos[i].length; j++) {
				if (j < informacoesAlunos[i].length - 1) {
					informacoesAlunos[i][j] = aleatorio.nextInt(10) + 1;
				} else {
					informacoesAlunos[i][j] = informacoesAlunos[i][j - 1] + informacoesAlunos[i][j - 2];
				}
			}
		}

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

		

		/*
		 * Cada linha é um aluno: matrícula, média dos trabalhos, média das provas e
		 * média final
		 */

		System.out.println();
		System.out.println("Informações Alunos: matrícula, média dos trabalhos e média das provas.");
		System.out.println();
		System.out.println("Informações - Aluno 1: ");
		for (int info : informacoesAluno1) {
			if (info != 0) {
				System.out.print(info + " ");
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("Informações - Aluno 2: ");
		for (int info : informacoesAluno2) {
			if (info != 0) {
				System.out.print(info + " ");
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("Informações - Aluno 3: ");
		for (int info : informacoesAluno3) {
			if (info != 0) {
				System.out.print(info + " ");
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("Informações - Aluno 4: ");
		for (int info : informacoesAluno4) {
			if (info != 0) {
				System.out.print(info + " ");
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("Informações - Aluno 5: ");
		for (int info : informacoesAluno5) {
			if (info != 0) {
				System.out.print(info + " ");
			}
		}
		
		/* Maior média final */

		System.out.println();
		System.out.println();
		System.out.println("Média final dos alunos: ");
		for (int i = 0; i < informacoesAlunos.length; i++) {
			for (int j = 0; j < informacoesAlunos[i].length; j++) {
				if (j == 3) {
					System.out.println(informacoesAlunos[i][j]);
					
					somatorio += informacoesAlunos[i][j];

					if (informacoesAlunos[contador][j] > informacoesAlunos[contador + 1][j]
							&& informacoesAlunos[contador][j] > informacoesAlunos[contador + 2][j]
							&& informacoesAlunos[contador][j] > informacoesAlunos[contador + 3][j]
							&& informacoesAlunos[contador][j] > informacoesAlunos[contador + 4][j]) {
						if (i == 4) {
							System.out.println();
							System.out.println("A média do aluno " + (contador + 1) + " é a maior: "
									+ informacoesAlunos[contador][j]);
						}
					} else if (informacoesAlunos[contador + 1][j] > informacoesAlunos[contador][j]
							&& informacoesAlunos[contador + 1][j] > informacoesAlunos[contador + 2][j]
							&& informacoesAlunos[contador + 1][j] > informacoesAlunos[contador + 3][j]
							&& informacoesAlunos[contador + 1][j] > informacoesAlunos[contador + 4][j]) {
						if (i == 4) {
							System.out.println();
							System.out.println("A média do aluno " + (contador + 2) + " é a maior: "
									+ informacoesAlunos[contador + 1][j]);
						}
					} else if (informacoesAlunos[contador + 2][j] > informacoesAlunos[contador][j]
							&& informacoesAlunos[contador + 2][j] > informacoesAlunos[contador + 1][j]
							&& informacoesAlunos[contador + 2][j] > informacoesAlunos[contador + 3][j]
							&& informacoesAlunos[contador + 2][j] > informacoesAlunos[contador + 4][j]) {
						if (i == 4) {
							System.out.println();
							System.out.println("A média do aluno " + (contador + 3) + " é a maior: "
									+ informacoesAlunos[contador + 2][j]);
						}
					} else if (informacoesAlunos[contador + 3][j] > informacoesAlunos[contador][j]
							&& informacoesAlunos[contador + 3][j] > informacoesAlunos[contador + 1][j]
							&& informacoesAlunos[contador + 3][j] > informacoesAlunos[contador + 2][j]
							&& informacoesAlunos[contador + 3][j] > informacoesAlunos[contador + 4][j]) {
						if (i == 4) {
							System.out.println();
							System.out.println("A média do aluno " + (contador + 4) + " é a maior: "
									+ informacoesAlunos[contador + 3][j]);
						}
					} else if (informacoesAlunos[contador + 4][j] > informacoesAlunos[contador][j]
							&& informacoesAlunos[contador + 4][j] > informacoesAlunos[contador + 1][j]
							&& informacoesAlunos[contador + 4][j] > informacoesAlunos[contador + 2][j]
							&& informacoesAlunos[contador + 4][j] > informacoesAlunos[contador + 3][j]) {
						if (i == 4) {
							System.out.println();
							System.out.println("A média do aluno " + (contador + 5) + " é a maior: "
									+ informacoesAlunos[contador + 4][j]);
						}
					}
					
					if (i == 4) {
						System.out.println();
						System.out.println("A média das notas finais: " + somatorio / informacoesAlunos.length);
					}
				}
			}
		}

	}

}
