package lambdas.methodReference;

import java.util.ArrayList;

public class methodReference {

    /*

    Exercício 04: Utilizar método reference: Sysout.out::priln

    Não é possível personalizar a impressão

     */

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<Double>();

        for (int i = 0; i < 10; i++) {

            // Gerar número aleatório e arredondar. Cast para double

            numbers.add((double) Math.round(Math.random() * 100));

        }

        // Para cada item, imprimir

        numbers.forEach(System.out::println);

    }
}
