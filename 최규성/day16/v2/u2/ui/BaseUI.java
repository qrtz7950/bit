package board.v2.u2.ui;

import java.util.Scanner;

import board.v2.u2.BoardServiceFactory;
import board.v2.u2.service.BoardService;

public abstract class BaseUI implements IBoardUI {
	private Scanner sc;
	protected BoardService service;
	
	public BaseUI () {
		sc      = new Scanner(System.in);
		service = BoardServiceFactory.getInstance();
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	protected int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
}