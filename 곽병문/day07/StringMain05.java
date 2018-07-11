package kr.co.mlec.day07;

import java.util.Arrays;

public class StringMain05 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		//String sub = str.substring(3, 9);
		String sub = str.substring(3);
		
		System.out.println(str);
		System.out.println(sub);
		
		str = "Hello";
		// str=>"Hello!!!!" 변경		
		str = str.concat("!!!!");
		System.out.println(str);
		
		str = "Hello World";
		str = str.replace('l', 'r');
		System.out.println(str);
		
		str = "         Hello         ";
		System.out.println(str.length());
		str = str.trim();
		System.out.println(str);
		
		str = "    h     Hello   h      ";
		System.out.println(str.length());
		str = str.trim();
		System.out.println(str);
		
		str = "Hello World";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		str = "010-0101-0101";
		String[] strArr = str.split("-");
		System.out.println(Arrays.toString(strArr));
		
		str = "192.168.1.12";
		String[] arr = str.split("\\.");
		System.out.println(Arrays.toString(arr));
		
		int num = 123;
		// 123 => "123"변환
		str = String.valueOf(num);
		System.out.println(str);
		
	}

}
