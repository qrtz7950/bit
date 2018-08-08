package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/examMethod")
//@WebServlet(urlPatterns= {"/examMethod", "/examM"}) web.xml에 서블렛을 추가하지 않아도 @(어노테이션) 쓸수있다
public class Test extends HttpServlet{

// 	http://localhost:8888/Lecture-Web/examMethod?name=홍길동&hobby=read
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String[] hobbys = request.getParameterValues("hobby");
		
		System.out.println("name : " + name);
		System.out.println("hobby : " + Arrays.toString(hobbys));
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("	<head>");
		sb.append("		<title>출력결과</title>");
		sb.append("	</head>");
		sb.append("	<body>");
		sb.append("		이름: " + name + "<br>");
		sb.append("		취미: ");
		/*
		for(String hobby : hobbys) {
			sb.append(hobby + "&nbsp;&nbsp;");
		}
		*/
		for(int i = 0; i < hobbys.length; i++) {
			if(i !=0)
				sb.append(",&nbsp;");
			sb.append(hobbys[i]);
		}
		sb.append("	</body>");
		sb.append("</html>");
		
		out.println(sb.toString());
		out.flush();
		out.close();
		
		
/*		//스트링빌더보다 느림
		out.println("<HTML>");
		out.println("	<HEAD>");
		out.println("		<TITLE>Test</TITLE>");
		out.println("	</HEAD>");
		out.println("	<BODY>");
		out.println("		이름: "+ name + "<br>");
		//out.println("		취미: "+ Arrays.toString(hobby) + "<br>");
		out.println("		취미: ");
		for(String hobby : hobbys) {
			out.println(hobby + "&nbsp;&nbsp;");
		}
		out.println("	</BODY>");
		out.println("</HTML>");
		
		out.flush();
		out.close();*/
	}

}
