
package prg.block01.pp_beispiele.seite17;

import java.util.Date;
import java.time.*;

public class DateTimePrinter {

	public static void main(String[] args) {
		// Aktuelles Datum erstellen
		LocalDate currentDate = LocalDate.now();

		// Aktuelle Zeit erstellen
		LocalTime currentTime = LocalTime.now();

		// Datum und Zeit ausgeben
		System.out.println("\nDatum:    " + currentDate );

		// Zeit ausgeben
		System.out.println("\nZeit:     " + currentTime);

// Ergänzung
		// Aktuelles Datum erstellen, das a angezeigt werden soll
		Date currentDateTime = new Date();

		// Datum und Zeit ausgeben
		System.out.println("\nDatum / Zeit: " + currentDateTime);
	}
}
