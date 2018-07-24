package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * 아이디를 입력: hong
 * 변경할 이름을 입력 : 홍길순
 * 
 * id : hong ===> 이름 : 홍길동 -> 홍길순
 */ 

public class UpdateMain01 {

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
			String sql ="update t_test ";
			       sql +="set name = ? ";
			       sql +="where id = ? ";
		   	Scanner sc = new Scanner(System.in);
			System.out.print("id: ");
			String id = sc.nextLine();
			System.out.print("변경할이름: ");
			String name = sc.nextLine();

	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, name);
	        pstmt.setString(2, id);
	        
			//4단계
	        int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 삽입");
			
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
