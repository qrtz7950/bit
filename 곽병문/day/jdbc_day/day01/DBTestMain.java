package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		
		try {
			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계 : Database 접속
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
																			// localhost = 127.0.0.1
			System.out.println("데이터베이스 접속정보 : " + conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
