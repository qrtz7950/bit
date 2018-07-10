package kr.co.Homework0710;

import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		StringUtil s = new StringUtil();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(s.isUpperChar(s.charGet()));
		System.out.println(s.isLowerChar(s.charGet()));
		
		System.out.println("숫자 두개를 입력해봅시다");
		
		int a = s.intGet();
		int b = s.intGet();
		
		System.out.println(s.max(a,b));
		System.out.println(s.min(a,b));
		
		System.out.println("뒤집을 문자열을 입력해봅시다");
		String str = new String();
		str =  sc.nextLine();
		System.out.println(new String(s.reverseString(str)));
		
		System.out.println("대문자로 변경할 문자를 입력해봅시다");
		String str2 = new String();
		str2 =  sc.nextLine();
		System.out.println(s.toUpperString(str2));
		
		System.out.println("소문자로 변경할 문자를 입력해봅시다");
		String str3 = new String();
		str3 =  sc.nextLine();
		System.out.println(s.toLowerString(str3));
	}

}
