package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *  insert into t_test(id, name) valuse('hong','길동')
 * 
 */

public class InsertMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1단계 : JDBC 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계: Database 접속, 연결 객체 얻기
			
			String url		="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user		="hr";
			String password ="hr";
			conn = DriverManager.getConnection(url, user, password);
	
			System.out.println("Datebase Access info : " + conn);
			
			// 3단계 : SQL실행
			stmt = conn.createStatement();
			
			String sql = "insert into t_test(id, name) values('hong', '기천기천')";
			
			// 4단계 : 결과 얻기
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "행이 삽입되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			// 5단계 : 접속종료
			try {
				if (stmt != null) {
					stmt.close();
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
