package kr.co.day50;

//import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cal c = new Cal();
		
		boolean bool = true;
		int yearSel =0, MonSel = 0;
		
		while (bool) {
			
		System.out.println("항목을 선택하세요 (1. 특정년도 날짜 보기  2. 특정월 날짜 보기  3. 종료) : ");
		int sel = sc.nextInt();
		sc.nextLine();	
		
		if(sel == 1 || sel ==2) {
			System.out.println("년도를 입력하세요: ");
			yearSel = sc.nextInt();
			sc.nextLine();
			if(sel == 1) {
				c.print(yearSel);
			} else {
				System.out.println("월을 입력하세요: ");
				MonSel = sc.nextInt();
				sc.nextLine();
				c.print(yearSel,MonSel);
			}
		} else if(sel == 3) {
			System.out.println("ㅂㅂ");
			bool = false;
		} else {
			System.out.println("다시 입력하세요");
		}
		}
	}
}