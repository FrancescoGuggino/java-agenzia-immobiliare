package org.lessons.java.immobiliare.agenzia;

public class Main {
    public static void main(String[] args) {

        Immobile immobile = new Immobile("dstr3245", "via Roma 12 ", 20100, "Milano", 80);
        immobile.aggiungiPersona();
        immobile.getVisualizzazioni();
        System.out.println("Ci sono " + immobile.getVisualizzazioni() + " persone interessate!");

        Box b = new Box("edu32", "via ja 21", 20089, "Cinisello", 32, 2 );

        Abitazione a = new Abitazione("jis329", "via pini 2",  20099,"milano 3", 120, 5, 2);

        Villa v = new Villa("qwe321", "via via 1", 20090, "Opera", 300, 8, 4, 80 );

        System.out.println(b.toString());
        System.out.println(a.toString());
        System.out.println(v.toString());
        System.out.println(immobile.toString());
    }
}
