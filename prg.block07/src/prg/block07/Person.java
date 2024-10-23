// Teil 1: KlassenamensPerson

package prg.block07;
import java.util.Scanner;

import java.util.ArrayList;

class Person {
    private String name;
    private String vorname;

    // Konstruktor
    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
