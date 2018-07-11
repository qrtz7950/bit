package day06;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {

		String str = new String("ABCDEFGHIJ");
		
		int length = str.length();
		System.out.println("[" + str + "] 길이: " +length);
		
		for(int i = 0; i< str.length();i++) {
			System.out.println((i+0)+ "번째 문자: " + str.charAt(i));
		}
		
		
		char[] chars = new char[str.length()];
		System.out.println(Arrays.toString(chars));
		
		str.getChars(0, str.length(), chars, 0);
		//str.getChars(2, 7, chars, 0); //2번째 배열부터 7번째 배열까지 
		
		System.out.println(Arrays.toString(chars));
	}

}
