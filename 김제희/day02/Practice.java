package kr.co.mlec.day02;

import java.util.Random;

public class Practice {
	public static void main(String[] args) {
		int a = 12425;
		double b;
		b=a;
		System.out.println("형변환: " + b);
		//강제형변환
		a=(int)b;
		System.out.println("형변환: " + a);
		
		final int c = 2;
		//c=3; 수정안됨
		
		Random r = new Random();

		int num = r.nextInt(10) + 1; //1~11사이의 값
		System.out.println(num);
				
	}
}
