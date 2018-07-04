package kr.co.mlec.day02;
import java.util.Scanner;


public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
//		String str = sc.next();				// 공백문자(enter,tab,space)로 문자열 구분
											// 단어단위로 씀
		String str = sc.nextLine();			// enter로 문자열 구분
		System.out.println("str = " + str);
		
		System.out.print("문자 입력 : ");
		char c = sc.nextLine().charAt(0);
		System.out.println("c : " + c);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		System.out.println("n : " + n);
		
		System.out.print("실수 입력 : ");
		double d = sc.nextDouble();
		System.out.println("d : " + d);
		
		System.out.print("논리값 입력 : ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool : " + bool);
		
		sc.close();
	}

}
