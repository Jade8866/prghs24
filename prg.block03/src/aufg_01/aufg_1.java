package aufg_01;
import java.text.DecimalFormat;
import java.util.Scanner;
public class aufg_1 {
	
	

		public static void main(String[] args) {

			//int loanAmount;    // Variable 'nur' deklarieren (bekanntmachen)
			Scanner sc = new Scanner(System.in);
			
			  // Variable deklarieren + initialisieren
			
			System.out.print("Der 'loanAmount' ist:   ");
			double loanAmount = sc.nextDouble();
			
			
			
			 // neuer Wert ZUWEISEN (von rechts nach links!)
			
			System.out.print("Der Laufzeit ist jetzt: 	 " );
			double laufzeit = sc.nextDouble(); 
			
			
			//System.out.print("Zinssatz in Prozent geben:   ");		
			//double yearRate = sc.nextDouble();
			double yearRate = 0;
			double endKapital = 0;
			//
			
			 //double endKapital = (loanAmount)* (Math.pow(1+ yearRate/100, laufzeit));
					//(Math.pow(1 + yearRate,laufzeit)*1);
			
			
			
			 DecimalFormat currencyFormat = new DecimalFormat("CHF #,###.00");
					
			
            
			
			if(endKapital < 1000) {
				//yearRate = (loanAmount)* (Math.pow(1+ 0.75/100, laufzeit)); ;
				yearRate = 0.75;
				
			
			}

				else if(endKapital > 1000) {
					//yearRate = (loanAmount)* (Math.pow(1+ 0.25/100, laufzeit)); ;
			
					yearRate = 0.25;
					
				}
			endKapital = (loanAmount)* (Math.pow(1+ yearRate/100, laufzeit));
				//(Math.pow(1 + yearRate,laufzeit)*1);
			System.out.println("Die jaehrliche Zahlung ist." + currencyFormat.format(endKapital));	
		}
		
	

}
