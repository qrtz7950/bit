package kr.co.mlec.member.service;

import java.util.List;

import kr.co.mlec.member.dao.MemberDAO;
import kr.co.mlec.member.vo.MemberVO;

public class MemberService {

	private MemberDAO dao;

	public MemberService(MemberDAO dao) {
		this.dao = dao;
	}

	public List<MemberVO> selectAllMember(){
		return dao.selectAll();
	}
	
	public MemberVO member(MemberVO memberVO) {
		return dao.member(memberVO);
	}
}
