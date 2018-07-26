package board.v2.u2.dao;

import board.v2.u2.vo.BoardVO;

public class BoardDAO {
	
	// 게시물 저장 공간
	private BoardVO [] boardList = new BoardVO[10];
	private int inputPos = 0;
	
	/**
	 * 전체 게시글을 조회하는 기능 
	 */
	public BoardVO [] selectBoard() {
		BoardVO [] boardList = new BoardVO[inputPos];
		System.arraycopy(this.boardList, 0, boardList, 0, inputPos);
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
	
	private void increase(int length) {
		BoardVO [] copy = new BoardVO[length];
		System.arraycopy(boardList, 0, copy, 0, boardList.length);
		boardList = copy;
	}
	
	/**
	 * 게시글을 등록하는 기능
	 */
	public void insertBoard(BoardVO board) {
		if (inputPos == boardList.length) {
			increase(boardList.length * 2);
		}
		boardList[inputPos++] = board;
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
		int index = 0;
		if (boardList == null) return ;
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				remove(index);
				break;
			}
			index++;
		}
	}
	
	/**
	 *  게시글 삭제된 부분 이동하기
	 */
	private void remove(int index) {
        int numMoved = inputPos - index - 1;
        if (numMoved > 0)
            System.arraycopy(boardList, index+1, boardList, index, numMoved);
        boardList[--inputPos] = null;
	}
	
}
