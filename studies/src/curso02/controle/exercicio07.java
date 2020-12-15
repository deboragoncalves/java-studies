package curso02.controle;

import javax.swing.*;
import java.text.DecimalFormat;

public class exercicio07 {

    public static void main(String[] args) {

        // 7. Refatorar o exercício 04, utilizando a estrutura switch.

        String inputNumber = JOptionPane.showInputDialog("Digite um número: ").replace(",", ".");
        double number = Double.parseDouble(inputNumber);

        int count = 0;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        for (double i = 0; i < number; i++) {

            String result = String.valueOf(number % i);

            switch (result) {
                case "0":
                    count++;
                    break;
            }

        }

        switch (count) {
            case 0: case 1:
                System.out.printf("O número %s é primo", decimalFormat.format(number));
                break;

            default:
                System.out.printf("O número %s não é primo", decimalFormat.format(number));
                break;

        }


    }
}
