package org.lessons.java.immobiliare.agenzia;

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {

    private List<Immobile> listaImmobili;


    public AgenziaImmobiliare() {
        listaImmobili = new ArrayList<>();
    }

    public Immobile cercaImmobile (String codice) {
        for (int i = 0; i < listaImmobili.size(); i++) {
            Immobile immobile = listaImmobili.get(i);
            if (codice == listaImmobili){
                System.out.println("l'immobile " + codice +  " è presente in lista");
            }
        }
    }
}
