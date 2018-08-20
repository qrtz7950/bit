package kr.co.mlec;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class ListController {

	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		BoardDAO dao = new BoardDAO();
		
		List<BoardVO> list = dao.selectBoardList();
		
		request.setAttribute("list", list);	//응답이 오기까지 request영역에 올림
		
		return "/board/list.jsp";
	}
}
