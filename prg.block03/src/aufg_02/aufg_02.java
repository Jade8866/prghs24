package aufg_02;

import java.util.Scanner;
public class aufg_02 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a Zahlen eingeben:		");
		int a = sc.nextInt();
		
		System.out.print("b Zahlen eingeben:		");
		int b = sc.nextInt();
		
	
		System.out.print("c Zahlen eingeben:		");
		int c = sc.nextInt();
		
	
		
		String bla = " ";
		
		if (a <= c) {
		
		bla = a+ "<= " + b + " <= " + c;
		}
		else if(a >= b ){
		bla = b+ ">=" + c + "<=" + a;
	
			
		}
		else {
		bla =  c + "<=" + b + "<=" + a;
		}
		
		System.out.print(" 'bla' ist, " + bla + "\n0" );
		sc.close();
		
		
		
	}
}	