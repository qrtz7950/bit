package kr.co.mlec.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/examMethod")
@WebServlet(urlPatterns={"/examMethod", "/examM"}) //URL 여러개
public class Methodexam extends HttpServlet{
	// 1. 어노테이션으로 매핑
	// 2. 파라미터 뽑기 2
	
	//http://localhost:8000/Lecture-Web/examMethod?name=hong&hobby=read&hobby=music&hobby=movie
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		//String hobby = req.getParameter("hobby");//파라미터가 여러개일때 맨앞의 한개만 받아오게됨
		String[] hobbys = req.getParameterValues("hobby");
		//파라미터가 여러개 일때는 배열
		
		System.out.println("name : " + name);
		System.out.println("hobby : " + Arrays.toString(hobbys));
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
//		out.println("<html>");
//		out.println(" <head>");
//		out.println("   <title>EXAM</title>");
//		out.println(" </head>");
//		out.println(" <body>");
//		out.println(" 이름 : " + name + "<br>");
//		out.print(" 취미 : ");
//		for(String hobby : hobbys) {
//			out.print(hobby + "&nbsp;&nbsp;");
//		}
//		out.println(" </body>");
//		out.println("</html>");
//
//		out.flush();
//		out.close();
		
		//근데 스트링 클래스쓰면 내용 변화때 마다 주소값을 다르게설정하여 메모리 낭비가 심하므로
		//웹에서 쓰기 적절한 Stringbuilder나 StringBuffer 클래스를 이용해보자
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("	<head>");
		sb.append("		<title>출력결과</title>");
		sb.append("	</head>");
		sb.append("	<body>");
		sb.append(" 이름 : " + name + "<br>");
		sb.append(" 취미 : ");

/*		
		for(String hobby : hobbys) {
			sb.append(hobby + "&nbsp;&nbsp;");
		}
*/		
		for(int i = 0; i < hobbys.length; i++) {
			if(i != 0)
			sb.append(",&nbsp;");
			sb.append(hobbys[i]);
		}
		
		sb.append("	</body>");
		sb.append("</html>");
		
		out.println(sb.toString());
		out.flush();
		out.close();
		
	}
	
	
}
