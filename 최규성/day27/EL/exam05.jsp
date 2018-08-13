<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Map<String, String> b = new HashMap<>();	/* Map<객체명 자료형, 키 자료형> */
	b.put("no","1");
    b.put("title","test");
    
    pageContext.setAttribute("board", b);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	no: <%= b.get("no") %><BR>
	title: <%= b.get("title") %><Br>
	
	el no: ${ board.no }<Br>
	el title: ${ board.title }<Br>
	el aaa: ${ board.aaa }<Br>
</body>
</html>