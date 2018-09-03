package kr.co.mlec.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.board.vo.BoardVO;

/**
 * ORACLE DB에서 구현하는 게시글 관련 클래스
 * @author bit
 *
 */
@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<BoardVO> list() {
		// TODO Auto-generated method stub
	
		List<BoardVO> list = sqlSessionTemplate.selectList("kr.co.mlec.board.dao.BoardDAO.selectAll");
		return list;
	}

	@Override
	public BoardVO detail(int no) {
		// TODO Auto-generated method stub
		
		BoardVO board = sqlSessionTemplate.selectOne("kr.co.mlec.boaard.dao.BoardDAO.selectByNo" , no);
		return board;
	}

	@Override
	public void insert(BoardVO board) {
		// TODO Auto-generated method stub
		
		sqlSessionTemplate.insert("kr.co.mlec.board.dao.BoardDAO.insert", board);
		//sqlSessionTemplate.commit();
		
	}

	
}
