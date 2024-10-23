package auf_2;
import java.util.Scanner;

import java.util.ArrayList;

// Teil 1: KlassenamensPerson
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

// Teil 2: KlassenamensArrayListDemoTest
public class ArrayListDemoTest {
    public static void main(String[] args) {
        // Definieren von drei Person-Instanzen
        Person dani = new Person("Dani", "Nachname");
        Person marc = new Person("Marc", "Nachname");
        Person beat = new Person("Beat", "Nachname");

        // Erstellen einer ArrayList-Instanz und Hinzufügen der Person-Instanzen
        ArrayList<Person> personenListe = new ArrayList<>();
        personenListe.add(dani);
        personenListe.add(marc);
        personenListe.add(beat);

        // Ausgabe des Inhalts der Personenliste
        System.out.println("Inhalt der Personenliste:");
        for (Person person : personenListe) {
            System.out.println(person.getName() + " " + person.getVorname());
        }

        // Ausgabe der Namen aller Personen in der Liste
        System.out.println("\nNamen aller Personen in der Liste:");
        for (Person person : personenListe) {
            System.out.println(person.getName());
        }

        // Hinzufügen einer anonymen Person-Instanz an Index 1
        personenListe.add(1, new Person("Anonym", "Person"));

        // Erneute Ausgabe des Inhalts der Personenliste
        System.out.println("\nInhalt der Personenliste nach Hinzufügen einer anonymen Person:");
        for (Person person : personenListe) {
            System.out.println(person.getName() + " " + person.getVorname());
        }

        // Ausgabe der Daten für das Person-Objekt mit Index-Wert 42 (falls vorhanden)
        int index = 42;
        if (index < personenListe.size()) {
            Person personAtIndex42 = personenListe.get(index);
            System.out.println("\nDaten für das Person-Objekt mit Index-Wert 42:");
            System.out.println(personAtIndex42.getName() + " " + personAtIndex42.getVorname());
        } else {
            System.out.println("\nPerson mit Index-Wert 42 existiert nicht in der Liste.");
        }

        // Definieren eines Arrays vom Typ Person und Kopieren des Inhalts der Personenliste
        Person[] arr = personenListe.toArray(new Person[0]);

        // Ausgabe des Array-Inhalts in einer Schleife
        System.out.println("\nInhalt des Arrays arr:");
        for (Person person : arr) {
            System.out.println(person.getName() + " " + person.getVorname());
        }

        // Ausgabe der Personendaten für die erste und die letzte Person in der Liste
        System.out.println("\nDaten für die erste Person in der Liste:");
        System.out.println(personenListe.get(0).getName() + " " + personenListe.get(0).getVorname());

        System.out.println("\nDaten für die letzte Person in der Liste:");
        System.out.println(personenListe.get(personenListe.size() - 1).getName() + " "
                + personenListe.get(personenListe.size() - 1).getVorname());

        // Überprüfung, ob die Person-Instanz, auf die 'marc' verweist, in der Liste ist
        if (personenListe.contains(marc)) {
            System.out.println("\nDie Person-Instanz, auf die 'marc' verweist, befindet sich in der Liste.");
            int position = personenListe.indexOf(marc);
            System.out.println("Position in der Liste: " + position);
        } else {
            System.out.println("\nDie Person-Instanz, auf die 'marc' verweist, befindet sich nicht in der Liste.");
        }
    }
}
