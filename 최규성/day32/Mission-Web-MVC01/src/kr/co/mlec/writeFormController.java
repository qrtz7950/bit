package kr.co.mlec;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class writeFormController {
	
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		return "/board/writeForm.jsp";
	}

}
