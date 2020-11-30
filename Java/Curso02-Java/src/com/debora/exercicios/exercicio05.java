package com.debora.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        // 05. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor para a base de um triângulo: ");
        double base = input.nextDouble();

        System.out.print("Digite um valor para a altura de um triângulo: ");
        double height = input.nextDouble();

        double area = (base * height) / 2;

        // Formatar double

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println();
        System.out.println("Base: " + decimalFormat.format(base) + " m");
        System.out.println("Altura: " + decimalFormat.format(height) + " m");

        System.out.println();
        System.out.println("Área: " + decimalFormat.format(area) + " m²");
    }
}
