package lambdas.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class exercise {

    /*

    Exercício 7: Usar consumer: recebe um parâmetro e retorna void. Exemplo: forEach

     */

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Juliana");
        names.add("Luciana");
        names.add("Eduardo");
        names.add("Cinthia");
        
        names.forEach(name -> System.out.println(name));

    }
}
