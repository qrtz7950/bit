package kr.co.mlec.day01;

/*
 * 기본자료형(8가지)[byte]
 * 	- 논리형 : boolean[1]
 * 	- 정수형 : byte[1], short[2], int[4], long[8]
 * 	- 실수형 : float[4], double[8]
 * 	- 문자형 : char[2]
 * 
 * 변수 사용하여 덧셈
 */
import java.util.Scanner;					// 입력용
import java.util.InputMismatchException;	// 예외처리용

public class VariableMain {

	public static void main(String[] args) {
		
		int a, b;
		System.out.println("*****더할 숫자 두개 입력*****");
		
		System.out.print("a = ");
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				a = scan.nextInt();
				break;
			}
			catch( InputMismatchException e) {
				scan = new Scanner(System.in);
				System.out.println("잘못입력, 다시");
				System.out.print("a = ");
			}
		}
		
		System.out.print("b = ");
		while(true) {
			try {
				b = scan.nextInt();
				break;
			}
			catch( InputMismatchException e) {
				scan = new Scanner(System.in);
				System.out.println("잘못입력, 다시");
				System.out.print("b = ");
			}
		}
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		
		String c, d;
		System.out.println("*****더할 글자 두개 입력*****");
		
		System.out.print("c = ");
		c = scan.next();
		
		System.out.print("d = ");
		d = scan.next();
		
		System.out.printf("%s + %s = %s", c, d, c+d);
		
		scan.close();
	}
}
