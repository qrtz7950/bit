package board.v1.u5;

import board.v1.u5.ui.BoardUI;

public class BoardMain {
	public static void main(String[] args) {
		BoardUI ui = new BoardUI();
		try {
			ui.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
