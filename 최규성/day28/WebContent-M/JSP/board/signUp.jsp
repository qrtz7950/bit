<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/Mission-Web/css/board.css" />
<script>
	
</script>
</head>
<body>
	<div align="center">
		<hr width="80%">
			<h2>회 원 가 입</h2>
		<hr width="80%">
		<br>
		<form action="signInfo.jsp" method="post">
			<table border="1" style="width: 80%";>
				<tr>
					<th>ID</th>
					<td>
						<input type="text" name="id">
					</td>
				</tr>
				<tr>
					<th>PASSWORD</th>
					<td>
							<input type="password" name="password">
					</td>
				</tr>
				<tr>
					<th>E-MAIL</th>
					<td>
							<input type="email" name="email">
					</td>
				</tr>
				<tr>
					<th>NAME</th>
					<td>
							<input type="text" name="name">
					</td>
				</tr>
				<tr>
					<th>PHONE</th>
					<td>
							<input type="text" name="phone">
					</td>
				</tr>
				<tr>
					<th>ADDR</th>
					<td>
						<input type="text" name="addr">			
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="가입">&nbsp;
			
		</form>
	</div>
</body>
</html>