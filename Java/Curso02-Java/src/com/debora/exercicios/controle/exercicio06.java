package com.debora.exercicios.controle;

import javax.swing.*;
import java.text.DecimalFormat;

public class exercicio06 {
    public static void main(String[] args) {

        // 6. Criar um programa que receba um número e diga se ele é um número primo.

        String inputNumber = JOptionPane.showInputDialog("Digite um número: ").replace(",", ".");
        double number = Double.parseDouble(inputNumber);

        int count = 0;

        for (double i = 0; i < number; i++) {

            if (number % i == 0) {
                count++;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        if (count < 2) {
            System.out.printf("O número %s é primo", decimalFormat.format(number));
        } else {
            System.out.printf("O número %s não é primo", decimalFormat.format(number));
        }

    }
}
