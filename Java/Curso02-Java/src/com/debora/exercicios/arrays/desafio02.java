package com.debora.exercicios.arrays;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class desafio02 {

    /*

    Desafio 02: Matriz: quantidade de alunos x quantidade de notas. Média da turma.

     */

    public static void main(String[] args) {

        String inputStudents= JOptionPane.showInputDialog("Informe a quantidade de alunos em uma turma: ");
        int students = Integer.parseInt(inputStudents);

        String inputNotes = JOptionPane.showInputDialog("Informe a quantidade de notas de um aluno: ");
        int notes = Integer.parseInt(inputNotes);

        double[][] arrayNotes = new double[students][notes];

        double total = 0.0;

        for (int i = 0; i < arrayNotes.length; i++) {
            for (int j = 0; j < arrayNotes[i].length; j++) {

                String inputNote = JOptionPane.showInputDialog("Informe a nota " + (j + 1) + " do aluno " + (i + 1) + ":");
                double note = Double.parseDouble(inputNote);

                arrayNotes[i][j] += note;
            }
        }

        for (double[] arrayNote: arrayNotes) {

            System.out.println();
            System.out.println("Notas: " + Arrays.toString(arrayNote));

            for (double note: arrayNote) {
                total += note;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        double media = total / arrayNotes.length;

        System.out.printf("\nMédia: %s", decimalFormat.format(media));

    }
}
