package kr.co.mlec.board.service;

public class BoardServiceFactory {

	private static final BoardService instance = new BoardService();
	
	public static BoardService getInstance() {
		return instance;
	}
}
