<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>forward test</h2>
	<form action="forwardSet.jsp">
		ID : <input type="text" name="id">
		<input type="submit" value="전송">
	</form>
	
	<h2>include test</h2>
	<form action="includeSet.jsp">
		ID : <input type="text" name="id">
		<input type="submit" value="전송">
	</form>
</body>
</html>