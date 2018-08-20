package kr.co.mlec;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.login.dao.LoginDAO;
import kr.co.mlec.login.vo.LoginVO;

public class LoginProcessController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");

		//파라미터 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		//객체 초기화
		LoginVO loginVO = new LoginVO(id, password);
		
		//DAO에서 id, password에 해당 사용자 조회
		LoginDAO dao = new LoginDAO();
		LoginVO userVO = dao.login(loginVO);
		
		String msg = "";
		String url = "";
		
		if(userVO == null) {
			msg = "아이디 또는 패스워드가 잘못입력되었습니다";
			url = request.getContextPath() + "/login.do";
		} else {
			HttpSession session  = request.getSession();
			session.setAttribute("userVO", userVO);
			msg = userVO.getId() + " 님 환영합니다";
			url = request.getContextPath();
			//	url =  "/Mission-Web-MVC01";
			
		}
		//request영역에 등록
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		
		return "/login/loginProcess.jsp";
	}
	
	

}
