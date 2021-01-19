package lambdas.predicate;

import java.util.function.Predicate;

public class exercise {

    /*

    Exercício 06: Usar predicate: recebe qualquer parâmetro e retorna boolean. Pode ser sem composição e com composição

     */

    public static void main(String[] args) {

        Product product = new Product("Esponja", "Produto de limpeza", 30.5);

        // Predicate sem composição, passando a classe como parâmetro do lambda.

        Predicate<Product> isCleaningProduct = productParam -> productParam.getCategory().equals("Produto de limpeza");

        // Predicate com composição

        Predicate<Product> isCheapCleaningProduct = productParam -> productParam.getCategory().equals("Produto de limpeza") && productParam.getPrice() < 25.0;

        // Usar o método test para testar o predicate.

        System.out.println(isCleaningProduct.test(product));
        System.out.println(isCheapCleaningProduct.test(product));

    }
}
