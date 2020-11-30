package com.debora.exercicios.fundamentos;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        // 07. Crie um programa que recebe os 3 salários de uma pessoa e calcule a média.

        System.out.println("Digite seus 3 últimos salários: ");
        String inputSalary1 = JOptionPane.showInputDialog("Salário 1: ").replace(",", ".");
        double salary1 = Double.parseDouble(inputSalary1);

        String inputSalary2 = JOptionPane.showInputDialog("Salário 2: ").replace(",", ".");
        double salary2 = Double.parseDouble(inputSalary2);

        String inputSalary3 = JOptionPane.showInputDialog("Salário 3: ").replace(",", ".");
        double salary3 = Double.parseDouble(inputSalary3);

        double media = (salary1 + salary2 + salary3) / 3;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println();
        System.out.println("Salário 1: R$ " + decimalFormat.format(salary1));
        System.out.println("Salário 2: R$ " + decimalFormat.format(salary2));
        System.out.println("Salário 3: R$ " + decimalFormat.format(salary3));

        System.out.println();
        System.out.println("Média: R$ " + decimalFormat.format(media));

    }
}
