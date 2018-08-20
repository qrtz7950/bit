package kr.co.mlec;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontControllerServlet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		String context = request.getContextPath(); //Mission-Web-MVC01을 context에 저장
		
		uri = uri.substring(context.length());
		System.out.println("호출된 uri : " + uri);
		
		System.out.println("context: " + context);
		
		try {
			String callPage = "";
			switch(uri) {
			case "/board/list.do" :
				System.out.println("게시판 목록처리");
				ListController listControl = new ListController();
				listControl.handleRequest(request,response);
				callPage = listControl.handleRequest(request, response);
				break;
				
			case "/board/writeForm.do" :
				writeFormController write = new writeFormController();
				callPage = write.handleRequest(request, response);
				break;
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(callPage);
			dispatcher.forward(request,response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
