package aufg_03;

import java.util.Scanner;
public class aufg_03 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("m is:		" );
		double m = sc.nextDouble();

		System.out.print("l is:		" );
		double l = sc.nextDouble();


		double BMI = sc.nextDouble();
		System.out.println("BMI is:		" );

		BMI = m/(Math.pow(l, 2.0));



		//System.out.print("Bodymass is:		" + BMI);

		if (BMI > 18.5) {
			System.out.println("untergewicht");

		}else if(BMI <= 25){
			System.out.println("normalgewicht");
		}else if(BMI < 30){
			System.out.println("uebergewicht");
		}else {
			System.out.println("Adipositas");	
		}
		sc.close();

	}
}	