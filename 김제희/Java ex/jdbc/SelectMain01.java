package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain01 {

	public static void main(String[] args) {
		
		Connection 	conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 
			String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user 	= "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			//3단계
			String sql ="select id, name as 이름 from t_test "; //앨리어스 
	        pstmt = conn.prepareStatement(sql);
	        
			//4단계
	        ResultSet rs = pstmt.executeQuery();
	        rs.next();
	        while(rs.next()) {
	        String id = rs.getString(1);
	        String name = rs.getString("이름"); //앨리어스 사용가능
	        System.out.println(id + " " + name);
	        }
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			// 5단계 : 접속종료
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
