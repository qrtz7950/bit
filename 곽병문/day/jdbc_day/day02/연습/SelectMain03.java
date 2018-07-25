package kr.co.mlec.jdbc.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.co.mlec.util.ConnectionFactory;
import kr.co.mlec.util.JDBCClose;

public class SelectMain03 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pst = null;
		Scanner s = new Scanner(System.in);
		StringBuilder sql = new StringBuilder();		// 일반적으로 StringBuilder를 사용  더 빠름!
		
		try {
			
			conn = ConnectionFactory.getConnection();
			
			System.out.print("검색할 아이디 입력 : ");
			String id = s.nextLine();
			
			sql.append("select id, name from t_test ");
			sql.append(" where id = ? ");
			
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.println("id : " + rs.getString(1) + ", name : " + rs.getString(2));
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pst);
		}
		
		s.close();
	}

}
