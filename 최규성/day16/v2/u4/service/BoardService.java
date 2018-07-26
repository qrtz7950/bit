package board.v2.u4.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import board.v2.u4.BoardSequence;
import board.v2.u4.dao.BoardDAO;
import board.v2.u4.vo.BoardVO;

public class BoardService {
	
	private BoardDAO dao;
	public BoardService() {
		dao = new BoardDAO();
	}
	
	public void insertBoard(BoardVO board) throws Exception {
		board.setNo(BoardSequence.getNo());
		board.setRegDate(
			new SimpleDateFormat("yyyy-MM-dd").format(new Date())
		);
		dao.insertBoard(board);
	}

	public void deleteBoard(BoardVO board) throws Exception {
		dao.deleteBoard(board);
	}
	
	public BoardVO selectOneBoard(BoardVO board) throws Exception {
		return dao.selectOneBoard(board);
	}

	public ArrayList<BoardVO> selectBoard() throws Exception {
		return dao.selectBoard();
	}

	public void updateBoard(BoardVO board) throws Exception {
		dao.updateBoard(board);
	}
}
