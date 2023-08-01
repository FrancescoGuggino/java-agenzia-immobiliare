package org.lessons.java.immobiliare.agenzia;

public class Villa extends Abitazione{

    private int metraturaGiardino;

    public Villa(String codice, String indirizzo, int cap, String citta, int metratura, int numeroVani, int numeroBagni, int metraturaGiardino) {
        super(codice, indirizzo, cap, citta, metratura, numeroVani, numeroBagni);
        this.metraturaGiardino = metraturaGiardino;
    }

    public int getMetraturaGiardino() {
        return metraturaGiardino;
    }

    @Override
    public String toString() {
        return super.toString() +
                "metraturaGiardino: " + metraturaGiardino ;
    }

    public void reimpostaMetratura (int metratura, int metraturaGiardino) {
        //super per prendere l'attributo privato dalla classe immobile
        super.reimpostaMetratura(metratura);
        this.metraturaGiardino = metraturaGiardino;
    }
}
