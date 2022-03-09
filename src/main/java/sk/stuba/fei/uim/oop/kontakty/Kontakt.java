package sk.stuba.fei.uim.oop.kontakty;

public class Kontakt {
    private String meno;
    private String priezvisko;

    private Kontakt[] znamy;

    public Kontakt(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }

    public Kontakt(String celeMeno) {
        var casti = celeMeno.split(" ");
        this.meno = casti[0];
        this.priezvisko = casti[1];
    }

    public Kontakt(Kontakt kontakt) {
        this.meno = kontakt.meno;
        this.priezvisko = kontakt.priezvisko;
    }

    public void pridajZnamych(Kontakt[] kontakty) {
        this.znamy = kontakty;
    }

    public void vypisZnamych() {
        for (var znamy : this.znamy) {
            System.out.println(znamy.meno + " " + znamy.priezvisko);
        }
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }
}
