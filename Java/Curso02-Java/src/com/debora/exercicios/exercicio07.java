package com.debora.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        // 07. Crie um programa que recebe os 3 salários de uma pessoa e calcule a média.

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seus 3 últimos salários: ");
        System.out.print("Salário 1: ");
        double salary1 = input.nextDouble();

        System.out.print("Salário 2: ");
        double salary2 = input.nextDouble();

        System.out.print("Salário 3: ");
        double salary3 = input.nextDouble();

        double media = (salary1 + salary2 + salary3) / 3;

        // Formatar double

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println();
        System.out.println("Salário 1: R$ " + decimalFormat.format(salary1));
        System.out.println("Salário 2: R$ " + decimalFormat.format(salary2));
        System.out.println("Salário 3: R$ " + decimalFormat.format(salary3));

        System.out.println();
        System.out.println("Média: R$ " + decimalFormat.format(media));
    }
}
