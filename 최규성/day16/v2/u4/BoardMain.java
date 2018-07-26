package board.v2.u4;

import board.v2.u4.ui.BoardUI;

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