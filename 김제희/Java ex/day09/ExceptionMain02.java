package kr.co.mlec.day09;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("Main start.......");
		
		Random r = new Random();
		int num = r.nextInt(2);
		System.out.println("num : " + num);
		System.out.println(1 / num);
		
		System.out.println("Main end.......");
		//예외가 발생하는 예제
	}
}
