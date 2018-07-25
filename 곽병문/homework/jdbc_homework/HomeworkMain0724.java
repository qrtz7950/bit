package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HomeworkMain0724 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select '[' || j.job_title || ']', avg(e.salary) ";
				   sql += " from employees e inner join jobs j ";
				   sql += "   on e.job_id = j.job_id ";
				   sql += " where e.salary >= ? ";
				   sql += " group by j.job_title ";
				   sql += " order by avg(e.salary) desc ";
			pst = conn.prepareStatement(sql);
			
			System.out.print("급여를 입력하시오  : ");
			String num = s.nextLine();
			pst.setString(1,num);
			
			ResultSet rs = pst.executeQuery();
			
			int cnt = 0;
			while(rs.next()) {
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
				cnt++;
			}
			
			System.out.println("총 [" + cnt + "]명이 검색되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pst!=null) {
				try {
					pst.close();
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
		

	}

}
