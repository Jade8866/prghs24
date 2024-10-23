package Aufg_1;

import java.text.DecimalFormat;
public class Aufg_1 {
	
	

		public static void main(String[] args) {

			//int loanAmount;    // Variable 'nur' deklarieren (bekanntmachen)
			
			int loanAmount = 23859;  // Variable deklarieren + initialisieren
			
			System.out.println("Der 'loanAmount' ist: " + loanAmount);
			
			int Monate =36;
			
			int laufzeit = Monate/12;  // neuer Wert ZUWEISEN (von rechts nach links!)
			
			System.out.println("Der 'laufzeit' ist jetzt: "  +laufzeit);
			
			
			
			double closingCosts = 259.00;
			
			
			
			double yearRate = 0.0485;
			
			//
			
			double monthlyPay = (loanAmount+ closingCosts)* (Math.pow(1+ yearRate, laufzeit))/36;
					//(Math.pow(1 + yearRate,laufzeit)*1);
			
			double totalCost = monthlyPay*36;
			
					
			DecimalFormat currencyFormat = new DecimalFormat("CHF #,###.00");
			
			System.out.println("Die jaehrliche Zahlung ist." + currencyFormat.format(monthlyPay));
			System.out.println("Total Cost of the Loan: " + currencyFormat.format(totalCost));
	
		}
		
	

}
