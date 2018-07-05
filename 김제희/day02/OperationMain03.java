package kr.co.mlec.day02;

import java.util.Random;

public class OperationMain03 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num = r.nextInt(10) + 1; // 1~10
		
		System.out.println("추출된정수: " + num);
		/*
		String msg =num % 2 ==0 ? "짝수":"홀수"; //삼항조건연산자 사용
		
		System.out.println(num + " : " + msg);//두 개 중에 하나만 고르는 코드
		
		System.out.println(num + " : " + (num % 2 ==0 ? "짝수":"홀수")); //같음
		
		//그러나 3가지라면 T:F중에 하나를 골라 그것을 두개로 나눈다
		//T:F를 - > expr? (expr'? T':F') : F
		*/
		System.out.println(num  == 0 ? "해당사항없음" : (num % 2 == 0 ? "짝수":"홀수"));
		
	}
}
