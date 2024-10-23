package prg09;
import java.util.HashSet;
import Person;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ContainerTest {
    public static void main(String[] args) {
        List<Person> personenListe = new LinkedList<>();
        personenListe.add(new Person("Weber", "Beat"));
        personenListe.add(new Person("Pfister", "Ivan"));
        personenListe.add(new Person("Pechvogel", "Hansli"));
        personenListe.add(new Person("Weber", "Marcel"));
        personenListe.add(new Person("Bucher", "Monika"));
        personenListe.add(new Person("Weber", "Michael"));
        personenListe.add(new Person("Pfister", "Roger"));

        // Alle Personendaten der LinkedList auf dem Bildschirm ausgeben
        System.out.println("\nAusgabe 'LinkedList'-Inhalt:");
        showPersonen(personenListe);

        // Ein Set erstellen und alle Personen aus der obigen Liste übernehmen
        Set<Person> personenSet = new HashSet<>();
        personenSet.addAll(personenListe);

        // Alle Personen aus dem obigen Set ausgeben
        System.out.println("\nAusgabe 'HashSet'-Inhalt:");
        showPersonen(personenSet);
    }

    // Methode zur Ausgabe von Personen
    private static void showPersonen(Iterable<Person> personen) {
        for (Person person : personen) {
            System.out.println("Nachname: " + person.getName() + ", Vorname: " + person.getVorname());
        }
    }
}
