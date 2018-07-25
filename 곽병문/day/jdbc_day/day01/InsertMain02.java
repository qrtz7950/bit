package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 	등록할 아이디 입력 : hong
 *  등록할 이름을 입력 : 길동길동
 *  
 *  insert into t_test(id,name) values('hong','길똥길똥')
 */

public class InsertMain02 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stm = null;
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
			stm = conn.createStatement();
			
			System.out.print("등록할 아이디를 입력 : ");
			String id = s.nextLine();
			System.out.print("등록할 이름 입력 : ");
			String name = s.nextLine();
			
			String sql = "insert into t_test(id, name) ";
				   sql += "values (\'" + id + "\', \'" + name +"\') ";
				   
		// 4단계
			int cnt = stm.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행을 삽입했습니다");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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
		s.close();
	}
	
}
