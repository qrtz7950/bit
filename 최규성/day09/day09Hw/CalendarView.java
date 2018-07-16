package day09Hw;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);

	private int getInput(String msg) {	//같은 자바파일에서만 쓰이기때문에 굳이 public을 사용할 필요없다.
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public void process() {
		CalendarUtil util = new CalendarUtil();
		int year = 0;
/*loop : */while (true) {
			int choice = getInput("항목을 선택하세요(1.특정년도  2.특정월  3.종료) => ");
			switch (choice) {
			case 1:
				year = getInput("특정년도를 입력하세요");
				util.showDayByYear(year);
				break;
			case 2:
				year = getInput("특정년도를 입력하세요:");
				int month = getInput("특정월을 입력하세요:");
				util.showDayByMonth(year,month);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				//break loop;	// 프로그램이 끝나야하기 때문에 while을 나갈수있게 할수있다.
				System.exit(0);	// 아니면 프로그램을 종료하는 메소드를 사용할수있다
				break;
			}
		}
	}
}
