import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// 11

		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);

		/* A (65) ou P (80) */

		System.out.println("Digite uma letra (A ou P): ");
		String letraUsuario = teclado.next();

		System.out.println(mediaNotas(aleatorio.nextInt(10) + 0, aleatorio.nextInt(10) + 0, aleatorio.nextInt(10) + 0,
				letraUsuario));

	}

	public static String mediaNotas(int notaA, int notaB, int notaC, String letra) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("#.00");
		double media = 0.0;

		if (letra.equals("A") || letra.equals("a")) {
			media = (double) (notaA + notaB + notaC) / 3;
			System.out.print("A média das notas " + notaA + ", " + notaB + ", " + notaC + " é: ");
			return formatacaoDecimal.format(media);
		} else if (letra.equals("P") || letra.equals("p")) {
			media = (double) ((notaA * 5) + (notaB * 3) + (notaC * 2)) / 3;
			System.out.print("A média ponderada das notas " + notaA + ", " + notaB + ", " + notaC + " é: ");
			return formatacaoDecimal.format(media);
		} else {
			return "A letra digitada é inválida";
		}
	}

}
