package Aufg_4;
import java.util.Scanner;

public class Aufg_4 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean a = false , b = true , c = true , d = false , v = false ;
		int p = 9 , q = 10;
		// Ausdruck A
		
		d = ! b ;  
		// d =
		System.out.println("d ist, " + d);
		
		
		// Ausdruck B
		v = ! a || b && d || ! c && ! b ;
		// v =
		System.out.println("v ist beim Ausdruck B, " + v);
		
		// Ausdruck C
		v = a && b && ( p ++ < q ) ; // v = p = q =
		System.out.println("v ist beim Ausdruck C, " + v);
		
		// Ausdruck D
		v = a || b && ( p ++ < q ) ;
		System.out.println("v ist beim Ausdruck D, " + v);
		
	}
		
	}