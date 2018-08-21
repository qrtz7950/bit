package kr.co.mlec.framework;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.control.ModelAndView;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet(
		urlPatterns = { "*.do" }, 
		initParams = { 
				@WebInitParam(name = "controllers", value = "kr.co.mlec.board.control.BoardController|kr.co.mlec.login.control.LoginController|kr.co.mlec.member.control.MemberController")
		})	//컨트롤러와 메소드를 value뒤에 추가하여 적기만하면된다
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HandlerMapping mappings;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		String ctrlNames = config.getInitParameter("controllers");
		try {
			mappings = new HandlerMapping(ctrlNames);
		} catch(Exception e) {
			throw new ServletException(e);
		}
	}

	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("서비스 호출...");
		String uri = request.getRequestURI();
		uri = uri.substring(request.getContextPath().length());
		
		System.out.println(uri);
		
		String view="";
		try {
			CtrlAndMethod cam = mappings.getCtrlAndMethod(uri);
			
			if(cam == null) {
				throw new Exception("요청하신 URL은 존재하지 않습니다.");
			}
			Object target = cam.getTarget();
			Method method = cam.getMethod();
			
			ModelAndView mav = (ModelAndView)method.invoke(target, request, response); //target
			
			//1. model객체 추출후 request공유영역 등록
			Map<String, Object> model = mav.getModel();
			Set<String> keys = model.keySet();
			for(String key : keys) {
				request.setAttribute(key, model.get(key));
			}
			
			view = mav.getView();
			
		} catch(Exception e) {
	//		e.printStackTrace();
			request.setAttribute("exception", e);
			view = "/jsp/error/error.jsp";
		//	view = "/error";
		}
		
		//2. 해당 JSP 이동
		if(view.startsWith("redirect:")) {
			//sendRedirect
			response.sendRedirect(view.substring("redirect:".length()));
		} else {
			//forward
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}
	}

}





























