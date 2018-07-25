package kr.co.mlec.jdbc.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.co.mlec.util.ConnectionFactory;
import kr.co.mlec.util.JDBCClose;

public class InsertMain04 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			
			conn = ConnectionFactory.getConnection();
			
			String sql = "insert into t_test(id, name) ";
				   sql += " values('choi', '큐송큐송') ";
				   
			pst = conn.prepareStatement(sql);
			
			int cnt = pst.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행을 삽입하였습니다");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pst);
		}
		
	}

}
