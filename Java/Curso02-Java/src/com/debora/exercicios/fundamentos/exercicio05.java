package com.debora.exercicios.fundamentos;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        // 05. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

        String inputBase = JOptionPane.showInputDialog("Digite um valor para a base do triângulo: ").replace(",", ".");;
        double base = Double.parseDouble(inputBase);

        String inputHeight = JOptionPane.showInputDialog("Digite um valor para a altura do triângulo:").replace(",", ".");
        double height = Double.parseDouble(inputHeight);

        double area = (base * height) / 2;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println();
        System.out.println("Base: " + decimalFormat.format(base) + " m");
        System.out.println("Altura: " + decimalFormat.format(height) + " m");

        System.out.println();
        System.out.println("Área: " + decimalFormat.format(area) + " m²");

    }
}
