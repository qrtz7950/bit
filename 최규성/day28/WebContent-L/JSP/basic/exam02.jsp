<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<H2> 1~10사이의 정수출력</H2>
	<%
		int sum = 0;
		for(int i = 1; i <=10 ; i++){
			//out.println(i + "<br>");
	%>
		<%= i %><br>	
	<%	
			sum = sum + i;
		}
		out.println("1~10사이의 총합: " + sum + "<Br>");
	%>
	1 - 10 사이의 총합:<%= sum %><br>
</body>
</html>