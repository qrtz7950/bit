package kr.co.mlec.day09;

import java.util.Scanner;

public class ExceptionMain06 {
	
	public static void main(String[] args) /* 간접의경우 입력throws Exception*/ {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("아이디를 입력해");
			System.out.println("아이디는 최소 4글자 이상이야 ㅇㅋ?");
			String id = sc.nextLine();
			
			if(id.length()<4) {
//				throw new Exception("4글자 이상이라니깐?");
				throw new CheckIDException("멍청아!");
				
			} else {
				System.out.println("아이디 등록됬음");
				System.out.println("니가 입력한 아이디: " + id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
