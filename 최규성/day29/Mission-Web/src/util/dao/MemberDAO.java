package util.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionFactory;
import util.JDBCClose;
import util.vo.MemberVO;

public class MemberDAO {
	/*
	 * t_member테이블의 전체 게시글을 조회하는 기능
	 */
	public List<MemberVO> selectAll(){
		List<MemberVO> memberList = new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt =null;
		
		try {
		conn = ConnectionFactory.getConnection();

		StringBuilder sql = new StringBuilder();
		sql.append("select id, name, phone, addr, email, type ");
		sql.append("	from t_member ");
		
		
		pstmt = conn.prepareStatement(sql.toString());
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String addr = rs.getString("addr");
			String email = rs.getString("email");
			String type = rs.getString("type");
			
			MemberVO member = new MemberVO();
			member.setId(id);
			member.setName(name);
			member.setPhone(phone);
			member.setAddr(addr);
			member.setEmail(email);
			member.setType(type);
			
			memberList.add(member);
		}
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn,pstmt);
		}
		
		return memberList;
		
	}
}
