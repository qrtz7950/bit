package kr.co.mlec.board.service;

import java.util.List;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class BoardService {
	
	private BoardDAO dao;

	public BoardService(BoardDAO dao) {
		this.dao = dao;	
	}
	
	public List<BoardVO> selectAllBoard(){
		return dao.selectAll();
	}
	
}
