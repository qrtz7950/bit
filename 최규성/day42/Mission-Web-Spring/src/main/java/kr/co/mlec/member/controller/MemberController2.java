package kr.co.mlec.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.mlec.member.service.MemberService;
import kr.co.mlec.member.vo.MemberVO;

//@Controller
public class MemberController2 {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/login/login.do",method=RequestMethod.GET)
	public String login() {
		
		return "login/login";
	}
	
	@RequestMapping(value="/login/login.do",method=RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute("member")MemberVO member, HttpSession session) {
	//	System.out.println(member.getId() + ":" + member.getPassword());
		
		ModelAndView mav = new ModelAndView();
		
		MemberVO userVO = memberService.login(member);
		if(userVO == null) {
			mav.addObject("msg", "아이디 또는 패스워드가 잘못되었습니다");
			mav.setViewName("login/login");
		} else {
			//세션 등록후 메인페이지 이동
			session.setAttribute("userVO", userVO);
			mav.setViewName("redirect:/");
		}
		return mav;
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
