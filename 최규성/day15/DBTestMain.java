package day15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		
		try {
			//1단계: JDBC드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//2단계: 데이터베이스 접속
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr" ,"hr");
			
			System.out.println("데이터베이스 접속정보: " + conn);
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
