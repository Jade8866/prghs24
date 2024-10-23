package ch.hslu.leds.project;

import ch.hslu.prg.leds.proxy.*;
import java.math.*;
import java.util.Random;
import java.util.Scanner;

public class ClientApp {
	// Konvertiert eine ganze Zahl in den entsprechenden Farbe.
	private static LedColor intToColor(int intFarbe) {
		LedColor farbe;
		// Verwendet eine switch-Anweisung, um den ganzzahligen Farbcode in eine Farbe
		// umzuwandeln.
		switch (intFarbe) {
		case 1:
			farbe = LedColor.BLUE; // 1 entspricht der Farbe Blau.
			break;
		case 2:
			farbe = LedColor.RED; // 2 entspricht der Farbe Rot.
			break;
		case 3:
			farbe = LedColor.GREEN; // 3 entspricht der Farbe Grün.
			break;
		case 4:
			farbe = LedColor.YELLOW; // 4 entspricht der Farbe Gelb.
			break;
		case 5:
			farbe = LedColor.RANDOM; // 5 wählt eine zufällige Farbe aus.
			break;
		default:
			farbe = LedColor.RED; // Bei ungültiger Eingabe wird der default gewählt.
			break;
		}
		return farbe; // Gibt den entsprechenden Farbnamen als String zurück.
	}

	// Liest die gewünschte LED-Farbe vom Benutzer ein.
	private static LedColor readLedColor() {
		int farbe;
		Scanner sc = new Scanner(System.in);
		// Gibt dem Benutzer Anweisungen zur Auswahl einer Farbe.
		System.out.println("Geben Sie ein welche Farbe Sie wollen:");
		System.out.println("Für Blau   geben Sie 1 ein");
		System.out.println("Für Rot    geben Sie 2 ein");
		System.out.println("Für Grün   geben Sie 3 ein");
		System.out.println("Für Gelb   geben Sie 4 ein");
		System.out.println("Für Zufall geben Sie 5 ein");
		farbe = sc.nextInt(); // Liest die Eingabe des Benutzers.
		// Konvertiert die eingetragene Zahl in einen Farb-Enum-Wert und gibt ihn
		// zurück.
		return intToColor(farbe);
	}

// ------------------------- Aufgabe 1 -------------------------
	private static void ledsOnOff(LedService service) {
		int anzahl = 0; // Variable zur Speicherung der Anzahl der LEDs
		int farbe; // Variable zur Speicherung der Farbauswahl
		Scanner sc = new Scanner(System.in); // Scanner-Objekt für Eingaben
		// Schleife für die Eingabeaufforderung zur Festlegung der Anzahl und Farbe der
		// LEDs
		do {
			System.out.println("Geben Sie Anzhal Leds ein: ");
			anzahl = sc.nextInt();
			// Eingabeaufforderungen für die Farbwahl der LEDs
			System.out.println("Geben Sie ein welche Farbe Sie wollen:");
			System.out.println("Für Blau   geben Sie 1 ein");
			System.out.println("Für Rot    geben Sie 2 ein");
			System.out.println("Für Grün   geben Sie 3 ein");
			System.out.println("Für Gelb   geben Sie 4 ein");
			System.out.println("Für Zufall geben Sie 5 ein");
			farbe = sc.nextInt(); // Liest die Farbwahl ein
			// Überprüft, ob die Anzahl der LEDs und die Farbwahl gültige Eingaben sind
		} while ((anzahl <= 0 || anzahl > 256) && (farbe <= 1 || farbe > 5));
		// Fügt die gewählte Anzahl an LEDs in der gewählten Farbe zum Steckboard hinzu
		service.addLeds(anzahl, intToColor(farbe));
		service.stopExecutionFor(2000); // Pausiert die Ausführung für 2 Sekunden
		// Schleife für das Ein- und Ausschalten der LEDs
		for (int runden = 0; runden <= 2; runden++) { // Führt den Zyklus 3-mal durch
			// Schleife zum Einschalten der LEDs
			for (int i = 0; i <= anzahl; i++) {
				service.turnLedOn(i); // Schaltet LED i ein
				service.setDelayInMillis(100); // Verzögerung von 100 Millisekunden
			}
			service.stopExecutionFor(250); // Pausiert die Ausführung für 250 Millisekunden
			// Schleife zum Ausschalten der LEDs
			for (int x = anzahl; x >= 0; x--) {
				service.turnLedOff(x); // Schaltet LED x aus
				service.setDelayInMillis(100); // Verzögerung von 100 Millisekunden
			}
			service.stopExecutionFor(250); // Pausiert die Ausführung für 250 Millisekunden
		}
		service.stopExecutionFor(2000); // Pausiert die Ausführung für 2 Sekunden
		service.reset(); // Setzt das Steckboard zurück
	}

