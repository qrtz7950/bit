package kr.co.mlec.board.service;

import java.util.List;
import kr.co.mlec.board.vo.BoardVO;
public interface BoardService {

	public List<BoardVO> selectAllBoard();
	public BoardVO selectByNo(int no);
	public void insert(BoardVO board);
	

}
