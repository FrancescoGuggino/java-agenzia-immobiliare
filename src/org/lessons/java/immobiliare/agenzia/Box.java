package org.lessons.java.immobiliare.agenzia;

public class Box extends Immobile{

    private int postiAuto;


    public Box(String codice, String indirizzo, int cap, String citta, int metratura, int postiAuto) {
        super(codice, indirizzo, cap, citta, metratura);

        this.postiAuto = postiAuto;
    }


    public int getPostiAuto() {
        return postiAuto;
    }


    @Override
    public String toString() {
        return super.toString() +
                " postiAuto=" + postiAuto +
                '}';
    }
}
