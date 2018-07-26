package board.v1.u4.ui;

import java.util.Scanner;

public class DeleteUI {
	private Scanner sc = new Scanner(System.in);
	public void execute() {
		int no = scanInt("삭제할 글번호를 입력하세요 : ");
		System.out.println("글삭제 메뉴 선택함\n");
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
