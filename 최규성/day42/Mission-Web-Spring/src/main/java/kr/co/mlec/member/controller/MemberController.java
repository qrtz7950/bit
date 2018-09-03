package kr.co.mlec.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mlec.member.service.MemberService;
import kr.co.mlec.member.vo.MemberVO;

//@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/login/login.do",method=RequestMethod.GET)
	public String login() {
		
		return "login/login";
	}
	
	@RequestMapping(value="/login/login.do",method=RequestMethod.POST)
	public String loginProcess(@ModelAttribute("member")MemberVO member, HttpSession session) {
	//	System.out.println(member.getId() + ":" + member.getPassword());
		
		MemberVO userVO = memberService.login(member);
		if(userVO == null) {
			return "redirect:/login/login.do";
		} else {
			//세션 등록후 메인페이지 이동
			session.setAttribute("userVO", userVO);
			return "redirect:/";
		}
	}
/*	@RequestMapping(value="/login/login.do",method=RequestMethod.POST)
	public void loginProcess(@RequestParam("id") String id,
			@RequestParam("password") String password) {
		
	}
*/
	@RequestMapping("/login/logout.do")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/";
	}
}
