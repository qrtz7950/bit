package kr.co.mlec.member.control;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.control.ModelAndView;
import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.framework.annotation.Controller;
import kr.co.mlec.framework.annotation.RequestMapping;
import kr.co.mlec.member.service.MemberService;
import kr.co.mlec.member.vo.MemberVO;

@Controller
public class MemberController {
	
	@RequestMapping("/member/memberlist.do")
	public ModelAndView memberlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		ServletContext sc = request.getServletContext();
		//ModelAndView mav = new ModelAndView("/jsp/member/memberList.jsp");
		
		MemberService service = (MemberService)sc.getAttribute("memberService");
		List<MemberVO> memberList = service.selectAllMember();
		
		ModelAndView mav = new ModelAndView();
		mav.setView("/jsp/member/memberList.jsp");
		mav.addAttribute("memberList", memberList);
		
		return mav;
	}
	
	
	@RequestMapping("/member/signup.do")
	public ModelAndView signUp(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		ServletContext sc = request.getServletContext();
		ModelAndView mav = new ModelAndView("/jsp/member/signUp.jsp");
		
		return mav;
	}
}
