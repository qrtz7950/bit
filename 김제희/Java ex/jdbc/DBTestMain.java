package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		
		try {
			// 1단계 : JDBC 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계: Database 접속
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
			
			System.out.println("Datebase Access info : " + conn);
			
			// 3단계 : 실행 객체 얻기 및 실행
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
