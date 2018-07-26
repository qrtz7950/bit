package board.v1.u4.ui;

import java.util.Scanner;

public class SearchOneUI {
	private Scanner sc = new Scanner(System.in);
	public void execute() {
		int no = scanInt("조회할 글번호를 입력하세요 : ");
		System.out.println("글번호 조회메뉴 선택함");
	}
	
	String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
}
