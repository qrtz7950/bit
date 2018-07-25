package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계
			String sql = "select id, name as 이름 from t_test ";	// alias
			pst = conn.prepareStatement(sql);
			
			// 4단계
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);			// 컬럼이나 컬럼순서번호를 매개변수로
				String name = rs.getString("이름");		// alias 로 인해서
				System.out.println("id : " + id + ", name : " + name);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 5단계
			if(pst != null) {
				try {
					pst.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
