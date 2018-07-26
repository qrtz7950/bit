package board.v2.u1.service;

import java.util.ArrayList;

import board.v2.u1.vo.BoardVO;

public class BoardService {
	public void insertBoard(BoardVO board) throws Exception {
		System.out.println("게시글을 등록하는 서비스 메서드 호출...");
	}

	public void deleteBoard(BoardVO board) throws Exception {
		System.out.println("게시글을 삭제하는 서비스 메서드 호출..");
	}
	
	public BoardVO selectOneBoard(BoardVO board) throws Exception {
		BoardVO result = new BoardVO();
		System.out.println("게시글 상세 내용을 조회하는 서비스 메서드 호출..");
		return result;
	}

	public ArrayList<BoardVO> selectBoard() throws Exception {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		System.out.println("게시글 전체 내용을 조회하는 서비스 메서드 호출..");
		return list;
	}

	public void updateBoard(BoardVO board) throws Exception {
		System.out.println("게시글 내용을 수정하는 서비스 메서드 호출..");
	}
}
