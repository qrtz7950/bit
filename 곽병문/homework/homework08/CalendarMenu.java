package kr.co.mlec.homework.homework08;

import java.util.Scanner;

public class CalendarMenu {
	
	Scanner s = new Scanner(System.in);
	
	public int menu() {
		int sel = 0;
		System.out.print("항목을 선택하세요(1. 특정년도 날짜 보기   2. 특정월 날짜보기   3.종료) : ");
		while(true) {
			sel = Integer.parseInt(s.nextLine());
			if(sel>=1 && sel<=3) {
				break;
			}
			System.out.println("다시 입력하세요");
		}
		
		return sel;
	}
}
