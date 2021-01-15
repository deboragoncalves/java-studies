package lambdas.functionalInterface;

import java.util.ArrayList;

public class Company {

    /*

    Exercício 02: Utilizar anootação de interface funcional, utilizando métodos default/static/abstrato.
    No método main, implementar através de função anônima.

     */

    public static void main(String[] args) {

        // Corpo método abstrato addProspect da interface Prospects, usando lambda

        Prospects prospects = (listProspects, nameProspect) -> {

            listProspects.add(nameProspect);
            return listProspects;

        };

        ArrayList<String> listProspects = new ArrayList<String>();

        System.out.println(prospects.addProspect(listProspects, "Jaqueline"));

        // Método estático

        System.out.println(Prospects.numberProspect(listProspects));

    }
}
