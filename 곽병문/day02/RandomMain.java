package kr.co.mlec.day02;

import java.util.Random;

/*
 *  Random 클래스 : 임의의 정수를 추출하는 기능을 하는 클래스
 */

public class RandomMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num = r.nextInt();				// 임의의 정수를 추출하는 메소드
		System.out.println("임의의 정수 : " + num);
		
		// 0 ~ 9사이의 정수 추출
		num = r.nextInt(10);
		System.out.println("0 ~ 9 사이 : " + num);
		
		// 1~100사이의 정수 추출
		num = r.nextInt(100)+1;
		System.out.println("1 ~ 100 사이 : "+ num);
		
	}

}
