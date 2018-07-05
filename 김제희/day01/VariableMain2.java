package kr.co.mlec.day01;

public class VariableMain2 {

	public static void main(String[] args) {
		
		int num = 10; 	// 정수 10을 저장하는 변수 num을 생성하였다
		
		// num값을 200으로 변경
		num = 200;
		
		//문자열 "hello"를 저장하는 변수 str을 생성해보자
		String str = "hello"; //참조자료형의 올바른 방식이 아니다		
		System.out.printf("str: %s\n", str);
		
		str = "world"; 
		System.out.printf("str: %s\n", str);
		
		/*
		 * 기본 자료형은
		 * 자료형 변수 = 상수;
		 * int num = 100;
		 * 
		 * 참조자료형은
		 * 참조자료형 변수  = new 참조자료형();
		 * String str = new String("hello"); 옳은 방법
		 * String str = "Hello"; 잘못된 방법
		 * 잘못된 방법으로 만드는 경우는 hello라는 값을 가리키는 포인터를 만들게되는것
		 * str은 hello를 가리키는 주소값을 가지고있다
		 * str=0x0001
		 * 0x0001에는 hello라는 데이터가 들어있음 
		 * 
		 * 기존 기본자료형을 만드는것은 공간할당->값대입
		 * 참조자료형은 자기 자신이 값을 가질 수 없고 그 값을 가리키는 주소값만을 가질수잇다
		 * 그니깐 이게 바로 자바형 포인터다
		 */
		
	}

}
