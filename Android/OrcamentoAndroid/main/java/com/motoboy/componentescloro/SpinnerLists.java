package com.motoboy.componentescloro;

import java.util.ArrayList;
import java.util.List;

class SpinnerLists {

    static List<String> getCidades() {
        List<String> list = new ArrayList<String>();
        list.add("Joinville");
        list.add("Blumenau");
        list.add("Florianópolis");
        list.add("Jaraguá do Sul");
        list.add("Curitiba");
        list.add("Londrina");
        list.add("Itajaí");
        list.add("Balneário Camboriú");
        list.add("Ponta Grossa");
        return list;
    }

    static List<String> getMarcas() {
        List<String> list = new ArrayList<String>();
        list.add("Hidroall");
        list.add("Pace");
        list.add("Genco");
        list.add("Hidro Azul");
        list.add("Limper");
        return list;
    }
}
