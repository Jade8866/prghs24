package prg.block07;

public class Quader extends Figur{

	

	public Quader (int x, int y) {
		super(x,y);
		

	}



//rechtsclick -source-gnerate getter und setters



public double berechneumfang() {
	return 2*(x+y) ;
	
}


public double berechneFlache() {
	return (x*y);
}
