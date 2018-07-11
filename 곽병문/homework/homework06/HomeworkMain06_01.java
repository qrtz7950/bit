package kr.co.mlec.homework.homework06;

import java.util.Scanner;

public class HomeworkMain06_01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ControlString a = new ControlString();
		String str;
		char c;
		
		System.out.print("문자열 입력해보아라 : ");
		str = s.nextLine();		
		System.out.print("문자열에서 확인해볼 문자 입력해보아라 : ");
		c = s.nextLine().charAt(0);
		
		System.out.println("같은글자 " + a.checkChar(str, c) + "개");
		System.out.println("===============================");
		
		
		System.out.print("문자열 입력해보아라 : ");
		str = s.nextLine();		
		System.out.print("문자열에서 지울 문자를 입력해보아라 : ");
		c = s.nextLine().charAt(0);
		System.out.println(a.removeChar(str, c));
		System.out.println("===============================");
		
		s.close();
	}

}
