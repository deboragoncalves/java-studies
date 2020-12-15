package curso02.controle;

import javax.swing.*;
import java.text.DecimalFormat;

public class exercicio05 {

    public static void main(String[] args) {

        /* 5. Criar um programa que receba duas notas parciais, calcular a média final.
        Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado". */

        String inputNote1 = JOptionPane.showInputDialog("Digite a nota 1: ").replace(",", ".");
        double note1 = Double.parseDouble(inputNote1);

        String inputNote2 = JOptionPane.showInputDialog("Digite a nota 2: ").replace(",", ".");
        double note2 = Double.parseDouble(inputNote2);

        double media = (note1 + note2) / 2;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        if (media >= 7.00) {
            System.out.printf("A média foi de %s. Aprovado", decimalFormat.format(media));
        } else if (media >= 4.00 && media < 7.00) {
            System.out.printf("A média foi de %s. Recuperação", decimalFormat.format(media));
        } else {
            System.out.printf("A média foi de %s. Reprovado", decimalFormat.format(media));
        }

    }
}
