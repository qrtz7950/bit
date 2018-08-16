<%@page import="util.dao.LoginDAO"%>
<%@page import="util.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	//객체 생성 및 초기화
	LoginVO loginVO = new LoginVO();
	loginVO.setId(id);
	loginVO.setPassword(password);
	
	// DB에서 로그인 수행
	LoginDAO dao = new LoginDAO();
	
	//반환값이 null이면 로그인 실패
	//반환값이 LoginVO객체면 로그인 성공
	LoginVO userVO = dao.login(loginVO);
	
	String msg = "";
	String url = "";
	if(userVO ==null){
		msg = "아이디 또는 패스워드가 잘못되었습니다";
		url = "login.jsp";
	} else{
		//세션 등록
		session.setAttribute("userVO",userVO);
		if(userVO.getType().equals("S")){
			msg="관리자님 환영합니다.";
		} else{
			msg= userVO.getId() +"님 환영합니다";
		}
	
		url = "/Mission-Web";
	}
	
	pageContext.setAttribute("msg", msg);
	pageContext.setAttribute("url", url);
	
%>

<script>
	<%-- alert('<%= msg %> '); --%>
	alert('${msg}');
	location.href = "${ url }";
</script>
