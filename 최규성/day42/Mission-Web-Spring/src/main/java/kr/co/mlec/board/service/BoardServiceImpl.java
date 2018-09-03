package kr.co.mlec.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDao;
	
	@Override
	public List<BoardVO> selectAllBoard() {
		List<BoardVO> boardList = boardDao.list();
		return boardList;
	}

	@Override
	public BoardVO selectByNo(int no) {
		BoardVO board = boardDao.detail(no);
		return board;
	}

	@Override
	public void insert(BoardVO board) {
		boardDao.insert(board);
	}

	
}
