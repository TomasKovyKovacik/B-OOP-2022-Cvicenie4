package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.kontakty.Kontakt;

public class Main {

    public static void main(String[] args) {
        var tomas = new Kontakt("Tomas", "Kovacik");
        var jakub = new Kontakt("Jakub Kovar");
        var dominik = new Kontakt("Dominik Pruzinsky");

        var prednasajuci = new Kontakt("Gabriel", "Juhas");

        prednasajuci.pridajZnamych(new Kontakt[] {new Kontakt(tomas), new Kontakt(jakub), new Kontakt(dominik)});

        prednasajuci.vypisZnamych();
        tomas.setMeno("Tomaskooo");
        prednasajuci.vypisZnamych();
    }
}
