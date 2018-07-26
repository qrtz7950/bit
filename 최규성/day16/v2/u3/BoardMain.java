package board.v2.u3;

import board.v2.u3.ui.BoardUI;

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