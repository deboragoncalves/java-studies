package com.debora.exercicios.fundamentos;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        // 04. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

        String inputNumber = JOptionPane.showInputDialog("Digite um número: ").replace(",", ".");
        double number = Double.parseDouble(inputNumber);

        double square = Math.pow(number, 2);
        double cub = Math.pow(number, 3);

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println();
        System.out.println("Número: " + decimalFormat.format(number));
        System.out.println();
        System.out.println("Quadrado: " + decimalFormat.format(square));
        System.out.println("Cubo: " + decimalFormat.format(cub));

    }
}
