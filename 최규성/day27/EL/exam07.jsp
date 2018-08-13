<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<String> names = new ArrayList<>();
	names.add("홍길동");
	names.add("강길동");
	names.add("윤길동");
	
	pageContext.setAttribute("nameList", names);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	names[0]: <%= names.get(0) %><Br>
	names[1]: <%= names.get(1) %><Br>
	names[2]: <%= names.get(2) %><Br>
	<%-- names[3]: <%= names.get(3) %><Br> error--%>
	
	<Hr>
	el names[0] : ${nameList[0] }<br>
	el names[1] : ${nameList[1] }<br>
	el names[2] : ${nameList[2] }<br>
	el names[3] : ${nameList[3] }<br>
</body>
</html>