package kr.co.mlec.day01;

/*
 * <출력메소드>
 * 1. System.out.print()	: 개행문자X(enter)
 * 2. System.out.println()	: 개행문자O
 * 3. System.out.printf()	: 개행문자X, 변환문자(%c, %d, %x, %o, %f, %s...)
 * 										JDK1.5 이후
 * 
 * 문자, 정수, 실수, 문자열
 */

public class PrintMain {
	
	public static void main(String[] arg) {
		
		System.out.print("Hello");
		System.out.println("Hello");
		System.out.printf("Hello");
		String str = "olleH";
		int num = 123;
		System.out.printf("\n반대로 %s %do\n", str, num);
		System.out.println("반대로 " + str + " " + num + 'o');
		System.out.println('A'+'B');	// 문자 + 문자 = 유니코드(자바) 합
		System.out.println('A'+10); 	// 문자 + 숫자 = 유니코드  + 정수
		System.out.println('\u0041'); 	// 유니코드(16진수)
		
	}
}
