package day07;

import java.util.Arrays;

/*
 * 문자열 변환은 원본의 문자열은 건드리지않고 변환시킨 값만 리턴시켜 보여준다.
 */
public class StringMain05 {

	public static void main(String[] args) {

		String str = "Hello World";

		String sub = str.substring(3, 9); // [3]~[9-1]
		String sub2 = str.substring(3); // [3]~[마지막자리까지]

		System.out.println("sub: [" + sub + "]");
		System.out.println("sub2: [" + sub2 + "]");
		
		
		str = "Hello";
		//str => "Hello!!!!"로 변경
		//str = str + "!!!!"; //str과 느낌표 4개를 결합
		str = str.concat("!!!!");
		System.out.println(str);
		
		//문자열의 모든 l을 r로 변경
		str = "Hello World";
		str = str.replace('l', 'r');
		System.out.println(str);
		
		str =("          Hello World          ");
		System.out.println(str.length());
		
		str = str.trim();
		System.out.println(str.length()); // 공백을 trim으로 제거
		System.out.println(str);	//trim은 양옆의 공백만 제거함
		
		str = "Hello World";
		System.out.println(str.toUpperCase());	//모두 대문자
		System.out.println(str.toLowerCase());	//모두 소문자
		
		String phone = "010-1111-2222";
		String[] strArr = phone.split("-");	// - 을 기준으로 배열 생성
		System.out.println(Arrays.toString(strArr)); //배열의 정렬
		
		
		String ip = "192.168.1.12";
		String[] ipArr = ip.split("\\."); //. 을 기준으로 배열 생성
		System.out.println(Arrays.toString(ipArr)); //배열의 정렬
		
		int num = 123; //123 => "123"
//		String strNum = num + ""; //꼼수
		String strNum = String.valueOf(num); //문자열로 전환
		System.out.println(strNum);
		
		char[] chars = {'a', 'b', 'c', 'd'};
		String s = String.valueOf(chars);	//문자열로 전환
		System.out.println(s);
	}
}
