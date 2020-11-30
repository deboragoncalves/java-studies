package com.debora.exercicios.fundamentos;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        // 06. Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

        System.out.println("Fórmula de Bhaskara: \n");

        String inputA = JOptionPane.showInputDialog("Digite o valor de A: ").replace(",", ".");
        double a = Double.parseDouble(inputA);

        String inputB = JOptionPane.showInputDialog("Digite o valor de B: ").replace(",", ".");
        double b = Double.parseDouble(inputB);

        String inputC = JOptionPane.showInputDialog("Digite o valor de B: ").replace(",", ".");
        double c = Double.parseDouble(inputC);

        double delta = Math.pow(b, 2) - 4 * a * c;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.printf("Valor de a: %s \n", decimalFormat.format(a));
        System.out.printf("Valor de b: %s \n", decimalFormat.format(b));
        System.out.printf("Valor de c: %s \n", decimalFormat.format(c));
        System.out.printf("Delta: %s", decimalFormat.format(delta));

    }
}
