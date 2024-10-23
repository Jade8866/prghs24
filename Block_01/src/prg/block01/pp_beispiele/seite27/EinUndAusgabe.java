package prg.block01.pp_beispiele.seite27;


import java.util.Scanner;

public class EinUndAusgabe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);       // Objekt 'sc' erstellen mit der Klasse Scanner
		
		System.out.println("Anzahl Produkte eingeben: ");
		
		int anzahlProdukte = sc.nextInt();    		// sc-Objekt nimmt alle Zahlen von der Tastatur
											  		// und weist diese Zahalen der Variable
											  		// anzahlProdukte zu
		
		System.out.print("Preis pro Einheit eingeben: ");   // Klasse System gibt was aus ... =>Message!
		double preisProStueck = sc.nextDouble();   	// eine Zahl mit Komma entgegennehmen 
		sc.close();                           		// 'schliessen' des Scanner-Objekts 'sc'

		System.out.print("Gesamtpreis: " + anzahlProdukte * preisProStueck);   
													// zusammensetzen von String mit "Gesamtpreis" 

	}

}
