package curso02.controle;

import javax.swing.*;
import java.text.DecimalFormat;

public class exercicio09 {

    public static void main(String[] args) {

        /* 9. Criar um programa que enquanto estiver recebendo números positivos,
        imprime no console a soma dos números inseridos, caso receba um número negativo,
        encerre o programa. Tente utilizar a estrutura do while.
         */

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        double number = 0.0;
        double sum = 0.0;

        while (number >= 0.0) {
            String inputNumber = JOptionPane.showInputDialog("Digite um número: ").replace(",", ".");
            number = Double.parseDouble(inputNumber);

            if (number >= 0.00) {
                sum += number;
            }

        }

        System.out.printf("A soma dos números é %s", decimalFormat.format(sum));

    }
}
