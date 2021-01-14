package lambdas.anonymousFunction;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CalcPrices {

    /*

    Exercício 01: Criar interface com método abstrato, executar em uma classe usando função anônima, que possui o corpo do método.

     */

    public static void main(String[] args) {
        Prices prices = (p1, p2, p3, p4) -> {
            ArrayList<Double> arrayPrices = new ArrayList<Double>();
            arrayPrices.add(p1);
            arrayPrices.add(p2);
            arrayPrices.add(p3);
            arrayPrices.add(p4);

            double sum = 0.0;

            for (Double price: arrayPrices) {
                sum += price;
            }

            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            return decimalFormat.format(sum / arrayPrices.size());
        };

        System.out.println("Média de preços " + prices.media(30.4, 31.6, 32.5, 33.3));
    }
}
