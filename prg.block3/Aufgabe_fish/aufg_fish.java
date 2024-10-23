package Aufgabe_fish;

import java.util.Scanner;

import prg.block01.aufg3.File;

public class aufg_fish {

	
		// TODO Auto-generated method stub
		

		

		

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				 Scanner sc = new Scanner(System.in);
			     int i = sc.nextInt();
			     
			      Scanner sc = new Scanner(new File("aufg4"));
			      while (sc.hasNextLong()) {
			          long aLong = sc.nextLong();
			      }
				  String input = "1 fish 2 fish red fish blue fish";
				     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
				     System.out.println(s.nextInt());
				     System.out.println(s.nextInt());
				     System.out.println(s.next());
				     System.out.println(s.next());
				     s.close();
				 

			

		
	}

}
