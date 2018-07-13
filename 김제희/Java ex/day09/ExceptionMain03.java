package kr.co.mlec.day09;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {
		
		System.out.println("Main start.......");
		
//		for(int i = -2; i<4; i++) {
//		try {
//			System.out.println(10/i);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
		
//		try {
//			System.out.println(2 / 0);
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("Hello");
//		}
		//어쨋든 실행하는 finally 예제
		
		for(int i = -2; i < 4; i++) {
			try {
				System.out.println(10 / i);
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("예외발생...");
				break;
			} finally {
				System.out.println("반복문 수행중...");
			}
		}
		System.out.println("Main end.......");
		//예외가 발생하는 예제
	}
}
