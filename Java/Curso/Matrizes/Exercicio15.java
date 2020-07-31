import java.util.Random;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15

		char respostas[][] = new char[5][10];
		char respostaAluno1[] = new char[10];
		char respostaAluno2[] = new char[10];
		char respostaAluno3[] = new char[10];
		char respostaAluno4[] = new char[10];
		char respostaAluno5[] = new char[10];
		char gabarito[] = new char[10];

		int pontuacaoAluno1[] = new int[10];
		int pontuacaoAluno2[] = new int[10];
		int pontuacaoAluno3[] = new int[10];
		int pontuacaoAluno4[] = new int[10];
		int pontuacaoAluno5[] = new int[10];
		
		int numero = 0;
		int contador = 0;
		int contadorRespAluno1 = 0;
		int contadorRespAluno2 = 0;
		int contadorRespAluno3 = 0;
		int contadorRespAluno4 = 0;
		int contadorRespAluno5 = 0;
		char letraGabarito;
		char letraResposta;
		
		Random aleatorio = new Random();

		/*
		 * Identificar números correspondentes aos caracteres a, b, c, d - 97, 98, 99,
		 * 100
		 *
		 */
		
		for (int i = 0; i < respostas.length; i++) {
			for (int j = 0; j < respostas[i].length; j++) {
				numero = aleatorio.nextInt((100 - 97) + 1) + 97;			
				letraResposta = (char) numero;
				respostas[i][j] = letraResposta;
			}
		}
		
		for (int i = 0; i < gabarito.length; i++) {
			numero = aleatorio.nextInt((100 - 97) + 1) + 97;			
			letraGabarito = (char) numero;
			gabarito[i] = letraGabarito;
		}
		
		System.out.println("Respostas: ");
		for (int i = 0; i < respostas.length; i++) {
			for (int j = 0; j < respostas[i].length; j++) {
				System.out.print(respostas[i][j] + " ");
				respostaAluno1[j] = respostas[contador][j];
				respostaAluno2[j] = respostas[contador + 1][j];
				respostaAluno3[j] = respostas[contador + 2][j];
				respostaAluno4[j] = respostas[contador + 3][j];
				respostaAluno5[j] = respostas[contador + 4][j];
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Gabarito: ");
		for (char letra : gabarito) {
			System.out.print(letra + " ");
		} 
		
		System.out.println();
		System.out.println();
		System.out.println("Resposta Aluno 1");
		for (char resposta : respostaAluno1) {
			System.out.print(resposta + " ");
			if (resposta == gabarito[contadorRespAluno1]) {
				pontuacaoAluno1[contadorRespAluno1] = 1;
			} else {
				pontuacaoAluno1[contadorRespAluno1] = 0;
			}
			contadorRespAluno1++;
 		}
		
		System.out.println();
		System.out.println();
		System.out.println("Pontuação Aluno 1");
		for (int ponto : pontuacaoAluno1) {
			System.out.print(ponto + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Resposta Aluno 2");
		for (char resposta : respostaAluno2) {
			System.out.print(resposta + " ");
			if (resposta == gabarito[contadorRespAluno2]) {
				pontuacaoAluno2[contadorRespAluno2] = 1;
			} else {
				pontuacaoAluno2[contadorRespAluno2] = 0;
			}
			contadorRespAluno2++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Pontuação Aluno 2");
		for (int ponto : pontuacaoAluno2) {
			System.out.print(ponto + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Resposta Aluno 3");
		for (char resposta : respostaAluno3) {
			System.out.print(resposta + " ");
			if (resposta == gabarito[contadorRespAluno3]) {
				pontuacaoAluno3[contadorRespAluno3] = 1;
			} else {
				pontuacaoAluno3[contadorRespAluno3] = 0;
			}
			contadorRespAluno3++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Pontuação Aluno 3");
		for (int ponto : pontuacaoAluno3) {
			System.out.print(ponto + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Resposta Aluno 4");
		for (char resposta : respostaAluno4) {
			System.out.print(resposta + " ");
			if (resposta == gabarito[contadorRespAluno4]) {
				pontuacaoAluno4[contadorRespAluno4] = 1;
			} else {
				pontuacaoAluno4[contadorRespAluno4] = 0;
			}
			contadorRespAluno4++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Pontuação Aluno 4");
		for (int ponto : pontuacaoAluno4) {
			System.out.print(ponto + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Resposta Aluno 5");
		for (char resposta : respostaAluno5) {
			System.out.print(resposta + " ");
			if (resposta == gabarito[contadorRespAluno5]) {
				pontuacaoAluno5[contadorRespAluno5] = 1;
			} else {
				pontuacaoAluno5[contadorRespAluno5] = 0;
			}
			contadorRespAluno5++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Pontuação Aluno 5");
		for (int ponto : pontuacaoAluno5) {
			System.out.print(ponto + " ");
		}

	}

}
