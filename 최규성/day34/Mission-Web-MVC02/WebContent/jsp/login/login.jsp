<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/jsp/include/topMenu.jsp"/>
	<h2>로그인</h2><Br>
	<form action="${pageContext.request.contextPath }/login/loginProcess.do" method="post">
			<table style="width:40%">
					<tr>
						<th>ID</th>
						<td><input type="text" name="id" size="20" autofocus></td>
					</tr>
					<tr>
						<th>Password</th>
						<td><input type="password" name="password" size="20"></td>
					</tr>
				</table>	
			<br>
		<input type="submit" value="로그인">		
	</form>
</body>
</html>