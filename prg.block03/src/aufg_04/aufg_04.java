package aufg_04;

import java.util.Scanner;
public class aufg_04{

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Bitte die Obergrenze eingeben: ");
	        int oberGrenze = sc.nextInt();

	        System.out.print("Bitte die Untergrenze eingeben: ");
	        int unterGrenze = sc.nextInt();

	        sc.close();

	        if (oberGrenze >= unterGrenze) {
	            for (int i = oberGrenze; i >= unterGrenze; i--) {
	                System.out.print(i + " ");
	            }
	            System.out.println(); // Eine leere Zeile für bessere Lesbarkeit hinzufügen
	        } else {
	            System.out.println("Die Obergrenze sollte größer oder gleich der Untergrenze sein.");
	        }
	    }
	}

		
	