package prg.block01.pp_beispiele.seite33;

import java.util.Scanner;

public class EinfacheBerechung {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Geben Sie die 'min' Zahl ein: ");
		float min = sc.nextFloat();
		System.out.print("Geben Sie die 'max' Zahl ein: ");
		float max = sc.nextFloat();		
		sc.close();	
	
		
/*		
if - Statement und for-loops kommen erst später ...
Mit Pseudocode ist das aber möglich zu lösen!!


		if ( min>max ) {
			float temp = 0.0f;
			temp = min;
			min = max;
			max = temp;
		}
		
		
		float sum = 0;
		for (float i=min; i<=max; i++) {
			sum = sum+i;
		
		}
		
		

		System.out.println("Die Summe ergibt " + sum);
*/		
		System.out.println("Programm beendet!");
	}
}
	
