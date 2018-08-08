package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MethodServlet extends HttpServlet{

	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");	//포스트방식에서 한글이 깨지기 때문에 써줌
		
		
		System.out.println("post방식 호출...");
		String method = request.getMethod();
		StringBuffer url = request.getRequestURL();
		String uri = request.getRequestURI();
		String id = request.getParameter("id");//name이 id인 놈을 갖고옴
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("	<HEAD>");
		out.println("		<TITLE>Get방식 호출</TITLE>");
		out.println("	</HEAD>");
		out.println("	<BODY>");
		out.println("------------------------------------<Br>");
		out.println("출력결과<Br>");
		out.println("------------------------------------<Br>");
		out.println("파라미터(id) : " + id + "<br>");
		out.println("요청방식 : " + method + "<br>");
		out.println("URL : " + url.toString() + "<br>");
		out.println("URI : " + uri + "<br>");
		out.println("------------------------------------<Br>");
		out.println("	</BODY>");
		out.println("</HTML>");
		
		out.flush();
		out.close();
	}
	
	//http://localhost:8888/Lecture-Web/method?id=hong 요청했다는 가정
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String method = request.getMethod();
		StringBuffer url = request.getRequestURL();
		String uri = request.getRequestURI();
		String id = request.getParameter("id");//name이 id인 놈을 갖고옴
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("	<HEAD>");
		out.println("		<TITLE>Get방식 호출</TITLE>");
		out.println("	</HEAD>");
		out.println("	<BODY>");
		out.println("------------------------------------<Br>");
		out.println("출력결과<Br>");
		out.println("------------------------------------<Br>");
		out.println("파라미터(id) : " + id + "<br>");
		out.println("요청방식 : " + method + "<br>");
		out.println("URL : " + url.toString() + "<br>");
		out.println("URI : " + uri + "<br>");
		out.println("------------------------------------<Br>");
		out.println("	</BODY>");
		out.println("</HTML>");
		
		out.flush();
		out.close();
	
/*		
		System.out.println("get방식 호출...");
		System.out.println("Method: " + method);
		System.out.println("URL: " + url.toString());
		System.out.println("URI: " + uri);
		System.out.println("ID: " + id);
*/
	}

		
		
/*
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("시스템 메소드 호출");
	}
*/	


}