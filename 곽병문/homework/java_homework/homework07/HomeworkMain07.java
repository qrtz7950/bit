package kr.co.mlec.homework.homework07;

import java.util.Random;

public class HomeworkMain07 {

	public static void print(int n) {
		
		Calc c = null;
		switch(n) {
			case 1 :
				c = new Square();
				break;
			case 2 :
				c = new Rectangle();
				break;
			case 3 :
				c = new Triangle();
				break;
			default :
				c= new Circle();
		}
		
		c.calc();
	}
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int n = r.nextInt(4) + 1;
		
		print(n);
		

	}

}
