package kr.co.mlec.day06;

import java.util.Arrays;

public class StingMain02 {

	public static void main(String[] args) {

		String str = new String("ABCDEFGHIJ");
		
		int length = str.length();
		
		System.out.println("[" + str + "]" + " str의 길이: " + length);
		
		//문자열을 문자의 배열의 각 주소번지의 값을 출력
		
		for(int i = 0; i< str.length(); i++) {
			System.out.println(i + "번째 문자: " + str.charAt(i));
		}
		
		char [] chars = new char [str.length()];
		
		System.out.print(Arrays.toString(chars));
		//복사 하기 전 출력
		
		//str.getChars(0, str.length(), chars, 0); 	//전부 다 복사
		//str.getChars(2, 6, chars, 0); 			// 2번째부터 6번쨰까지 0번지부터 복사
		str.getChars(1, 5, chars, 4);
		
		//복사 후 출력
		System.out.println();
		System.out.print(Arrays.toString(chars));
		
		
		
	}

}
