package day15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			// 3
			String sql = "select id, name from t_test ";
			pstmt = conn.prepareStatement(sql);

			// 4
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString("name");
				System.out.println("id : " + id + ", name: " + name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
