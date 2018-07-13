package day09;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {

		System.out.println("Main Start");
		
		Random r = new Random();
		int num = r.nextInt(2);

		System.out.println("num: "+ num);
		System.out.println(1 / num);
		
		System.out.println("Main End");
	}

}
