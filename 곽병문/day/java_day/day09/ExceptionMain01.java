package kr.co.mlec.day09;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {

		Random r = new Random();
		int n = r.nextInt(2);
		System.out.println("num : " + n);
		try {
			System.out.println(1/n);
		} catch(Exception e) {
			System.out.println("0으로 나누다니");
		} finally {
			System.out.println("너무해");
		}

	}

}
