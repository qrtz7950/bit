package kr.co.mlec.day06;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {
		
		String str = new String("ABCDEFGHIJ");
		
		int length = str.length();
		System.out.println(length);
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(i + "번째  문자 : " + str.charAt(i));
		}
		
		char[] cs = new char[str.length()];
		str.getChars(1, 3, cs, 5);
		System.out.println(Arrays.toString(cs));
		
		str.getChars(0, str.length(), cs, 0);
		System.out.println(Arrays.toString(cs));
	}

}
