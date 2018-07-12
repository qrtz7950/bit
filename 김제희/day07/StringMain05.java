package kr.co.mlec.day07;

import java.util.Arrays;

public class StringMain05 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		//문자열을 원하는 만큼만 출력하는 메소드
		String sub = str.substring(3,9); // [3] ~ [9-1]
		String sub2 = str.substring(3); // 맨마지막까지
		//해당 메소드도 오버로딩을 지원한다
		
		System.out.println(sub);
		System.out.println(sub2);
		
		//문자열을 더하는 메소드
		str = "Hello";
		str = str + "!!!!";
		System.out.println(str);
		//메소드를 이용해 간단히 구현가능
		str=str.concat("!!!!");
		System.out.println(str);
		
		//문자나 문자열을 치환하는 메소드
		str = "Hello World";
		System.out.println(str);
		str = str.replace('l', 'r');
		str = str.replace("l", "rr");
		System.out.println(str);
		
		//공백을 없에는 메소드
		//좌우만 없에고 중간의 공백은 지우지 않는다
		str = "      Hello      ";
		System.out.println("[" + str + "] 길이 : " + str.length());
		
		str = str.trim();
		System.out.println("trim() 후 [" + str + "] 길이 : " + str.length());
		
		//대소문자 변경 메소드
		str = "Hello World";
		System.out.println("대문자 변경 : " + str.toUpperCase());
		System.out.println("소문자 변경 : " + str.toLowerCase());
		
		//문자열 쪼개기 메소드
		
		String phone = "010-1111-2222";
		
		String[] strArr = phone.split("-");
		System.out.println("split() arr : " + Arrays.toString(strArr));
		
		String ip = "192.168.1.12";
		String[] arr = ip.split("\\."); // 역슬래쉬를 입력하기위해 역슬래쉬 두번 점을 입력하기위해 \.형으로 입력
		System.out.println("arr : " + Arrays.toString(arr));
		
		//숫자를 문자열 타입으로  문자열을 숫자로 바꾸고 싶을때 쓰는 메소드
		int num = 123;
		//123 => "123" 변환
		//String strNum = num + "";
		String strNum = String.valueOf(num);
		
		char[] chars = {'A','B','C','D','E','F','G'};
		str = String.valueOf(chars);
		System.out.println(str);
		
		
	}
}






