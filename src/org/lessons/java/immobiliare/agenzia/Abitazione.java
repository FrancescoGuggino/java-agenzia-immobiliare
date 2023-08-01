package org.lessons.java.immobiliare.agenzia;

public class Abitazione extends Immobile{

    private int numeroVani;

    private int numeroBagni;

    public Abitazione(String codice, String indirizzo, int cap, String citta, int metratura, int numeroVani, int numeroBagni) {
        super(codice, indirizzo, cap, citta, metratura);
        this.numeroVani = numeroVani;
        this.numeroBagni = numeroBagni;
    }

    public int getNumeroVani() {
        return numeroVani;
    }

    public int getNumeroBagni() {
        return numeroBagni;
    }


    @Override
    public String toString() {
        return super.toString() +
                " numeroVani: " + numeroVani +
                ", numeroBagni: " + numeroBagni ;
    }
}
