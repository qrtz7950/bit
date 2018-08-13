<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Cookie[] cookies = request.getCookies();

	StringBuilder sb = new StringBuilder();
	if(cookies == null){
		sb.append("설정된 쿠키정보가 없습니다");
	} else{
		for(Cookie c : cookies) {
			String cName = c.getName();
			String cValue = c.getValue();
			
			//decoding
			cName = URLDecoder.decode(cName,"utf-8");
			cValue = URLDecoder.decode(cValue,"utf-8");
			
			sb.append("쿠키이름: " + cName + ", ");
			sb.append("쿠키값: " + cValue + "<Br> ");
		}
	}
	
	pageContext.setAttribute("sb", sb.toString());
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<H2> 설정된 쿠키 정보 </H2>
	<%=  sb.toString() %>
	<%-- ${ sb } --%>
	
	<a href="remove.jsp">쿠키 삭제</a>
</body>
</html>