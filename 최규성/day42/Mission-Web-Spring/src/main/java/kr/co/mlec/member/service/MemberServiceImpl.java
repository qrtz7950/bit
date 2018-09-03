package kr.co.mlec.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.member.dao.MemberDAO;
import kr.co.mlec.member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDao;
	
	@Override
	public MemberVO login(MemberVO loginVO) {
		// TODO Auto-generated method stub
		MemberVO member = memberDao.login(loginVO);
		return null;
	}

}
