package prg.block07;
import java.util.LinkedList;

// Teil 2: KlassenamensLinkedListDemoTest
public class LinkedListDemoTest {
    public static void main(String[] args) {
        // Definieren von drei Person-Instanzen
        Person dani = new Person("Dani", "Nachname");
        Person marc = new Person("Marc", "Nachname");
        Person beat = new Person("Beat", "Nachname");

        // Erstellen einer LinkedList-Instanz und Hinzufügen der Person-Instanzen
        LinkedList<Person> personenListe = new LinkedList<>();
        personenListe.add(dani);
        personenListe.add(marc);
        personenListe.add(beat);

        // Restlicher Code bleibt unverändert

        // Ausgabe des Inhalts der Personenliste
        System.out.println("Inhalt der Personenliste:");
        for (Person person : personenListe) {
            System.out.println(person.getName() + " " + person.getVorname());
        }

        // Restlicher Code bleibt unverändert
    }
}
