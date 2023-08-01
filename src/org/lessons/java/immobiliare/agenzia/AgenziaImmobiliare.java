package org.lessons.java.immobiliare.agenzia;

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {

    private List<Immobile> listaImmobili;

    public void add(Immobile i) {
        listaImmobili.add(i);
    }

    public AgenziaImmobiliare() {
        listaImmobili = new ArrayList<>();
    }

    public Immobile cercaImmobile(String codice) {
        for (int i = 0; i < listaImmobili.size(); i++) {
            Immobile immobile = listaImmobili.get(i);
            if (codice.equals(immobile.getCodice())) {
                System.out.println("l'immobile " + codice + " è presente in lista");
            }
        }
        return null;
    }


    public Immobile piuVisualizzato (){
        if (listaImmobili.size() == 0){
            return null;
        }
        Immobile migliorImmobile = listaImmobili.get(0);
        for (int i = 0; i < listaImmobili.size(); i++) {
            Immobile visualizzato = listaImmobili.get(i);
            if ( migliorImmobile.getVisualizzazioni() <= visualizzato.getVisualizzazioni()) {
                migliorImmobile = visualizzato;
            }

        }
        return piuVisualizzato();
    }

}