package kr.co.mlec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class MethodServlet extends HttpServlet {

//	@Override
//	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("써비스 몌쏘뜨 호쭐!");
//	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getMethod();
		StringBuffer url = req.getRequestURL();
		String uri = req.getRequestURI();
		System.out.println("겟방식");
		System.out.println("method : " + method);
		System.out.println("url : " + url);
		System.out.println("uri : " + uri);
		System.out.println("------------------------------");
		
		//이제 input태그를 통해 get 방식으로
		//http://localhost:8000/Lecture-Web/method?id=hong과 같은 정보가 날아온다
		//여기서 id의 정보를 서블릿을 이용하여 뽑아낼 수 있다
		//이런 정보들을 파라미터라고 한다
		
		String id = req.getParameter("id");
		System.out.println("id: " + id);
		
		//지금까지는 콘솔에 찍은건데 이러면 의미 없으니 다시 클라이언트로 넘기는 것을 알아보자
		
//		resp.setContentType("text/html");
		resp.setContentType("text/html; charset=utf-8");
		//한글 인식을 위해
		PrintWriter out = resp.getWriter();
		out.write("<HTML>");
		out.println("	<HEAD>");
		out.println("		<title>GET호출방식</title>");
		out.println("	</HEAD>");
		out.println("	<body>");
		out.println("---------------------------------------------<br>");
		out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;허억!<br>");
								// 한글은 깨짐 객체가 한글을 인식못하기 떄문
//		out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;print!<br>");
		out.println("---------------------------------------------<br>");
		out.println("파라미터(id) : " + id + "<br>");
		out.println("요청방식 : " + method + "<br>");
		out.println("URL : " + url.toString() + "<br>");
		out.println("URI : " + uri + "<br>");
		out.println("---------------------------------------------<br>");
		out.println("	</body>");
		out.print("</HTML>");
		//이제 소스에  <HTML></HTML>이 추가되었다
		
		out.flush();
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("****************************************");
		
		req.setCharacterEncoding("utf-8");
		//url에서 파라미터 값을 알수 없고 인코딩 차이로 날아오는 정보가 깨지기 때문에
		//날아오는 정보의 인코딩을 바꿔줘야한다
		//★★★포스트 방식에서는 해당 메소드가 꼭 호출되어야한다★★★ 
		
		String method = req.getMethod();
		StringBuffer url = req.getRequestURL();
		String uri = req.getRequestURI();
		
		System.out.println("포스트방식");
		System.out.println("method : " + method);
		System.out.println("url : " + url);
		System.out.println("uri : " + uri);
		
		System.out.println("------------------------------");
		
		String id = req.getParameter("id");
		System.out.println("id: " + id);
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.write("<HTML>");
		out.println("	<HEAD>");
		out.println("		<title>GET호출방식</title>");
		out.println("	</HEAD>");
		out.println("	<body>");
		out.println("---------------------------------------------<br>");
		out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;허억!<br>");
		out.println("---------------------------------------------<br>");
		out.println("파라미터(id) : " + id + "<br>");
		out.println("요청방식 : " + method + "<br>");
		out.println("URL : " + url.toString() + "<br>");
		out.println("URI : " + uri + "<br>");
		out.println("---------------------------------------------<br>");
		out.println("	</body>");
		out.print("</HTML>");
		
		out.flush();
		out.close();
	}
	
	
	

}
