package kr.co.mlec.login.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.framework.annotation.Controller;
import kr.co.mlec.framework.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login/login.do")
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		System.out.println("로그인 메소드 호출...");
		
		return null;
	}
}
