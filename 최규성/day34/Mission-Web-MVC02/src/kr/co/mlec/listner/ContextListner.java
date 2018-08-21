package kr.co.mlec.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.login.dao.LoginDAO;
import kr.co.mlec.login.service.LoginService;
import kr.co.mlec.member.dao.MemberDAO;
import kr.co.mlec.member.service.MemberService;

/**
 * Application Lifecycle Listener implementation class ContextListner
 *
 */
@WebListener
public class ContextListner implements ServletContextListener {


	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("리스너 종료...");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("리스너 시작...");
    	
    	ServletContext sc = event.getServletContext();
    	
    //	sc.setAttribute("boardDao", new BoardDAO());
    	BoardDAO boardDao = new BoardDAO();
    	sc.setAttribute("boardService", new BoardService(boardDao));
    	
    	LoginDAO loginDao = new LoginDAO();
    	LoginService loginService = new LoginService(loginDao);
    	sc.setAttribute("loginService", loginService);
    	
    	MemberDAO memberDao = new MemberDAO();
    	MemberService memberService = new MemberService(memberDao);
    	sc.setAttribute("memberService", new MemberService(memberDao));
    	
    }
	
}

























