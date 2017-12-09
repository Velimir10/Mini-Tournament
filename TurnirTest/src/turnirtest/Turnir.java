package turnirtest;

import java.util.ArrayList;
import java.util.Arrays;

public class Turnir {

    private ArrayList<Tim> timovi; // Lista timova 
    private int n; // brojac
    private Tim[] a; // Grupa A
    private Tim[] b; // Grupa B
    private Tim[] c; // Grupa C
    private Tim[] d; // Grupa D

    // Konstruktor
    public Turnir() {
        timovi = new ArrayList<>();
        n = 0;
        a = new Tim[4];
        b = new Tim[4];
        c = new Tim[4];
        d = new Tim[4];

    }

    // Dodaj tim na turnir
    public void addTim(Tim tim) {
        if (n == 16) {
            System.out.println("Turnir je popunjen, uneli ste maximalan broj timova.");
        } else {
            timovi.add(tim);
            n++;
        }
    }

    // Izbaci tim sa turnira i ubaci drugi tim
    public void zameniTim(Tim izbaci, Tim ubaci) {
        for (int i = 0; i < timovi.size(); i++) {
            if (timovi.get(i) == izbaci) {
                timovi.remove(izbaci);
                timovi.add(ubaci);
                break;
            }
        }
    }

    // Prikazi sve timove
    public void prikaziTimove() {
        for (Tim tim : timovi) {
            System.out.println(tim);
        }
    }

    // Pomocni metod za popunjavanje grupa
    private void popuni(Tim[] grupa) {
        for (int i = 0; i < grupa.length; i++) {
            int random = (int) (Math.random() * timovi.size());
            if (grupa[i] == null) {
                grupa[i] = timovi.get(random);
                timovi.remove(random);
            }

        }
    }

    // Metod koji popunjava sve grupe
    public void popuniGrupe() {
        popuni(a);
        popuni(b);
        popuni(c);
        popuni(d);
    }
    // Pomocni metod za prikaz grupe
    private void grupa(Tim[] grupa) {

        for (Tim t : grupa) {
            System.out.println(t);
        }
        System.out.println("");
    }

    // Metod koji prikazuje grupe
    public void prikaziGrupe() {
        
        System.out.println("Grupa A");
        grupa(a);
        System.out.println("Grupa B");
        grupa(b);
        System.out.println("Grupa C");
        grupa(c);
        System.out.println("Grupa B");
        grupa(d);
    }

}
