package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.kontakty.Absolvent;
import sk.stuba.fei.uim.oop.kontakty.Kontakt;

public class Main {

    public static void main(String[] args) {
        var student = new Kontakt("Janko", "Hrasko");
        var absolvent = new Absolvent("Ing.", "Tomas", "Kovacik");

        System.out.println(student.toString());
        System.out.println(absolvent.toString());
    }
}
