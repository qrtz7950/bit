package board.v2.u2.service;

import java.util.Date;

import board.v2.u2.BoardSequence;
import board.v2.u2.dao.BoardDAO;
import board.v2.u2.vo.BoardVO;

public class BoardService {
	
	private BoardDAO dao;
	public BoardService() {
		dao = new BoardDAO();
	}
	
	public void insertBoard(BoardVO board) throws Exception {
		board.setNo(BoardSequence.getNo());
		board.setRegDate(new Date());
		dao.insertBoard(board);
	}

	public void deleteBoard(BoardVO board) throws Exception {
		dao.deleteBoard(board);
	}
	
	public BoardVO selectOneBoard(BoardVO board) throws Exception {
		BoardVO result = dao.selectOneBoard(board);
		return result;
	}

	public BoardVO[] selectBoard() throws Exception {
		BoardVO[] list = dao.selectBoard();
		return list;
	}

	public void updateBoard(BoardVO board) throws Exception {
		dao.updateBoard(board);
	}
}
