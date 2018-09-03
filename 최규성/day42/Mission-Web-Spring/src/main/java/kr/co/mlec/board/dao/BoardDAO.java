package kr.co.mlec.board.dao;

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

public interface BoardDAO {
	/**
	 * 전체 게시글 조회서비스
	 */
	public List<BoardVO> list();
	
	/**
	 * 글번호에 해당하는 게시글 조회 서비스
	 */
	public BoardVO detail(int no);
	
	/**
	 * 새글 등록 서비스
	 */
	public void insert(BoardVO board);
}
