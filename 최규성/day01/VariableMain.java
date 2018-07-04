package kr.co.mlec;

// 기본자료형 8가지-> 논리형(boolean1) 정수형(byte1 short2 int4 long8) 실수형(float4 double8) 문자형(char) 
public class VariableMain {

	public static void main(String[] args) {
		
		char c; //변수의 선언부
		c = 'A'; //변수의 대입부 or 치환부
		System.out.println("문자: "+ c);
		System.out.printf("문자: %c", c);
		
		int num;
		num =123;
		System.out.println("\n정수: " + num);
		
		double d;
		d= 12.345;
		System.out.println("실수: "+d);
		System.out.printf("실수: %f\n",d);
		
		boolean bool1;
		boolean bool2;
		bool1 = true;
		bool2 = false;
		System.out.println("논리값: " + bool1);
		System.out.printf("논리값: %b\n", bool2);
		
		char ch = 'Z'; //변수의 초기화(선언과 대입을 동시에)
		System.out.println(ch);
		ch = '\u0077'; //ch값 교체
		System.out.println(ch);
		
		int num2 = 0;
		System.out.println(num2);
	}

}