package prg.block07;

public class Kreis extends Figur{

	private int radius;

	public Kreis (int x, int y, int radius) {
		super(x,y);
		this.radius  = radius;

	}



//rechtsclick -source-gnerate getter und setters
	public int getRadius() {
		return radius;
	}




	public void setRadius(int radius) {
		this.radius = radius;
	}




	public double berechneumfang() {
		return 2*Math.PI*radius ;

	}


	public double berechneFlache() {
		return Math.pow(radius,2)*Math.PI;
	}
}