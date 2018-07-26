package board.v2.u1.ui;

import java.util.Scanner;

public abstract class BaseUI implements IBoardUI {
	private Scanner sc = new Scanner(System.in);
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	protected int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
}