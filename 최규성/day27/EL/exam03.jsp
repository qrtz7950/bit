<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
	//객체 등록: 공유영역명.setAttribute("이름",값);
	//공유영역 4가지: pageContext, request, session, application
	pageContext.setAttribute("msg","page영역에 객체등록 ");

	//request영역에 "id"라는 이름으로 "hong"등록
	request.setAttribute("id","hong");
	
	request.setAttribute("msg", "request영역에 등록");
	
%>   

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	empty msg :${ empty msg}<Br>
	msg: ${ msg }<br>	<%--pageScope를 생략함  --%>
	id: ${id} <br> 
	
	<%--EL에서의 공유영역 4가지 : pageScope, requestScope, sessionScope, applicationScope --%>
	request msg: ${ requestScope.msg }<Br>
	
	<%
		pageContext.removeAttribute("msg");
	%>
	
	msg : <%= pageContext.getAttribute("msg") %><br>
	request msg: <%= request.getAttribute("msg") %><br>
</body>
</html>