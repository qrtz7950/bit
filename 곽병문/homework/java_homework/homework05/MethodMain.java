package kr.co.mlec.homework.homework05;

import java.util.Scanner;

/*
 *  하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 isUpperChar(char c) 메소드 작성
 *  하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메소드 작성
 *  두개의 숫자를 입력받아 큰수를 반환하는 max(int i, int j) 메소드 작성
 *  두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드 작성
 *  문자열을 입력받아 거꾸로 변경하는 reverseString(String str) 메소드 작성
 *  문자열을 입력받아 대문자로 변경하는 toUpperString(String str) 메소드 작성
 *  문자열을 입력받아 소문자로 변경하는 toLowerString(String str) 메소드 작성
 */

public class MethodMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		StringUtil a = new StringUtil();
		
		// 대문자, 소문자
		System.out.print("하나의 문자를 입력 : ");
		char c = s.nextLine().charAt(0);
		
		System.out.println(c + "는 대문자 : " + a.isUpperChar(c));
		System.out.println(c + "는 소문자 : " + a.isLowerChar(c));
		System.out.println("====================================================");
		
//----------------------------------------------------------------------------------
		// 큰수, 작은수
		System.out.println("< 두개의 숫자 입력 >");
		System.out.print("n1 = ");
		int n1 = Integer.parseInt(s.nextLine());
		System.out.print("n2 = ");
		int n2 = Integer.parseInt(s.nextLine());
		
		System.out.println("큰수 : " + a.max(n1, n2));
		System.out.println("작은수 : " + a.min(n1, n2));
		System.out.println("====================================================");
		
//----------------------------------------------------------------------------------
		// 문자열 거꾸로 변경
		String str = new String();
		System.out.print("문자열 입력 : ");
		str = s.nextLine();
		System.out.println("거꾸로 : " + a.reverseString(str));
		System.out.println("====================================================");
		
//----------------------------------------------------------------------------------
		// 문자열을 입력받아 대문자로 변경
		System.out.print("문자열 입력 : ");
		str = s.nextLine();
		System.out.println(a.toUpperString(str));
		System.out.println("====================================================");
		
//----------------------------------------------------------------------------------
		// 문자열을 입력받아 소문자로 변경
		System.out.print("문자열 입력 : ");
		str = s.nextLine();
		System.out.println(a.toLowerString(str));
		
		s.close();
	}

}
