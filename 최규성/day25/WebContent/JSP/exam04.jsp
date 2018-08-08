<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num = 10;
	%>
	num: <%= num %> <br>
	<%!
		private String msg = "Hello";
	%>
	msg: <%= msg %>
	<Br>
	<%!
		public int getSum(int a, int b){
			int s = 0;
			for(int i = a; i<=b; i++){
				s = s + i;
				
			}
			return s;
			
		}
	%>
	
	1~10사이의 총합: <%=getSum(1,10) %><br>
</body>
</html>