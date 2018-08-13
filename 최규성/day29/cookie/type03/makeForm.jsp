<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="set.jsp" method="post">
		쿠키이름: <input type="text" name="cName"><Br>
		쿠키값: <input type="text" name="cValue"><Br>
		유효시간(분) : <input type="text" name="cAge"><br>
		<input type="submit" value="쿠키설정">
	</form>
</body>
</html>