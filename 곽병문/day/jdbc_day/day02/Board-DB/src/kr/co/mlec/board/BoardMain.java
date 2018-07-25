package kr.co.mlec.board;

import kr.co.mlec.board.ui.BoardUI;

/*
 * oracle¿¬µ¿
 */

public class BoardMain {

	public static void main(String[] args) {
		
		try {
			new BoardUI().execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}









