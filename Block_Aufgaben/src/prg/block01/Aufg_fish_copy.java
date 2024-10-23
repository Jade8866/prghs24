/*package prg.block01;

import java.util.Scanner;



	
		// TODO Auto-generated method stub
		


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				 Scanner sc = new Scanner(System.in);
			     int i = sc.nextInt();
			     
			      
			      Scanner sc = new Scanner(new File("aufg_fish_copy"));
			      
			      
			      while (sc.hasNextLong()) {
			          long aLong = sc.nextLong();
			          sc.close();
			      }
			      
				  String input = "1 fish 2 fish red fish blue fish";
				     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
				     System.out.println(s.nextInt());
				     System.out.println(s.nextInt());
				     System.out.println(s.next());
				     System.out.println(s.next());
				     s.close();
				 
}
*/
package prg.block01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufg_fish_copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();

        try {
            Scanner fileScanner = new Scanner(new File("aufg_fish_copy"));
            while (fileScanner.hasNextLong()) {
                long aLong = fileScanner.nextLong();
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: aufg_fish_copy");
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
