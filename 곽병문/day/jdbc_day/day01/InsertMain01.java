package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 	insert into t_test(id, name) values('hong', '길동길동')
 */

public class InsertMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stm = null;
		
		try {
			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc드라이버 로딩 성공");
			
			// 2단계 : DB접속 후 연결객체 얻기
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
			
			// 3단계 : SQL실행
			stm = conn.createStatement();
			
			String sql = "insert into t_test(id, name) values('hong', '길동길동')";
			
			// 4단계 : 결과를 얻어옴
			int cnt = stm.executeUpdate(sql);
			System.out.println(cnt + "행이 삽입되었습니다");
					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 5단계 : DB접속 종료
			if(stm != null) {
				try {
					stm.close();
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
