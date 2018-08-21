package kr.co.mlec.login.control;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.board.control.ModelAndView;
import kr.co.mlec.framework.annotation.Controller;
import kr.co.mlec.framework.annotation.RequestMapping;
import kr.co.mlec.login.service.LoginService;
import kr.co.mlec.login.vo.LoginVO;

@Controller
public class LoginController {

	@RequestMapping("/login/login.do")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		ModelAndView mav = new ModelAndView("/jsp/login/login.jsp");
		
		return mav;
	}
	
	@RequestMapping("/login/loginProcess.do")
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		LoginVO loginVO = new LoginVO(id, password);
		
		ServletContext sc = request.getServletContext();
		LoginService service = (LoginService)sc.getAttribute("loginService");
		LoginVO userVO = service.login(loginVO);
		System.out.println(userVO);
		
		ModelAndView mav = new ModelAndView();
		if(userVO == null) {
			mav.setView("redirect:" + request.getContextPath() + "/login/login.do");
		} else {
			mav.setView("redirect:" + request.getContextPath());
			//로그인 성공후 session영역에 등록
			HttpSession session = request.getSession();
			session.setAttribute("userVO", userVO);
		}
/*
		ModelAndView mav = new ModelAndView("/jsp/login/loginProcess.jsp");
		if(userVO ==null) {
			//로그인 실패
			mav.addAttribute("msg", "아이디 또는 패스워드가 잘못됐습니다");
			mav.addAttribute("url", request.getContextPath() + "/login/login.do");
		} else {
			//로그인 성공
			mav.addAttribute("msg", "로그인 되었습니다");
			mav.addAttribute("url", request.getContextPath());
		}
			
*/		
		return mav;
	}
	
	@RequestMapping("/login/logout.do")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		ModelAndView mav = new ModelAndView("redirect:" + request.getContextPath());
		return mav;
	}
}
