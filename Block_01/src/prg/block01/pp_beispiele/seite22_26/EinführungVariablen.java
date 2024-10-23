package prg.block01.pp_beispiele.seite22_26;

public class EinführungVariablen {

	public static void main(String[] args) {

		//int startWert;    // Variable 'nur' deklarieren (bekanntmachen)
		
		int startWert = 25;  // Variable deklarieren + initialisieren
		
		System.out.println("Der 'startWert' ist: " + startWert);
		
		// 100 weiter Zeilen Code geschrieben ...
		
		startWert = 30;  // neuer Wert ZUWEISEN (von rechts nach links!)
		
		System.out.println("Der 'startWert' ist jetzt: " + startWert);
		
		// neue Variablen mit anderen Datentypen dek + init:
		
		double pi = 3.1415926;
		double radius = 10;     //?
		
		double kreisflaeche = radius * radius * pi;
		
		System.out.println("Ein Kreis mit dem Radius " + radius + " hat ei Kreisflï¿½che: " + kreisflaeche); 
		
		

		
		
		boolean erwachsen = true;
		System.out.println("Die Variable 'erwachsen' hat den Wert: " + erwachsen); 
		

		
		String friendlyMessage = "Guten Morgen!";
		System.out.println(friendlyMessage + " ist ein String!"); 
		
		
		String Anrede = "Frau";
		String name = "Stirnimaa";
		String begruessung = "Güezi wohl";
		
		String langerText = begruessung + " " + Anrede + " " + name + "!";
		System.out.println(langerText);
		
		

	}

}
