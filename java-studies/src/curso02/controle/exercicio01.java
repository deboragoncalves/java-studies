package curso02.controle;

import javax.swing.*;

public class exercicio01 {

    public static void main(String[] args) {

        // Desafio: sair do loop quando a entrada for "sair"

        String input = "";

        while (!input.equals("sair")) {
            System.out.println(input);
            input = JOptionPane.showInputDialog("Digite uma palavra: ");
        }

    }
}
