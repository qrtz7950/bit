package day06Hw;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		StringUtil util = new StringUtil();
		Scanner ch = new Scanner(System.in);
		System.out.println("문자 입력: ");
		char ch1 = sc.nextLine().charAt(0);
		//1번
		boolean bool = util.isUpperChar(ch1);
		System.out.println(ch1 + "는 " +(bool ? "대문자입니다" : "소문자입니다"));
		//2번
		bool = util.isLowerChar(ch1);
		System.out.println(ch1 + "는 " +(bool ? "소문자입니다" : "대문자입니다"));
		//3 , 4번
		System.out.println("첫번쨰 정수: ");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.println("두번쨰 정수: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int max = util.max(num, num2);
		System.out.println(num +"," + num2 +"중 큰수: "+ max );
		int min = util.min(num, num2);
		System.out.println(num +"," + num2 +"중 작은수: "+ min );
		//5번
		System.out.println("문자열을 입력: ");
		String str = sc.nextLine();
		String revStr = util.reverseString(str);
		System.out.println("[" + str + "] reverse-> "+ revStr);
		
		String upperStr = util.toUpperString(str);
		System.out.println("[" +str+ "대문자 변경-> [" + upperStr + "]");
	
		String lowerStr = util.toLowerString(str);
		System.out.println("[" +str+ "소문자 변경-> [" + lowerStr + "]");
		
	
	}
}
