package forEach;

import java.util.ArrayList;

public class lambda {

    /*

    Exercício 04: Utilizar foreach com lambda

     */

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<Double>();

        for (int i = 0; i < 10; i++) {

            // Gerar número aleatório e arredondar. Cast para double

            numbers.add((double) Math.round(Math.random() * 10));

        }

        numbers.forEach(number -> System.out.println(number));

    }
}
