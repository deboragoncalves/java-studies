package com.debora.exercicios.controle;

import javax.swing.*;
import java.text.DecimalFormat;

public class exercicio02 {

    public static void main(String[] args) {

        // Desafio:  Média das notas dos alunos. Quando o usuário digitar -1, sair.

        double note = 0.00;

        double totalNotes = 0.00;
        double media = 0.00;
        int countNotes = 0;

        while (note != -1) {
            String inputNote = JOptionPane.showInputDialog("Digite a média do aluno: ").replace(",", ".");
            note = Double.parseDouble(inputNote);

            if (note != -1) {
                if (note >= 0.00 && note <= 10.00) {
                    totalNotes += note;
                    countNotes++;
                } else {
                    System.out.println("Nota inválida");
                }
            }

        }

        media = totalNotes / countNotes;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.printf("Média: %s", decimalFormat.format(media));

    }
}
