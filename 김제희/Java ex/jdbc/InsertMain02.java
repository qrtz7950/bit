package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 등록할 아이디입력 : hong
 * 등록할 이름을입력 : 기천기천
 * 
 * insert into t_test(id, name) values('hong','기천기천')
 */

public class InsertMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			//1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			stmt = conn.createStatement();
			
			String quo = "'";
			
			Scanner sc = new Scanner(System.in);
			System.out.print("id: ");
			String id = sc.nextLine();
			id = quo + id;
			id = id + quo;
			
			System.out.print("이름: ");
			String name = sc.nextLine();

			String sql = "insert into t_test(id, name) ";
			       sql += "values(" + id + ", '" + name + "')";

			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 행 삽입");
			
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
