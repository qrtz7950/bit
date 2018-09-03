package kr.co.mlec;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/spring/*.xml"})
public class BoardTest {

	@Autowired
	private BoardDAO boardDao;
	@Autowired
	private BoardService boardService;
	
	@Test
	public void 전체게시글서비스() throws Exception{
		
	//	Assert.assertNotNull(boardDao);
		//dao테스트
	//	Assert.assertNotEquals(0, boardDao.list().size());
	
		//service 테스트
	//	Assert.assertNotNull(boardService);
		Assert.assertNotNull(boardService.selectAllBoard());
	}
}
