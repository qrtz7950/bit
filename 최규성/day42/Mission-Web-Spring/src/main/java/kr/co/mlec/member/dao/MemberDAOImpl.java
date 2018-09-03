package kr.co.mlec.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.member.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public MemberVO login(MemberVO loginVO) {
		MemberVO member = sqlSessionTemplate.selectOne("kr.co.mlec.member.dao.MemberDAO.login", loginVO);
		// TODO Auto-generated method stub
		return member;
	}

	
}
