package kr.co.mlec;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import kr.co.mlec.board.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/spring/spring-mvc.xml"})
public class DBTest {

	@Autowired
	private DataSource ds;
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Test
	public void DB접속테스트() throws Exception {
		
		Assert.assertNotNull(ds);
		Assert.assertNotNull(ds.getConnection());
		Assert.assertNotNull(sqlSessionTemplate);
		Assert.assertNotNull(null, ds);
		
		
		System.out.println(ds);
		Connection conn = ds.getConnection();
		System.out.println(sqlSessionTemplate);
	}
	
	@Test
	public void 전체게시글조회() throws Exception{
		List<BoardVO> list = sqlSessionTemplate.selectList("kr.co.mlec.board.dao.BoardDAO.selectAll");
		
		for(BoardVO board : list) {
			System.out.println(board);
		}
	}
	
}
