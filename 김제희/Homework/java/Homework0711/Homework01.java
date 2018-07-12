package kr.co.Homework0711;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AreaMain s = new AreaMain(); 
		
		System.out.println("주어진 문자열에서 문자를 찾는 기능이 실행된다");
		System.out.println("문자열을 입력");
		String strData = sc.nextLine();
		System.out.println("문자를 입력");
		char ch = sc.nextLine().charAt(0);

		System.out.println(charUtil.checkChar(strData, ch));
		
		System.out.println("주어진 문자열에서 문자를 삭제하는 기능이 실행된다");
		System.out.println("문자열을 입력");
		strData = sc.nextLine();
		System.out.println("문자를 입력");
		ch = sc.nextLine().charAt(0);
		
		System.out.println(charUtil.removeChar(strData, ch));

	}

}
