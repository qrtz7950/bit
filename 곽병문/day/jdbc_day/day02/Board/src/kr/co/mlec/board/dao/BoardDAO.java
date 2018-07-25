package kr.co.mlec.board.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

/*
 	DAO : Data Access Object
 	
 	BoardDAO : 게시글들을 CRUD하기위한 클래스
 */

public class BoardDAO {

	private List<BoardVO> boardList;

	public BoardDAO() {
		boardList = new ArrayList<BoardVO>();
	}
	
	public void insertBoard(BoardVO board) {
		boardList.add(board);
		System.out.println("등록된 게시물 개수 : " + boardList.size() + "개");
	}
	
	// 전체게시글 목록을 호출자메소드에 전달
	public List<BoardVO> selectAllBoard() {
		return boardList;
	}
	
	/**
	 	글번호에 해당하는 게시물을 호출자에게 전달
	 */
	public BoardVO selectBoard(int no) {
		
		for(BoardVO board : boardList) {
			if(board.getNo() == no) {
				return board;
			}
		}
		
		return null;		
	}
	
	/**
	 * 호출자가 넘겨준 BoardVO의 객체의 no를 검색하여 title값으로 수정
	 */
//	public void updateBoard(int no, String title)
	public void updateBoard(BoardVO board) {

		/*
		for(BoardVO vo : boardList) {
			if(vo.getNo() == no) {
				vo.setTitle(title);
			}
		}
		*/
		
		for(BoardVO vo : boardList) {
			if(vo.getNo() == board.getNo()) {
				vo.setTitle(board.getTitle());
				return;
			}
		}
	}
	
	/**
	 *	호출자가 넘겨준 번호에 해당 게시물을 boardList에서 삭제
	 */
	public void deleteBoard(int no) {
		
		for(BoardVO board : boardList) {
			if(board.getNo() == no) {
				boardList.remove(board);
			}
		}
		
		/*
		for(int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).getNo() == no) {
				boardList.remove(i);
				return;
			}
		}
		*/
	}
}














