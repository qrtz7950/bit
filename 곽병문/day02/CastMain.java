package kr.co.mlec.day02;

/*
 * 형변환
 * =(대입연산자)를 기준으로 좌우의 자료형의 타입이 서로 다를때 발생
 * 
 * byte < short < int < long < float < double
 * 
 * 종류
 * 1.묵시적형변환
 * 		double = int;
 * 		long = byte;
 * 2.강제적형변환
 */

public class CastMain {

	public static void main(String[] args) {
		
		double d;
		
		d = /*(double)*/10;		// 묵시적형변환	double = (double)int
		System.out.println("d : " + d);
		
		int num;
		
		num = (int)12.34;	// 강제적형변환	int = double
		
		System.out.println("num : " + num);
		
		System.out.println(10.0 / 3.0);
		System.out.println((int)10.0 / (int)3.0);
		System.out.println((int)(10.0 / 3.0));
		
		

	}

}
