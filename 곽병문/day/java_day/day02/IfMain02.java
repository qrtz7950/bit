package kr.co.mlec.day02;

import java.util.Scanner;

public class IfMain02 {

	public static void main(String[] args) {
		
		System.out.print("학교가 강남가? : ");
		Scanner s = new Scanner(System.in);
		String where = s.nextLine();
		System.out.println(where);
		
		if(where.equals("학교")) {
			System.out.println("제희: 시무룩");
		}else {
			System.out.println("규성: 시무룩");
		}
		
		s.close();
	}

}
