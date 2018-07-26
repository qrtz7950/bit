package board.v1.u4.ui;

import java.util.Scanner;

public class AddUI {
	private Scanner sc = new Scanner(System.in);
	public void execute() {
		String title  = scanStr("제목을 입력하세요 : ");
		String writer = scanStr("글쓴이를 입력하세요 : ");
		System.out.println("글 등록 메뉴 선택함\n");
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
