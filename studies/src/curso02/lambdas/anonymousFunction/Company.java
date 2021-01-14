package lambdas.anonymousFunction;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Company implements Prices {

    // Implementação método

    @Override
    public String media(double p1, double p2, double p3, double p4) {
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(p1);
        prices.add(p2);
        prices.add(p3);
        prices.add(p4);

        double sum = 0.0;

        for (Double price: prices) {
            sum += price;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(sum / prices.size());
    }
}
