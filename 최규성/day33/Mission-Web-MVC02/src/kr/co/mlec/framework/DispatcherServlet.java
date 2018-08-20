package kr.co.mlec.framework;

import java.lang.reflect.Method;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.org.apache.bcel.internal.classfile.Method;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet(
		urlPatterns = { "*.do" }, 
		initParams = { 
				@WebInitParam(name = "controllers", value = "kr.co.mlec.board.control.BoardController|kr.co.mlec.login.control.LoginController")
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
		try {
			CtrlAndMethod cam = mappings.getCtrlAndMethod(uri);
			Object target = cam.getTarget();
			Method method = cam.getMethod();
			
			method.invoke(target, request, response); //target
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
