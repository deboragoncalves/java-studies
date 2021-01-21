package lambdas.function;

import java.util.function.Function;

public class exercise01 {

    /*

    Exercício 8: Function

     */

    public static void main(String[] args) {

        // 1o argumento: parâmetro
        // 2o argumento: retorno

        double n1 = 4.5;
        double n2 = 5.5;
        double n3 = 9.5;

        double media = (n1 + n2 + n3) / 3;

        Function<Double, String> resultMedia = mediaParam -> mediaParam >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println(resultMedia.apply(media));

    }
}
