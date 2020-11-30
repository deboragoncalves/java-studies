package com.debora.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        // 04. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double number = input.nextDouble();

        double square = Math.pow(number, 2);
        double cub = Math.pow(number, 3);

        // Formatar double

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println();
        System.out.println("Número: " + decimalFormat.format(number));
        System.out.println();
        System.out.println("Quadrado: " + decimalFormat.format(square));
        System.out.println("Cubo: " + decimalFormat.format(cub));
    }
}
