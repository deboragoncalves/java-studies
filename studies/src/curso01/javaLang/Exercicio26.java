package curso01.javaLang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) throws IOException {
		// 26
		
		File arquivo = new File("C:\\Users\\Debora\\arquivo.txt");
		
		FileWriter escrever = new FileWriter(new File("C:\\Users\\Debora\\arquivo.txt"));
		
		Scanner teclado = new Scanner(System.in);
		AlunosExercicio26 alunos = new AlunosExercicio26();
		ArrayList<String> infoAlunos = new ArrayList<String>();
		
		System.out.println("Informe quantos alunos ser�o cadastrados: ");
		int qtdeAlunos = teclado.nextInt();
		
		for (int i = 0; i < qtdeAlunos; i++) {
			System.out.println();
			System.out.println("Digite a matr�cula do aluno: ");
			String matricula = teclado.next();
			alunos.setMatricula(matricula);
			System.out.println();
			System.out.println("Digite o sobrenome do aluno: ");
			String sobrenome = teclado.next();
			alunos.setSobrenome(sobrenome);
			System.out.println();
			System.out.println("Digite o ano de nascimento do aluno: ");
			int ano = teclado.nextInt();
			alunos.setAnoNascimento(ano);
			 
			String info = "Matr�cula: " + alunos.getMatricula() + " - Sobrenome: " + alunos.getSobrenome() + " - Ano de nascimento: " + alunos.getAnoNascimento();
			infoAlunos.add(info);
		}
		
		for (String item : infoAlunos) {
			escrever.write(item + " | ");
		}
		
		escrever.close();
		
		FileReader ler = new FileReader(arquivo);
		BufferedReader leitura = new BufferedReader(ler);
		
		String linha = leitura.readLine();
		
		if (linha != null) {
			System.out.println(linha);
		} 
		
		teclado.close();

	}

}
