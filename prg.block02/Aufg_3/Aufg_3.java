import java.util.Scanner;

public class Aufg_3 {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Eingabe der Maschinenparameter
	        
	        /*int Maschinenleistung = 10;
	        int Maschinenkosten = 10;
	        int Lohnkosten = 20;
	        int Auftragkosten = 30; */
	        

	        System.out.print("Maschinenleistung (Stück pro Stunde): ");
	        double maschinenLeistung = scanner.nextDouble();

	        System.out.print("Maschinenkosten (CHF pro Stunde): ");
	        double maschinenKostenProStunde = scanner.nextDouble();

	        System.out.print("Lohnkosten (CHF pro Stunde): ");
	        double lohnKostenProStunde = scanner.nextDouble();
	        
	        System.out.print("Stückzahl (Menge der zu produzierenden Einheiten): ");
	        int stueckzahl = scanner.nextInt();

	        System.out.print("Auftragskosten (Fixkosten pro Auftrag): ");
	        double auftragsKosten = scanner.nextDouble();
	        

	        
	        
	        //int stueckzahl = scanner.nextInt();

	        scanner.close();
	        
	        

	        // Berechnung der Produktionskosten
	        // 200= x*(100/10)
	        double maschinenkosten = maschinenKostenProStunde * (stueckzahl / maschinenLeistung);
	        double lohnkosten = lohnKostenProStunde * (stueckzahl / maschinenLeistung);
	        double gesamtkosten = maschinenkosten + lohnkosten + auftragsKosten;

	        // Ausgabe der Ergebnisse
	        System.out.println("Berechnete Produktionskosten:");
	        System.out.println("Maschinenkosten: CHF " + maschinenkosten);
	        System.out.println("Lohnkosten: CHF " + lohnkosten);
	        System.out.println("Gesamtkosten: CHF " + gesamtkosten);
	        
	        
	        if (stueckzahl < 100) {
	        	double preiszuschlag = 0.20 * gesamtkosten;
	        	gesamtkosten += preiszuschlag;
	        	
	        };
	        
	        if (stueckzahl >1000) {
	        	double rabatt = 0.05 * gesamtkosten;
	        	gesamtkosten -= rabatt;
	        	
	        };
	        
	    
	}

}
