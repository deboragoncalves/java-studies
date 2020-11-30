package com.debora.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        // 03. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double weight = input.nextDouble();

        System.out.print("Digite a sua altura: ");
        double height = input.nextDouble();

        double imc = weight / Math.pow(height, 2);

        // Formatar double

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println();
        System.out.println("Peso: " + decimalFormat.format(weight) + " kg");
        System.out.println("Altura: " + decimalFormat.format(height) + " m");

        System.out.println("IMC: " + decimalFormat.format(imc));

    }
}
