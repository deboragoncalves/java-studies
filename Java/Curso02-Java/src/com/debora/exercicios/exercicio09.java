package com.debora.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {

        // Desafio calculadora

        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora: ");
        System.out.println();

        System.out.print("Digite o número 1: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o número 2: ");
        double num2 = input.nextDouble();

        System.out.println();
        System.out.println("Digite uma das operações: +, -, *, /: ");
        String operation = input.next();
        System.out.println();

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        double result = 0.00;

        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> System.out.println("Não foi possível realizar a operação. Tente novamente.");
        }

        System.out.println("Número 1: " + decimalFormat.format(num1));
        System.out.println("Número 2: " + decimalFormat.format(num2));
        System.out.println("Resultado: " + decimalFormat.format(result));

    }
}
