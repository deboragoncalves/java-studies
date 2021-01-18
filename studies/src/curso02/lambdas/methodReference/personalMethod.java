package lambdas.methodReference;

import java.util.ArrayList;

public class personalMethod {

    /*

    Exercício 05: Utilizar method reference com método próprio

     */

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<Double>();

        for (int i = 0; i < 10; i++) {

            // Gerar número aleatório e arredondar. Cast para double

            numbers.add((double) Math.round(Math.random() * 100));

        }

        // Para cada item, chamar o método e passar os números como argumento

        numbers.forEach(personalMethod::showNumber);
    }

    // Criar método estático para impressão

    static void showNumber(Double number) {

        System.out.println("Número: " + number);

    }

}


