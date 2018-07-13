package day08Hw;
import java.util.Random;

public class HwMain {

	public static void main(String[] args) {

		Random r = new Random();
		
		int n = r.nextInt(4) + 1;
		
		print(n);
	}

	
	public static void print(int n) {
		
		Calculate c = null;
		switch(n) {
			case 1:
				c = new CircleCalc();
				break;
			case 2:
				c = new TriangleCalc();
				break;
			case 3:
				c = new SquareCalc();
				break;
			case 4:
				c = new RectangleCalc();
				break;
		}
		c.calc();
	}
}
