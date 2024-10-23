package prg.block01;
public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double guthaben =1000;
    double zinsSatz = 4.85 ;
    double guthabenmitZinsen;
    
    double ubergeben = 3;
    
    guthabenmitZinsen =  guthaben * (1 + zinsSatz / 100) ;
    System.out.println(guthabenmitZinsen);
    System.out.println(Aufgabe3.test(ubergeben));

	}

	static double test(double ubergeben){
		ubergeben=  ubergeben * 3;
		
		return ubergeben;
	}
}



//1. wert 50
//2. wert 80 100