package kr.co.mlec.board.control;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.framework.annotation.Controller;
import kr.co.mlec.framework.annotation.RequestMapping;

@Controller
public class BoardController {

	@RequestMapping(value="/board/list.do")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception{
		 
		System.out.println("전체 게시글 조회 메소드 호출....");
		
		ServletContext sc = request.getServletContext();
		
	//	BoardDAO dao = new BoardDAO();
		BoardService service = (BoardService)sc.getAttribute("boardService");
		List<BoardVO> boardList = service.selectAllBoard();
		
		ModelAndView mav = new ModelAndView();
		mav.setView("/jsp/board/list.jsp");
		mav.addAttribute("boardList", boardList);
		
		//request.setAttribute("boardList", boardList);
		
		return mav;
	}
	
	@RequestMapping("/board/write.do")
	public String write(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		System.out.println("새글등록 메소드 호출...");
		
		
		return null;
	}
}
