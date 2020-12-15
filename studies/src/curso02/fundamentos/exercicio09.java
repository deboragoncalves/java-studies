package curso02.fundamentos;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {

        // Desafio calculadora

        System.out.println("Calculadora: ");
        System.out.println();

        String inputNum1 = JOptionPane.showInputDialog("Digite o número 1: ").replace(",", ".");
        double num1 = Double.parseDouble(inputNum1);

        String inputNum2 = JOptionPane.showInputDialog("Digite o número 2: ").replace(",", ".");
        double num2 = Double.parseDouble(inputNum2);

        String operation = JOptionPane.showInputDialog("Digite uma das operações: +, -, *, /: ");

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        double result = 0.00;

        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> System.out.println("Não foi possível realizar a operação. Tente novamente.");
        }

        System.out.printf("Número 1: %s \n", decimalFormat.format(num1));
        System.out.printf("Número 2: %s \n", decimalFormat.format(num2));
        System.out.printf("Resultado: %s \n", decimalFormat.format(result));

    }
}
