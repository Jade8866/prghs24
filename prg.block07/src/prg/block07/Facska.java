package prg.block07;
import java.util.Scanner;

public class Facska {

	public abstract class Quader implements Skalierbar{
		

       
	       private int x;
	        private int y;

	        // Constructor
	        public Quader(int x, int y) {
	            this.x = x;
	            this.y = y;
	        }

	        // Getter and Setter methods for x and y
	        public int getx() {
	            return x;
	        }

	        public void setx(int x) {
	            this.x = x;
	        }

	        public int gety() {
	            return y;
	        }

	        public void sety(int y) {
	            this.y = y;
	        }


          

		
     
    @Override
    public void skaliere(double faktor) {
        this.x *= faktor;
        this.y *= faktor;
    }
        
        public static void main(String[] args){
            
            Scanner scanner = new Scanner(System.in);

          
            double faktor = scanner.nextInt();
            
            System.out.print("quader extends auf factor:  ");



        Quader quader = new Quader(10, 5);

        // Call the skaliere method with the entered factor
        quader.skaliere(faktor);

        // Output the scaled values
        System.out.println("Quader after scaling: x = " + quader.getx() + ", y = " + quader.gety());
}
	}
}