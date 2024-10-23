package prg.block01;
import java.util.Scanner ;


public class Aufg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double guthaben ;
		//double zinsSatz = 3.14;
		double guthabenMitZinsen ;
		

		float neuzinsSatz = (float) 3.14;
		Scanner sc = new Scanner(System.in);
		
		guthaben = sc.nextFloat();
	    sc.close();
	    
		//guthabenMitZinsen = guthaben * (1 + zinsSatz / 100) ;
		
	    guthabenMitZinsen = guthaben * (1 + neuzinsSatz / 100) ;
		
		
		System.out.println("ftest: ");
		
		
		
		//neuzinsSatz = neuzinsSatz*3;
		
		
		//System.out.println(neuezinsSatz);
		System.out.println (" Guthaben nach einem Jahr : " + Math.round(guthabenMitZinsen)) ;
		
	}

}
