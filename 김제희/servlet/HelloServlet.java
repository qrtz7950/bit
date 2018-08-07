package kr.co.mlec.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet {
		
	public void init(ServletConfig config) throws ServletException {
		System.out.println("한번만 실행되는 메소드");
	}
	
	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException, IOException {
		System.out.println("실제 작업이 수행됨");
		System.out.println("사용자가 요청할 때마다 호출되는 메소드");
	}
	
	@Override
	public void destroy() {
		System.out.println("이젠 끝이야");
	}
	
	//이러한 메소드를 만들어도 보안 폴더에 생기게 떄문에 접근 불가라서 404에러가 뜬다
	//떄문에 가상의 경로로 매핑해주어야한다
	
}
