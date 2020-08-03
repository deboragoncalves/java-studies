import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2

		Calendar calendario = Calendar.getInstance();

		System.out.println("Data atual: ");
		System.out.println(dataAtualExtenso(calendario));
	}

	public static String dataAtualExtenso(Calendar calendario) {
		Date dataAtual = calendario.getTime();
		int diaAtual = calendario.get(Calendar.DATE);
		int mesAtual = calendario.get(Calendar.MONTH) + 1;
		int anoAtual = calendario.get(Calendar.YEAR);

		DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println(dataFormatada.format(dataAtual));

		String stringDiaAtual = String.valueOf(diaAtual);

		if (diaAtual > 0 && diaAtual < 10) {
			stringDiaAtual = "0" + stringDiaAtual;
		}
		
		String dataAtualExtenso = stringDiaAtual + " de " + nomeDoMes(mesAtual) + " de " + anoAtual;

		return dataAtualExtenso;
	}

	public static String nomeDoMes(int mes) {
		String meses[] = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
				"outubro", "novembro", "dezembro" };

		if (mes == 0) {
			return meses[mes];
		} else if (mes == 1) {
			return meses[mes - 1];
		} else if (mes == 2) {
			return meses[mes - 1];
		} else if (mes == 3) {
			return meses[mes - 1];
		} else if (mes == 4) {
			return meses[mes - 1];
		} else if (mes == 5) {
			return meses[mes - 1];
		} else if (mes == 6) {
			return meses[mes - 1];
		} else if (mes == 7) {
			return meses[mes - 1];
		} else if (mes == 8) {
			return meses[mes - 1];
		} else if (mes == 9) {
			return meses[mes - 1];
		} else if (mes == 10) {
			return meses[mes - 1];
		} else if (mes == 11) {
			return meses[mes - 1];
		} else {
			return null;
		}
	}

}
