package com.debora.exercicios.controle;

import javax.swing.*;
import java.text.DecimalFormat;

public class exercicio03 {

    public static void main(String[] args) {

        // 03. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par

        String inputNumber = JOptionPane.showInputDialog("Digite um número: ").replace(",", ".");
        double number = Double.parseDouble(inputNumber);

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        if (number >= 0.00 && number <= 10.00) {
            if (number % 2 == 0) {
                System.out.printf("O número %s é par", decimalFormat.format(number));
            } else {
                System.out.printf("O número %s é ímpar", decimalFormat.format(number));
            }
        } else {
            System.out.println("Número inválido. Tente novamente.");
        }

    }
}
