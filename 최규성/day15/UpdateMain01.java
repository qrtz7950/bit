package day15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * 아이디를입력: hong
 * 변경할 이름을 입력: 홍길순
 * 
 * id : hong ===> 이름 : 홍길동 -> 홍길순
 */
public class UpdateMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			//3
			String sql = "update t_test ";
					sql+= "set name = ? ";
					sql+= "where id = ? ";
					
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ID입력:");
			String id = sc.nextLine();
			
			System.out.print("변경할 이름 입력:");
			String name = sc.nextLine();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			//4
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"개 행이 수정되었습니다.");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//5
			if(conn != null) {
				try {
					conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
