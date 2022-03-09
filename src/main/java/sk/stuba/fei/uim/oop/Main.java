package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pes> list = new ArrayList<>();
        list.add(new Pes("dunco"));
        list.add(new Pes("luna"));
        System.out.println(list.size());

        ArrayList<Macka> listMaciek = new ArrayList<>();
        listMaciek.add(new Macka("murko"));
        listMaciek.add(new Macka("garfield"));
        System.out.println(listMaciek.size());

        ArrayList<Zviera> listZveri = new ArrayList<>();
        listZveri.addAll(list);
        listZveri.addAll(listMaciek);
        System.out.println(listZveri.size());

        Collections.shuffle(listZveri);

        for (var i = 0; i < listZveri.size(); i++) {
            ((Zviera) listZveri.get(i)).pohladkat();
        }

        for (var zver : listZveri) {
                zver.pohladkat();
        }

        var iterator = listZveri.iterator();
        while (iterator.hasNext()) {
            var prvok = iterator.next();
            prvok.zvukZvierata();
        }
    }
}
