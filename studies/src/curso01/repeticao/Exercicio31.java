package curso01.repeticao;

public class Exercicio31 {

	public static void main(String[] args) {
		// 31
		
		double formulaS = 0;
		double resultado = 0;
		int i, j = 1;
		
		
		for (i = 1; i <= 50; i++) {
			j = j + 2;
			System.out.println("Numerador " + j);
			System.out.println("Denominador " + i);
			resultado = j / i;
			System.out.println("Resultado " + resultado);
			formulaS += resultado;
		}

		System.out.println("F�rmula S: " + formulaS);
	}

}
