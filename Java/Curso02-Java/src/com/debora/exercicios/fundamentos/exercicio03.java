package com.debora.exercicios.fundamentos;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        // 03. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

        // Input dialog, substituindo por . quando for double.

        String inputWeight = JOptionPane.showInputDialog("Digite o seu peso: ").replace(",", ".");
        double weight = Double.parseDouble(inputWeight);

        String inputHeight = JOptionPane.showInputDialog("Digite a sua altura: ").replace(",", ".");
        double height = Double.parseDouble(inputHeight);

        double imc = weight / Math.pow(height, 2);

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println();
        System.out.println("Peso: " + decimalFormat.format(weight) + " kg");
        System.out.println("Altura: " + decimalFormat.format(height) + " m");

        System.out.println("IMC: " + decimalFormat.format(imc));

    }
}
