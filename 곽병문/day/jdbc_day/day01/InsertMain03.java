package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		Scanner s = new Scanner(System.in);
		
		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계
			System.out.print("등록할 아이디를 입력 : ");
			String id = s.nextLine();
			System.out.print("등록할 이름 입력 : ");
			String name = s.nextLine();
			
			String sql = "insert into t_test(id, name) ";
				   sql += " values(?, ?) ";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.setString(2, name);
			
			int cnt = pstm.executeUpdate();
			System.out.println("총 " + cnt + "개 행을 삽입하였습니다");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 5단계
			if(pstm!=null) {
				try {
					pstm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn!=null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		s.close();
	}

}
