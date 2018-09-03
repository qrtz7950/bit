<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	<c:if test="${ not empty msg}">
		alert("${msg}");
	</c:if>
</script>
</head>
<body>
	<hr>
	<h2>로그인 페이지</h2>
	<hr>
	<br>
	<form action="${pageContext.request.contextPath }/login/login.do" method="post">
		<table style="width: 40%;" border="1">
			<tr>
				<th>ID</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>PASSWORD</th>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>