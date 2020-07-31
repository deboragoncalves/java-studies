import java.util.Random;

public class Exercicio16 {

	public static void main(String[] args) {
		// 16
		
		char respostas[][] = new char[3][10];
		char respostaAluno1[] = new char[10];
		char respostaAluno2[] = new char[10];
		char respostaAluno3[] = new char[10];
		char gabarito[] = new char[10];
		
		int numero = 0;
		int contador = 0;
		int contadorRespAluno1 = 0;
		int contadorRespAluno2 = 0;
		int contadorRespAluno3 = 0;
		
		int pontuacaoAluno1 = 0;
		int pontuacaoAluno2 = 0;
		int pontuacaoAluno3 = 0;
		
		char letraGabarito;
		char letraResposta;
		
		Random aleatorio = new Random();
		int matriculaAluno1 = aleatorio.nextInt(100) + 1;
		int matriculaAluno2 = aleatorio.nextInt(100) + 1;
		int matriculaAluno3 = aleatorio.nextInt(100) + 1;

		/*
		 * Identificar números correspondentes aos caracteres a, b, c, d - 97, 98, 99,
		 * 100, 101
		 *
		 */
		
		for (int i = 0; i < respostas.length; i++) {
			for (int j = 0; j < respostas[i].length; j++) {
				numero = aleatorio.nextInt((101 - 97) + 1) + 97;			
				letraResposta = (char) numero;
				respostas[i][j] = letraResposta;
			}
		}
		
		for (int i = 0; i < gabarito.length; i++) {
			numero = aleatorio.nextInt((101 - 97) + 1) + 97;			
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
		System.out.println("Resposta aluno com matrícula " + matriculaAluno1);
		for (char resposta : respostaAluno1) {
			System.out.print(resposta + " ");
			
			if (resposta == gabarito[contadorRespAluno1]) {
				pontuacaoAluno1++;
			} 
			contadorRespAluno1++;
 		}
		
		System.out.println();
		System.out.println();
		System.out.println("Pontuação aluno com matrícula " + matriculaAluno1 + ": " + pontuacaoAluno1);
		
		if (pontuacaoAluno1 >= 7) {
			System.out.println("Aluno foi aprovado.");
		} else {
			System.out.println("Aluno foi reaprovado.");
		}
		
		System.out.println();
		System.out.println("Resposta aluno com matrícula " + matriculaAluno2);
		for (char resposta : respostaAluno2) {
			System.out.print(resposta + " ");
			
			if (resposta == gabarito[contadorRespAluno2]) {
				pontuacaoAluno2++;
			} 
			contadorRespAluno2++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Pontuação aluno com matrícula " + matriculaAluno2 + ": " + pontuacaoAluno2);
		
		if (pontuacaoAluno2 >= 7) {
			System.out.println("Aluno foi aprovado.");
		} else {
			System.out.println("Aluno foi reaprovado.");
		}
		
		System.out.println();
		System.out.println("Resposta aluno com matrícula " + matriculaAluno3);
		for (char resposta : respostaAluno3) {
			System.out.print(resposta + " ");
			
			if (resposta == gabarito[contadorRespAluno3]) {
				pontuacaoAluno3++;
			} 
			contadorRespAluno3++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Pontuação aluno com matrícula " + matriculaAluno3 + ": " + pontuacaoAluno3);
		
		if (pontuacaoAluno3 >= 7) {
			System.out.println("Aluno foi aprovado.");
		} else {
			System.out.println("Aluno foi reaprovado.");
		}

	}

}
