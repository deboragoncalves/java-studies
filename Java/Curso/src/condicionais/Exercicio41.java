package Condicionais;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		// 41
		
		// imc = peso / altura²
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = teclado.nextDouble();
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc <= 18.5) {
			System.out.println("Classificação: Abaixo do peso");
		} else if (imc > 18.6 && imc <= 24.9) {
			System.out.println("Classificação: Saudável");
		} else if (imc > 25.0 && imc <= 29.9) {
			System.out.println("Classificação: Peso em Excesso");
		} else if (imc > 30.0 && imc <= 34.9) {
			System.out.println("Classificação: Obesidade grau I");
		} else if (imc > 35.0 && imc <= 39.9) {
			System.out.println("Classificação: Obesidade grau II");
		} else if (imc >= 40.0) {
			System.out.println("Classificação: Obesidade grau III");
		}

		
		teclado.close();

	}

}
