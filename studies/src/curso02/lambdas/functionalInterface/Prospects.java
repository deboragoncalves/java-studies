package lambdas.functionalInterface;

// Usar notação de interface funcional

import java.util.ArrayList;

@FunctionalInterface
public interface Prospects {

    // Interface pode ter apenas um método abstrato quando há a anotação de interface funcional

    // Método abstrato para adicionar prospect à lista

    public abstract ArrayList<String> addProspect(ArrayList<String> listProspects, String prospect);

    // Método estático (corpo) para retornar a quantidade de prospects

    public static int numberProspect(ArrayList<String> listProspects) {
        return listProspects.size();
    }

}
