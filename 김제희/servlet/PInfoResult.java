package kr.co.mlec.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pinfoResult")
public class PInfoResult extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String gender = req.getParameter("gender");
		String[] mail = req.getParameterValues("mail");
		String career = req.getParameter("career");
		
		String[] check = new String[3];
		
		for(int i = 0; i<3; i++) {
			check[i] = "받지않음";
		}
		try {
			for(int i =0; i<mail.length; i++) {
				switch (mail[i]) {
				case "notice":
					check[0] = "받음";
					break;
				case "ad":
					check[1] = "받음";
					break;
				case "express":
					check[2] = "받음";
					break;
				}
			}
		} catch (Exception e) {
		}
		
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("	<head>");
		sb.append("		<title>출력결과</title>");
		sb.append("	</head>");
		sb.append("	<body>");
		sb.append("<h1>개인 정보 출력</h1>");
		sb.append("이름 : " + name + "<br>");
		sb.append("아이디 : " + id + "<br>");
		sb.append("암호: " + pwd + "<br>");
		sb.append("성별 : " + gender + "<br>");
		sb.append("공지메일: " + check[0] + "<br>");
		sb.append("광고메일: " + check[1] + "<br>");
		sb.append("배송확인메일: " + check[2] + "<br>");
		sb.append("직업 : " + career + "<br>");
		sb.append("	</body>");
		sb.append("</html>");
		
		out.println(sb.toString());
		out.flush();
		out.close();
	}

}
