package curso02.controle;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class exercicio10 {

    public static void main(String[] args) {

        // 10. Criar um programa que receba uma palavra e imprime no console letra por letra.

        String word = JOptionPane.showInputDialog("Digite uma palavra: ").toLowerCase();

        System.out.printf("Palavra: %s \n", word);

        for (int i = 0; i < word.length(); i++) {
            char caractere = word.charAt(i);
            System.out.printf("Letra: %c \n", caractere);
        }

    }
}
