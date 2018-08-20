package kr.co.mlec;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontControllerServlet extends HttpServlet {
	
	private HandlerMapping mappings = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		String propName = config.getInitParameter("propName");
		System.out.println(propName);
		mappings = new HandlerMapping(propName);	//매번 try에서 호출하는것을 방지하기위해 1번만 호출하게한다
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		
		String context = request.getContextPath(); //Mission-Web-MVC01을 context에 저장
		
		String uri = request.getRequestURI();
		uri = uri.substring(context.length());
		System.out.println("context: " + context);
		System.out.println("호출된 uri : " + uri);
		
		try {
			Controller control = mappings.getController(uri);
			String callPage = control.handleRequest(request, response);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(callPage);
			dispatcher.forward(request,response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
