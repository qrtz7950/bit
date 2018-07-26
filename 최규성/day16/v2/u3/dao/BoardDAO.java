package board.v2.u3.dao;

import java.util.ArrayList;

import board.v2.u3.vo.BoardVO;

public class BoardDAO {
	
	// 게시물 저장 공간
	private ArrayList<BoardVO> boardList = new ArrayList<>();
	
	/**
	 * 전체 게시글을 조회하는 기능 
	 */
	public ArrayList<BoardVO> selectBoard() {
		return boardList;
	}
	
	/**
	 * 게시글 번호에 해당하는 글을 조회하는 기능
	 */
	public BoardVO selectOneBoard(BoardVO board) {
		for (BoardVO vo : boardList) {
			if (vo.getNo() == board.getNo()) {
				return vo;	
			}
		}
		return null;
	}
	
	/**
	 * 게시글을 등록하는 기능
	 */
	public void insertBoard(BoardVO board) {
		boardList.add(board);
	}
	
	/**
	 * 게시글 수정 기능
	 */
	public void updateBoard(BoardVO board) {
		if (boardList == null) return ;
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				vo.setTitle(board.getTitle());
				break;
			}
		}
	}
	
	/**
	 * 게시글 삭제 기능
	 */
	public void deleteBoard(BoardVO board) {
		if (boardList.isEmpty()) return ;
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				boardList.remove(vo);
				break;
			}
		}
	}
}
