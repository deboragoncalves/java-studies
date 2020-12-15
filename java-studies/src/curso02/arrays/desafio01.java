package curso02.arrays;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class desafio01 {

    /*

    Desafio 01: Informar quantidade de notas, informar notas/armazenar em um array e exibir média.

     */

    public static void main(String[] args) {

        String inputNotes = JOptionPane.showInputDialog("Informe a quantidade de notas de um aluno: ");
        int notes = Integer.parseInt(inputNotes);

        ArrayList<Double> arrayNotes = new ArrayList<>();

        for (int i = 0; i < notes; i++) {
            String note = JOptionPane.showInputDialog("Informe a nota " + (i + 1) + ": ").replace(",", ".");

            arrayNotes.add(Double.parseDouble(note));
        }

        double total = 0.0;

        for (Double note: arrayNotes) {
            total += note;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        double media = total / arrayNotes.size();
        System.out.println("Notas: " + arrayNotes);
        System.out.printf("A média é de %s", decimalFormat.format(media));

    }
}
