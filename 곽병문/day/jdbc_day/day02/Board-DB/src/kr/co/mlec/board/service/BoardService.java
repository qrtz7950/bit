package kr.co.mlec.board.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class BoardService {
	
	private int boardNo = 1;
	
	private BoardDAO dao;
	
	public BoardService() {
		dao = new BoardDAO();
	}

	public void insertBoard(BoardVO board) {

		dao.insertBoard(board);
	}
	
	public List<BoardVO> selectAllBoard() {
		List<BoardVO> boardList = dao.selectAllBoard();
		return boardList;
	}
	
	public BoardVO selectBoard(int no) {
		BoardVO board = dao.selectBoard(no);
		return board;
	}
	
	public void updateBoard(BoardVO board) {
		dao.updateBoard(board);
	}
	
	public void deleteBoard(int no) {
		dao.deleteBoard(no);
	}
}













