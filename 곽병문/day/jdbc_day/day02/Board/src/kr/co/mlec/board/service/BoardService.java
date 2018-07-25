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
		
		// 등록할 게시글의 번호, 조회수, 등록일 설정
		board.setNo(boardNo++);
		board.setViewCnt(0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		board.setRegDate(sdf.format(new Date()));
		
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













