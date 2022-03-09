package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pes> list = new ArrayList<>();
        list.add(new Pes("dunco"));
        list.add(new Pes("luna"));
        System.out.println(list.size());

        Pes[] pole = new Pes[2];
        list.toArray(pole);
        for (Zviera zver: pole) {
            zver.zvukZvierata();
        }

        List<Pes> psi = Arrays.asList(pole);
        ArrayList<Pes> list2 = new ArrayList<>(psi);
        list2.add(new Pes("dunco 2"));
        System.out.println(list2.size());
    }
}
