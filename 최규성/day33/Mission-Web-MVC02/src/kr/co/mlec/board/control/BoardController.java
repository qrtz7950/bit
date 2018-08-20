package kr.co.mlec.board.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.framework.annotation.Controller;
import kr.co.mlec.framework.annotation.RequestMapping;

@Controller
public class BoardController {

	@RequestMapping(value="/board/list.do")
	public String list(HttpServletRequest request, HttpServletResponse response) throws Exception{
		 
		System.out.println("전체 게시글 조회 메소드 호출....");
		 
		
		return null;
	}
	
	@RequestMapping("/board/write.do")
	public String write(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		System.out.println("새글등록 메소드 호출...");
		
		
		return null;
	}
}
