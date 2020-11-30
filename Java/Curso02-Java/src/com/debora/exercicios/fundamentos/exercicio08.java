package com.debora.exercicios.fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        /* Desafio: operadores lógicos.
        Trabalho na terca/quinta.
         */

        System.out.println("Informe seus dias de trabalho, digitando V ou F: ");

        String workTuesday = JOptionPane.showInputDialog("Você irá trabalhar na terça? ").toUpperCase();
        String workThursday = JOptionPane.showInputDialog("Você irá trabalhar na quinta? ").toUpperCase();

        System.out.println();

        if (workTuesday.equals("V") && workThursday.equals("V")) {
            System.out.println("Comprar TV de 50 polegadas");
            System.out.println("Tomar sorvete em família");
        } else if (workTuesday.equals("V") || workThursday.equals("V")) {
            System.out.println("Comprar TV de 32 polegadas");
            System.out.println("Tomar sorvete em família");
        } else if (workTuesday.equals("F") || workThursday.equals("F")){
            System.out.println("Ficar em casa passando fome.");
        } else {
            System.out.println("Houve um erro. Por favor, digite novamente.");
        }

    }
}
