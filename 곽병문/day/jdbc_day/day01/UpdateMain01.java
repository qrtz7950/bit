package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 *  아이디를 입력 : hong
 *  변경할 이름을 입력 : 길순길순
 *  
 *  id : hong ==> 이름 : 길동길동 -> 길순길순
 *  
 */

public class UpdateMain01 {

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
			String sql = "update t_test ";
				   sql += " set name = ? ";
				   sql += " where id = ? ";
		    pstm = conn.prepareStatement(sql);
		    System.out.print("아이디 입력 : ");
		    String id = s.nextLine();
		    System.out.print("변경할 이름 입력 : ");
		    String name = s.nextLine();
		    
		    pstm.setString(2, id);
		    pstm.setString(1, name);
		    
		    // 4단계
		    int cnt = pstm.executeUpdate();
		    System.out.println("총 " + cnt + "개 행이 수정되었습니다");
				   
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 5단계
			if(pstm != null) {
				try {
					pstm.close();
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
