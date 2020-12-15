package curso02.fundamentos;

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

        System.out.printf("Peso: %s kg \n", decimalFormat.format(weight));
        System.out.printf("Altura: %s m \n", decimalFormat.format(height));

        System.out.printf("IMC: %s", decimalFormat.format(imc));

    }
}
