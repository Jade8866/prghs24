package lohnabrechnung;
import java.util.Scanner;


		
			public abstract class Personen (String vorname, String nachname) {
				 private String vorname;
				 private String nachname;
				 private int Ausbildungsjahr;
				 private double Grundlohn;
				
			this.vorname = vorname;
			this.nachname = nachname;
			this.Ausbildungsjahr = Ausbildungsjahr;
			this.Grundlohn = Grundlohn;
			
			
			
			public int getAusbildungsjahr() {
				return Ausbildungsjahr;
				
		
	       
			
		}
			
			public int setAusbildungsjahr() (int Ausbildungsjahr){

				this.Ausbildungsjahr = Ausbildungsjahr;
				
			}
			
			
			public double getGrundlohn() {
				return Grundlohn;
				
		
	       
			
		}
			
			public double setGrundlohn() (int Grundlohn){

				this.Grundlohn = Grundlohn;
				
			}
			
			}