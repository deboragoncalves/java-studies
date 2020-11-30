package com.debora.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        // 06. Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

        Scanner input = new Scanner(System.in);

        System.out.println("Fórmula de Bhaskara: ");
        System.out.print("Digite o valor de a: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        // Formatar double

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println();
        System.out.println("Valor de a: " + decimalFormat.format(a));
        System.out.println("Valor de b: " + decimalFormat.format(b));
        System.out.println("Valor de c: " + decimalFormat.format(c));

        System.out.println();
        System.out.println("Delta: " + decimalFormat.format(delta));
    }
}
