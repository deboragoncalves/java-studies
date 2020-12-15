package curso01.funcao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio73 {

	public static void main(String[] args) {
		// 73

		String sexo[] = { "M", "F" };
		String corOlhos[] = { "A", "C" };
		String corCabelos[] = { "L", "P", "C" };
		ArrayList<String> idade = new ArrayList<String>();

		preencherDados(sexo, corOlhos, corCabelos, idade);
	}

	public static void preencherDados(String[] sexo, String[] corOlhos, String[] corCabelos, ArrayList<String> idade) {
		Random aleatorio = new Random();
		String dados1[] = new String[4];
		String dados2[] = new String[4];
		String dados3[] = new String[4];
		String dados4[] = new String[4];
		String dados5[] = new String[4];

		while (idade.size() < 5) {
			int numero = aleatorio.nextInt(65 - 17) + 18;
			String stringIdade = String.valueOf(numero);
			idade.add(stringIdade);
		}

		for (int i = 0; i < dados1.length; i++) {
			if (i == 0) {
				dados1[i] = sexo[aleatorio.nextInt(1) + 0];
			} else if (i == 1) {
				dados1[i] = corOlhos[aleatorio.nextInt(1) + 0];
			} else if (i == 2) {
				dados1[i] = corCabelos[aleatorio.nextInt(2) + 0];
			} else {
				dados1[i] = idade.get(aleatorio.nextInt(4) + 0);
			}

		}

		for (int i = 0; i < dados2.length; i++) {
			if (i == 0) {
				dados2[i] = sexo[aleatorio.nextInt(1) + 0];
			} else if (i == 1) {
				dados2[i] = corOlhos[aleatorio.nextInt(1) + 0];
			} else if (i == 2) {
				dados2[i] = corCabelos[aleatorio.nextInt(2) + 0];
			} else {
				dados2[i] = idade.get(aleatorio.nextInt(4) + 0);
			}

		}

		for (int i = 0; i < dados3.length; i++) {
			if (i == 0) {
				dados3[i] = sexo[aleatorio.nextInt(1) + 0];
			} else if (i == 1) {
				dados3[i] = corOlhos[aleatorio.nextInt(1) + 0];
			} else if (i == 2) {
				dados3[i] = corCabelos[aleatorio.nextInt(2) + 0];
			} else {
				dados3[i] = idade.get(aleatorio.nextInt(4) + 0);
			}

		}

		for (int i = 0; i < dados4.length; i++) {
			if (i == 0) {
				dados4[i] = sexo[aleatorio.nextInt(1) + 0];
			} else if (i == 1) {
				dados4[i] = corOlhos[aleatorio.nextInt(1) + 0];
			} else if (i == 2) {
				dados4[i] = corCabelos[aleatorio.nextInt(2) + 0];
			} else {
				dados4[i] = idade.get(aleatorio.nextInt(4) + 0);
			}

		}

		for (int i = 0; i < dados5.length; i++) {
			if (i == 0) {
				dados5[i] = sexo[aleatorio.nextInt(1) + 0];
			} else if (i == 1) {
				dados5[i] = corOlhos[aleatorio.nextInt(1) + 0];
			} else if (i == 2) {
				dados5[i] = corCabelos[aleatorio.nextInt(2) + 0];
			} else {
				dados5[i] = idade.get(aleatorio.nextInt(4) + 0);
			}

		}

		System.out.print("Dados 1: ");
		for (String string : dados1) {
			System.out.print(string + " ");
		}

		System.out.println();
		System.out.print("Dados 2: ");
		for (String string : dados2) {
			System.out.print(string + " ");
		}

		System.out.println();
		System.out.print("Dados 3: ");
		for (String string : dados3) {
			System.out.print(string + " ");
		}

		System.out.println();
		System.out.print("Dados 4: ");
		for (String string : dados4) {
			System.out.print(string + " ");
		}

		System.out.println();
		System.out.print("Dados 5: ");
		for (String string : dados5) {
			System.out.print(string + " ");
		}

		System.out.println(mediaIdade(dados1, dados2, dados3, dados4, dados5));
		System.out.println(maiorIdade(dados1, dados2, dados3, dados4, dados5));
		System.out.println(informacao(dados1, dados2, dados3, dados4, dados5));
	}

	public static String mediaIdade(String[] dados1, String[] dados2, String[] dados3, String[] dados4,
			String[] dados5) {
		DecimalFormat formatacaoDecimal = new DecimalFormat("0.00");

		List<String> listaHabitante1 = Arrays.asList(dados1);
		List<String> listaHabitante2 = Arrays.asList(dados2);
		List<String> listaHabitante3 = Arrays.asList(dados3);
		List<String> listaHabitante4 = Arrays.asList(dados4);
		List<String> listaHabitante5 = Arrays.asList(dados5);

		int somatorio = 0;
		int contador = 0;

		if (listaHabitante1.contains("C") && listaHabitante1.contains("P")) {
			somatorio += Integer.parseInt(listaHabitante1.get(listaHabitante1.size() - 1));
			contador++;
		}

		if (listaHabitante2.contains("C") && listaHabitante2.contains("P")) {
			somatorio += Integer.parseInt(listaHabitante2.get(listaHabitante2.size() - 1));
			contador++;
		}

		if (listaHabitante3.contains("C") && listaHabitante3.contains("P")) {
			somatorio += Integer.parseInt(listaHabitante3.get(listaHabitante3.size() - 1));
			contador++;
		}

		if (listaHabitante4.contains("C") && listaHabitante4.contains("P")) {
			somatorio += Integer.parseInt(listaHabitante4.get(listaHabitante4.size() - 1));
			contador++;
		}

		if (listaHabitante5.contains("C") && listaHabitante5.contains("P")) {
			somatorio += Integer.parseInt(listaHabitante5.get(listaHabitante5.size() - 1));
			contador++;
		}

		System.out.println();
		System.out.println();
		if (contador != 0) {
			double media = (double) (somatorio / contador);
			return formatacaoDecimal.format(media);
		} else {
			return "N�o h� nenhum habitante com olhos castanhos e cabelos pretos. N�o foi poss�vel calcular a m�dia de idade deles.";
		}

	}

	public static int maiorIdade(String[] dados1, String[] dados2, String[] dados3, String[] dados4, String[] dados5) {

		List<String> listaHabitante1 = Arrays.asList(dados1);
		List<String> listaHabitante2 = Arrays.asList(dados2);
		List<String> listaHabitante3 = Arrays.asList(dados3);
		List<String> listaHabitante4 = Arrays.asList(dados4);
		List<String> listaHabitante5 = Arrays.asList(dados5);

		int idadeHabitante1 = Integer.parseInt(listaHabitante1.get(listaHabitante1.size() - 1));
		int idadeHabitante2 = Integer.parseInt(listaHabitante2.get(listaHabitante2.size() - 1));
		int idadeHabitante3 = Integer.parseInt(listaHabitante3.get(listaHabitante3.size() - 1));
		int idadeHabitante4 = Integer.parseInt(listaHabitante4.get(listaHabitante4.size() - 1));
		int idadeHabitante5 = Integer.parseInt(listaHabitante5.get(listaHabitante5.size() - 1));

		List<Integer> idades = new ArrayList<Integer>();
		idades.add(idadeHabitante1);
		idades.add(idadeHabitante2);
		idades.add(idadeHabitante3);
		idades.add(idadeHabitante4);
		idades.add(idadeHabitante5);

		Collections.sort(idades);

		System.out.print("Maior idade: ");
		return idades.get(idades.size() - 1);
	}

	public static int informacao(String[] dados1, String[] dados2, String[] dados3, String[] dados4, String[] dados5) {

		List<String> listaHabitante1 = Arrays.asList(dados1);
		List<String> listaHabitante2 = Arrays.asList(dados2);
		List<String> listaHabitante3 = Arrays.asList(dados3);
		List<String> listaHabitante4 = Arrays.asList(dados4);
		List<String> listaHabitante5 = Arrays.asList(dados5);

		int contador = 0;

		if (listaHabitante1.contains("F") && listaHabitante1.contains("A") && listaHabitante1.contains("L")) {
			int idade = Integer.parseInt(listaHabitante1.get(listaHabitante1.size() - 1));
			if (idade > 18 && idade <= 35) {
				contador++;
			}
		}

		if (listaHabitante2.contains("F") && listaHabitante2.contains("A") && listaHabitante2.contains("L")) {
			int idade = Integer.parseInt(listaHabitante2.get(listaHabitante2.size() - 1));
			if (idade > 18 && idade <= 35) {
				contador++;
			}
		}

		if (listaHabitante3.contains("F") && listaHabitante3.contains("A") && listaHabitante3.contains("L")) {
			int idade = Integer.parseInt(listaHabitante3.get(listaHabitante3.size() - 1));
			if (idade > 18 && idade <= 35) {
				contador++;
			}
		}

		if (listaHabitante4.contains("F") && listaHabitante4.contains("A") && listaHabitante4.contains("L")) {
			int idade = Integer.parseInt(listaHabitante4.get(listaHabitante4.size() - 1));
			if (idade > 18 && idade <= 35) {
				contador++;
			}
		}

		if (listaHabitante5.contains("F") && listaHabitante5.contains("A") && listaHabitante5.contains("L")) {
			int idade = Integer.parseInt(listaHabitante5.get(listaHabitante5.size() - 1));
			if (idade > 18 && idade <= 35) {
				contador++;
			}
		}

		System.out.print("Quantidade pessoas do sexo feminino, com idade entre 18 e 35 anos, olhos azuis e cabelos louros: ");
		return contador;
	}

}
