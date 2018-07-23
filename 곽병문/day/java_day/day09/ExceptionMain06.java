package kr.co.mlec.day09;

import java.util.Scanner;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 ID 입력ㅎ : ");
		String id = s.nextLine();
		try {
			if(id.length() < 5) {
				throw new CheckIDException("아이디는 최소 다섯글자 이상입니ㄷ");
			}
			else {
				System.out.println("ID를 등록하였습니ㄷ");
				System.out.println("ID : " + id);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
