package curso02.controle;

import javax.swing.*;

public class exercicio04 {

    public static void main(String[] args) {

        // 4. Criar um programa informa se o ano atual é um ano bissexto

        String inputYear = JOptionPane.showInputDialog("Digite um ano: ");
        int year = Integer.parseInt(inputYear);

        if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
            System.out.printf("O ano %d é bissexto", year);
        } else {
            System.out.printf("O ano %d é não bissexto", year);
        }
    }
}
