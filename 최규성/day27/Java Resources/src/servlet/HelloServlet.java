package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("한번만 실행되는 메소드입니다");
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) 
				throws ServletException, IOException {
		System.out.println("실제 작업이 수행되는 메소드입니다");
		System.out.println("사용자가 요청할 때마다 호출되는 메소드입니다");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy메소드...");
	}
}













