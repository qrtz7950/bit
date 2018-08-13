<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1 - 10 사이의 임의의 정수 출력</h2>
	
	<%
		//java.util.Random r = new Random();
		Random r= new Random();
		int random = r.nextInt(10) +1;
	%>
	추출된 정수: <%= random %><Br>
</body>
</html>