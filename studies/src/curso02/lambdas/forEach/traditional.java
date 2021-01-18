package forEach;

import java.util.ArrayList;

public class traditional {

    /*

    Exercício 03: Utilizar forEach (maneira tradicional)

     */
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Juliana");
        names.add("Pedro");
        names.add("João");

        for (String name: names) {
            System.out.println(name);
        }
    }


}
