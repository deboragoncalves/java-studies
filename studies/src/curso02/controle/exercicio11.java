package curso02.controle;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class exercicio11 {

    public static void main(String[] args) {

        // 11. Crie um programa que recebe 10 valores e ao final imprima o maior número.

        Double number = 0.0;
        ArrayList<Double> numbers = new ArrayList<>();
        int i = 0;

        while (i < 10) {
            String inputNumber = JOptionPane.showInputDialog("Digite um número: ").replace(",", ".");
            number = Double.parseDouble(inputNumber);

            numbers.add(number);
            i++;
        }

        Collections.sort(numbers);

        System.out.println("Lista de números: " + numbers);
        System.out.println("O maior número é " + numbers.get(numbers.size() - 1));

    }
}
