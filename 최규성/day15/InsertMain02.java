package day15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 등록할 ID를 입력하세요: hong
 * 등록할 이름을 입력하세요: 홍길동
 * 
 * insert into t_test(id,name) values('hong','홍길동')
 */

public class InsertMain02 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		try {
			// 1단계 : JDBC드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdcb드라이버 로딩");

			// 2단계: 데이터베이스 접속후 연결객체 얻기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn:" + conn);

			// 3단계: SQL실행
			stmt = conn.createStatement();

			Scanner sc = new Scanner(System.in);
			System.out.println("ID입력: ");
			String id = sc.nextLine();
			
			System.out.println("이름입력: ");
			String name = sc.nextLine();
			String sql = "insert into t_test(id,name) values(\' "+id+" \' , \' "+name+" \')";
//			String sql =  "insert into t_test(id,name) ";
//				   sql += "values('aaa','bbb') ";
			
			// 4단계: 결과를 얻음
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총" + cnt + "행이 삽입되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계: DB접속 끊기
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch(Exception e){
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
