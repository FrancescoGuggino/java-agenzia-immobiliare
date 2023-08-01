package org.lessons.java.immobiliare.agenzia;

public class Immobile {

    // attributi
    private String codice;
    private String indirizzo;

    private  int cap;
    private String citta;

    private int metratura;

    private int visualizzazioni;

    // costruttore

    public Immobile(String codice, String indirizzo, int cap, String citta, int metratura) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.citta = citta;
        this.metratura = metratura;
        this.visualizzazioni = 0;
    }


    // getter setter

    public String getCodice() {
        return codice;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getCap() {
        return cap;
    }

    public String getCitta() {
        return citta;
    }

    public int getMetratura() {
        return metratura;
    }

    public int getVisualizzazioni() {
        return visualizzazioni;
    }


    // metodi

    // aggiorna superficie
    public void reimpostaMetratura (int metratura){
        this.metratura = metratura;

    }

public int aggiungiPersona() {
        return visualizzazioni++;
}


    @Override
    public String toString() {
        return "Immobile: " +
                "codice:" + codice +
                ", indirizzo: " + indirizzo +
                ", cap:" + cap +
                ", citta:" + citta +
                ", metratura:" + metratura +
                ", visualizzazioni:" + visualizzazioni;
    }


}
