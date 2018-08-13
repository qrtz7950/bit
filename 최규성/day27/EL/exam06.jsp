<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] names = {"홍길동","강길동","한길동"};

	pageContext.setAttribute("name", names);

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	names[0] : <%= names[0] %><Br>
	names[1] : <%= names[1] %><Br>
	names[2] : <%= names[2] %><Br>
	<%-- names[3] : <%= names[3] %><Br> error--%>
	
	el names[0]: ${ name[0] }<br> 
	el names[1]: ${ name[1] }<br> 
	el names[2]: ${ name[2] }<br> 
	el names[3]: ${ name[3] }<br> 
</body>
</html>