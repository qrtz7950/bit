package kr.co.mlec.board.ui;

import java.util.Scanner;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.service.BoardServiceFactory;

public abstract class BaseUI implements IBoardUI {
	
	private Scanner sc;
	protected BoardService service;

	public BaseUI() {
		sc = new Scanner(System.in);
		service = BoardServiceFactory.getInstance();
	}

	protected int scanInt(String msg) {
		System.out.print(msg);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}

	
}










